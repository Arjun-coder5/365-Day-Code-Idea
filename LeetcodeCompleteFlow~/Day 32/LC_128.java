import java.util.*;

public class LC_128 {
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int longest = 0;

        for (int x : set) {
            if (!set.contains(x - 1)) { // start of sequence
                int curr = x;
                int len = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(longestConsecutive(nums));
    }
}
