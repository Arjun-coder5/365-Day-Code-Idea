import java.util.Arrays;

class Ques_1 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int ans = maximumProduct(nums);
    System.out.println(ans);
  }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int option1 = nums[n-1] * nums[n-2] * nums[n-3];
        int option2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(option1, option2);
    }
}
