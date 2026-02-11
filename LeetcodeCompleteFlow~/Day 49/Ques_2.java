import java.util.*;

public class Ques_2 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0, r = n - 1, pos = n - 1;

        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[pos--] = nums[l] * nums[l];
                l++;
            } else {
                res[pos--] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
