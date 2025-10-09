import java.util.*;

public class LC16_ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        // Step 2: Initialize closestSum with first possible triplet
        int closestSum = nums[0] + nums[1] + nums[2];

        // Step 3: Fix one number and use two pointers
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Step 4: If this sum is closer to target, update it
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Step 5: Move pointers
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // Exact match found — best possible answer
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        // ✅ Test Case 1
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest Sum: " + threeSumClosest(nums1, target1)); 
        // Output: 2

        // ✅ Test Case 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest Sum: " + threeSumClosest(nums2, target2)); 
        // Output: 0

        // ✅ Test Case 3
        int[] nums3 = {1, 1, 1, 0};
        int target3 = -100;
        System.out.println("Closest Sum: " + threeSumClosest(nums3, target3)); 
        // Output: 2

        // ✅ Test Case 4
        int[] nums4 = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target4 = -2;
        System.out.println("Closest Sum: " + threeSumClosest(nums4, target4)); 
        // Output: -2 (exact match)

        // ✅ Test Case 5
        int[] nums5 = {1, 2, 4, 8, 16, 32, 64, 128};
        int target5 = 82;
        System.out.println("Closest Sum: " + threeSumClosest(nums5, target5)); 
        // Output: 82
    }
}
