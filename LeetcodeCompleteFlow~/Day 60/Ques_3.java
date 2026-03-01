import java.util.Arrays;

public class Ques_3 {
  public static void main(String[] args) {
    
  }
    public int maximumGap(int[] nums) {
       
        Arrays.sort(nums);
        int mini = 0;
        int n = nums.length;
         if(n<2)return 0;
        for(int i = 0;i<n-1;i++){
            mini = Math.max(mini,nums[i+1]-nums[i]);
        }
        return mini;
    }
}
