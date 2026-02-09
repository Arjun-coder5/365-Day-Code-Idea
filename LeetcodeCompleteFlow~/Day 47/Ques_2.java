public class Ques_2 {
  public static void main(String[] args) {
    int[]nums = {1,2,3,4,5};
    sortArrayByParity(nums);
  }
    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }
        
        return result;
    }
}