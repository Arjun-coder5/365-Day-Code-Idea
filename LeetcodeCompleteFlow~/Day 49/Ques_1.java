import java.util.*;

public class Ques_1 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int x : nums) {
            sum += x;
            min = Math.min(min, x);
        }

        if (k % 2 == 1) {
            sum -= 2 * min;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, -3, -1, 5, -4};
        int k = 2;
        System.out.println(largestSumAfterKNegations(nums, k));
    }
}
