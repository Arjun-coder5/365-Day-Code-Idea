import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If closing bracket but stack empty → invalid
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check for mismatched brackets
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty if all matched
        return stack.isEmpty();
    }
}

public class LC_20  {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([{}])";
        String s4 = "([)]";

        System.out.println(s1 + " → " + sol.isValid(s1)); // true
        System.out.println(s2 + " → " + sol.isValid(s2)); // false
        System.out.println(s3 + " → " + sol.isValid(s3)); // true
        System.out.println(s4 + " → " + sol.isValid(s4)); // false
    }
}
