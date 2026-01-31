import java.util.*;

public class Ques_1 {

    public static char findTheDifference(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return b[i];
            }
        }

        return b[b.length - 1];
    }


    // ✅ MAIN METHOD
    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char ans = findTheDifference(s, t);

        System.out.println("Added character: " + ans);
    }
}
