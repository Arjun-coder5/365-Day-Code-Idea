public class Ques_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {3, 6, 1, 0};
        System.out.println(sol.dominantIndex(nums1)); 

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(sol.dominantIndex(nums2));
    }
}

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int max_idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                max_idx = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != max_idx) {
                if (max < 2 * nums[i]) {
                    return -1;
                }
            }
        }

        return max_idx;
    }
}