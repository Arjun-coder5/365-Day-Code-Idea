public class LC65_ValidNumber {
    public static boolean isNumber(String s) {
        s = s.trim();
        boolean numSeen = false, dotSeen = false, eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                numSeen = true;
            } else if (c == '.') {
                if (dotSeen || eSeen) return false;
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numSeen = false; // must see a number after e
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            } else {
                return false;
            }
        }
        return numSeen;
    }

    public static void main(String[] args) {
        String[] tests = {"2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "1e", "e3", "99e2.5"};
        for (String s : tests) {
            System.out.println(s + " -> " + isNumber(s));
        }
    }
}
