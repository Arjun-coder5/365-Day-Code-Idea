import java.util.*;

public class LC_89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(grayCode(n)); // [0, 1, 3, 2]
    }
}
