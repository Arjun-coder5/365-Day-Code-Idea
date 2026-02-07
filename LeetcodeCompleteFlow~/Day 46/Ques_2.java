public class Ques_2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 2, 4};
        int[] res1 = sol.findErrorNums(nums1);
        System.out.println("[" + res1[0] + "," + res1[1] + "]");

        int[] nums2 = {1, 1};
        int[] res2 = sol.findErrorNums(nums2);
        System.out.println("[" + res2[0] + "," + res2[1] + "]");
    }
}

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int duplicate = -1;
        int missing = -1;

        for (int x : nums) {
            count[x]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}