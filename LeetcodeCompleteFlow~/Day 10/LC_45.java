public class LC_45 {
  public static void main(String[] args) {
    int[] nums = {2,3,1,1,4};
    System.out.println(jump(nums)); // Output: 2
  }

  public static int jump(int[] nums) {
    int jumps = 0, end = 0, farthest = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      farthest = Math.max(farthest, i + nums[i]);
      if (i == end) {
        jumps++;
        end = farthest;
      }
    }
    return jumps;
  }
}
