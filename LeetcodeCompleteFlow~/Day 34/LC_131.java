import java.util.ArrayList;
import java.util.List;

public class LC_131 {

    /**
     * Main method to demonstrate the Palindrome Partitioning solution.
     */
    public static void main(String[] args) {
        PalindromePartitioning solution = new PalindromePartitioning();
        String input1 = "aab";
        System.out.println("Input: s = \"" + input1 + "\"");
        List<List<String>> result1 = solution.partition(input1);
        System.out.println("Output: " + result1);
        // Expected Output: [["a","a","b"],["aa","b"]]

        String input2 = "racecar";
        System.out.println("\nInput: s = \"" + input2 + "\"");
        List<List<String>> result2 = solution.partition(input2);
        System.out.println("Output: " + result2);
    }

    /**
     * LeetCode 131 Solution method.
     * Partitions the given string into all possible palindrome substrings.
     * 
     * @param s The input string.
     * @return A list of lists of strings, where each inner list is a valid palindrome partition.
     */
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), result);
        return result;
    }

    /**
     * Depth First Search (backtracking) helper function.
     */
    private void dfs(String s, int startIndex, List<String> currentPartition, List<List<String>> result) {
        // Base case: If we have processed the entire string, add the current partition to the results.
        if (startIndex == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        // Iterate through all possible end indices for the current substring
        for (int i = startIndex; i < s.length(); i++) {
            // Check if the substring from startIndex to i is a palindrome
            if (isPalindrome(s, startIndex, i)) {
                // If it is, add it to the current partition
                currentPartition.add(s.substring(startIndex, i + 1));
                // Recurse to find partitions for the remaining string
                dfs(s, i + 1, currentPartition, result);
                // Backtrack: remove the last added substring to explore other partitions
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    /**
     * Helper function to check if a substring is a palindrome.
     */
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
