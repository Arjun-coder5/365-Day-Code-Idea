public class lc_76{
 public static void main(String[] args) {
  String s  = "ABOBECODEBANC";
  String t = "ABC";
 String ans =  minWindow(s,t);
 System.out.println(ans);

 }
    public static  String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                if (containsAll(sub, t)) {
                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    private static boolean containsAll(String sub, String t) {
        int[] freq = new int[128];  // ASCII

        for (char c : sub.toCharArray()) {
            freq[c]++;
        }

        for (char c : t.toCharArray()) {
            if (freq[c] == 0) return false;
            freq[c]--;
        }
        return true;
    }
}