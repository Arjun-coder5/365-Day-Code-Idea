import java.util.*;
public class LC_60 {
    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) fact[i] = fact[i - 1] * i;
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int idx = k / fact[i - 1];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k %= fact[i - 1];
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
    }
}
