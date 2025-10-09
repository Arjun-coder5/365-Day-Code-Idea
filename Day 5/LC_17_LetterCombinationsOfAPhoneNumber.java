import java.util.*;

public class LC_17_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        // Create an object of the Solution class
        Solution sol = new Solution();

        // Input digits (you can change this to test other cases)
        String digits = "23";

        // Function call to get all combinations
        List<String> result = sol.letterCombinations(digits);

        // Print input and output
        System.out.println("Input: " + digits);
        System.out.println("Output: " + result);
    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // Base condition: if no digits, return empty list
        if (digits == null || digits.length() == 0) return result;

        // Mapping from digits to corresponding letters
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        // Start backtracking
        backtrack(result, map, digits, 0, new StringBuilder());
        return result;
    }

    // Recursive backtracking function
    public static void backtrack(List<String> result, Map<Character, String> map, String digits, int index, StringBuilder current) {
        // Base Case: if index reaches end, add combination
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Recursive Case: get letters for the current digit
        String letters = map.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch); // choose
            backtrack(result, map, digits, index + 1, current); // explore
            current.deleteCharAt(current.length() - 1); // un-choose (backtrack)
        }
    }
}
