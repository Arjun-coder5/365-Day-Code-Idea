// 🔹 LeetCode 22: Generate Parentheses
// Approach: Backtracking

import java.util.*;

public class LC_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, String cur, int open, int close, int n) {
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }

        if (open < n) backtrack(ans, cur + "(", open + 1, close, n);
        if (close < open) backtrack(ans, cur + ")", open, close + 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println("All valid parentheses for n = " + n + ":");
        for (String s : result) System.out.println(s);
    }
}
