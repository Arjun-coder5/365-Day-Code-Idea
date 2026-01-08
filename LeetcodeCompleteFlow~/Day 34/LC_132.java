import java.util.Arrays;

public class LC_132 {

    /**
     * Calculates the minimum cuts required for a string to be partitioned into palindromes.
     *
     * @param s The input string.
     * @return The minimum number of cuts.
     */
    public int minCut(String s) {
        int n = s.length();
        // dp[i] represents the minimum cuts needed for the substring s[i...n-1]
        int[] dp = new int[n];
        // isPalindrome[i][j] is true if the substring s[i...j] is a palindrome
        boolean[][] isPalindrome = new boolean[n][n];

        // Initialize dp array with the worst case (n-1 cuts)
        Arrays.fill(dp, n - 1);

        // Iterate from right to left to fill the dp and isPalindrome tables
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                // Check if s[i...j] is a palindrome
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || isPalindrome[i + 1][j - 1])) {
                    isPalindrome[i][j] = true;

                    // If it is a palindrome, update dp[i]
                    if (j == n - 1) {
                        // If s[i...n-1] is the whole remaining string, no more cuts needed from this point
                        dp[i] = 0;
                    } else {
                        // Otherwise, current cut + min cuts for the remaining part (s[j+1...n-1])
                        dp[i] = Math.min(dp[i], 1 + dp[j + 1]);
                    }
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "aab";
        System.out.println("Minimum cuts for \"" + s1 + "\": " + sol.minCut(s1)); // Output: 1 (["aa", "b"])

        String s2 = "racecar";
        System.out.println("Minimum cuts for \"" + s2 + "\": " + sol.minCut(s2)); // Output: 0 (["racecar"])

        String s3 = "ab";
        System.out.println("Minimum cuts for \"" + s3 + "\": " + sol.minCut(s3)); // Output: 1 (["a", "b"])

        String s4 = "amanaplanacanalpanama";
        System.out.println("Minimum cuts for \"" + s4 + "\": " + sol.minCut(s4)); // Output: 0
    }
}
