class lc_10 {
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 2; j <= n; j += 2) {
            if (p.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 2];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || 
                               (matches(s, p, i, j - 1) && dp[i - 1][j]);
                } else {
                    dp[i][j] = matches(s, p, i, j) && dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }

    private static boolean matches(String s, String p, int i, int j) {
        if (i == 0) return false;
        if (p.charAt(j - 1) == '.') return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println("Regex Match: " + isMatch(s, p));
    }
}
