import java.util.*;

public class lc_68 {
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i, len = 0;
            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth)
                len += words[j++].length();
            int space = maxWidth - len;
            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int even = space / gaps, extra = space % gaps;
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < even + (extra-- > 0 ? 1 : 0); s++) sb.append(" ");
                    }
                }
            }
            res.add(sb.toString());
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(fullJustify(words, 16));
    }
}
