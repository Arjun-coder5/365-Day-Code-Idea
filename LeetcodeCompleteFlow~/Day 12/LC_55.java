  public class LC_55 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));  // true
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;  // we are stuck
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
