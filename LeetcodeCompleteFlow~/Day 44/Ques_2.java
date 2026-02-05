
import java.util.Arrays;

public class Ques_2 {

    public static void main(String[] args) {
        int nums[] = {6, 2, 6, 5, 1, 2};
        fxn(nums);

        Ques_2 obj = new Ques_2();
    }

    public static int fxn(int nums[]) {
        int n = nums.length;
        Arrays.sort(nums);
        int prevCount = 0;
        int currCount = 1;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
          if(nums[i]==nums[i-1]){
            currCount++;
          }
        }
        return ans;
    }
}
