public class LC_58 {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        int len = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
    public static void main(String[] args) {
        String s = "Hello World  ";
        System.out.println(lengthOfLastWord(s));
    }
}
