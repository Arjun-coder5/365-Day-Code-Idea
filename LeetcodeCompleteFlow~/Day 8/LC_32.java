import java.util.Stack;

public class LC_32 {
    public static void main(String[] args) {
        String s1 = "(()())";
        System.out.println(longestValidParentheses(s1)); // Output: 6
    }

    static int longestValidParentheses(String s) {
      Stack<Integer> stack = new Stack<>();
    //   Base for valid String :
      stack.push(-1);
      int maxLen = 0;
      for(int i = 0;i<s.length();i++){
        if(s.charAt(i)=='('){
            stack.push(i);
        }else{
            stack.pop();
            if(stack.isEmpty()){
                stack.push(i); //New Base :
            }else{
               maxLen = Math.max(maxLen,i-stack.peek());
            }
        }
      }
      return maxLen;
    }
}
