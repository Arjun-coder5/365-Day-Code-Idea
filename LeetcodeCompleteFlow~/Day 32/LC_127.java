import java.util.*;

public class LC_127 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String word = q.poll();
                char[] arr = word.toCharArray();

                for (int j = 0; j < arr.length; j++) {
                    char old = arr[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String next = new String(arr);

                        if (next.equals(endWord)) {
                            return level + 1;
                        }

                        if (dict.contains(next)) {
                            q.offer(next);
                            dict.remove(next); // visited
                        }
                    }
                    arr[j] = old;
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String beginWord = sc.next();
        String endWord = sc.next();
        int n = sc.nextInt();

        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wordList.add(sc.next());
        }

        System.out.println(ladderLength(beginWord, endWord, wordList));
    }
}
