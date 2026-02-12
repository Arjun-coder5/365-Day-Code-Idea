import java.util.*;

class Ques_1 {
  public static void main(String[] args) {
      int nums[] = {1,2,3,4,5};
      int k = 2;
     int ans =  findKthLargest(nums,k);
     System.out.println(ans);
  }
  
    public static int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
