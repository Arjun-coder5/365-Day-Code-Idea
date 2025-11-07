import java.util.*;

public class LC_75 {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int t = nums[low]; 
                nums[low++] = nums[mid];
                 nums[mid++] = t;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int t = nums[mid];
                 nums[mid] = nums[high];
                  nums[high--] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
