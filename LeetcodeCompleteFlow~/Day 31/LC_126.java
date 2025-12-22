import java.util.*;

public class LC_126 {

    public static List<List<String>> findLadders(
            String beginWord, String endWord, List<String> wordList) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, Set<String>> reverse = new HashMap<>();

        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return ans;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        boolean foundEnd = false;
        wordSet.remove(beginWord);

        // BFS
        while (!queue.isEmpty() && !foundEnd) {
            int size = queue.size();
            Set<String> nextLevel = new HashSet<>();

            for (int k = 0; k < size; k++) {
                String word = queue.poll();
                char[] arr = word.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == old) continue;
                        arr[i] = c;
                        String next = new String(arr);

                        if (wordSet.contains(next)) {
                            reverse
                                .computeIfAbsent(next, x -> new HashSet<>())
                                .add(word);

                            if (next.equals(endWord)) {
                                foundEnd = true;
                            }
                            nextLevel.add(next);
                        }
                    }
                    arr[i] = old;
                }
            }

            queue.addAll(nextLevel);
            wordSet.removeAll(nextLevel); // important pruning
        }

        if (!foundEnd) return ans;

        // Backtracking
        LinkedList<String> path = new LinkedList<>();
        path.add(endWord);
        backtrack(endWord, beginWord, reverse, ans, path);

        return ans;
    }

    private static void backtrack(
            String word,
            String beginWord,
            Map<String, Set<String>> reverse,
            List<List<String>> ans,
            LinkedList<String> path) {

        if (word.equals(beginWord)) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (!reverse.containsKey(word)) return;

        for (String prev : reverse.get(word)) {
            path.addFirst(prev);
            backtrack(prev, beginWord, reverse, ans, path);
            path.removeFirst();
        }
    }

    // ------------------ MAIN METHOD ------------------
    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList(
                "hot", "dot", "dog", "lot", "log", "cog"
        );

        List<List<String>> result = findLadders(beginWord, endWord, wordList);

        for (List<String> path : result) {
            System.out.println(path);
        }
    }
}
