import java.util.Arrays;

public class Ques_1{
  public static void main(String[] args) {
      int nums[] = {1,4,3,2};
      Ques_1 obj = new Ques_1();
      int result = obj.arrayPairSum(nums);
      System.out.println("The maximum sum of min(ai, bi) is: " + result);
  }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min  = 0;
        for(int i = 0;i<n;i+=2){
                min += Math.min(nums[i],nums[i+1]);
            }
        return min;
    }
}
