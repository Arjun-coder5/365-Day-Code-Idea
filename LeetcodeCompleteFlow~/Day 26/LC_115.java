import java.util.*;

public class LC_115 {

    public static int numDistinct(String s, String t) {
        int m = t.length();
        long[] dp = new long[m + 1];

        dp[0] = 1; // empty t can always be formed
        
        for (char c : s.toCharArray()) {
            for (int j = m - 1; j >= 0; j--) {
                if (c == t.charAt(j)) {
                    dp[j + 1] += dp[j];
                }
            }
        }
        return (int) dp[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(numDistinct(s, t));
    }
}
