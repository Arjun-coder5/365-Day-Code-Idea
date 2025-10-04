class lc_8 {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, n = s.length();
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String s = "   -42";
        System.out.println("String to Integer: " + myAtoi(s));
    }
}
