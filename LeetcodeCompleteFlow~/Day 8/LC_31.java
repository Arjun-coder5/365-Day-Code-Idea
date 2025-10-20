import java.util.Arrays;
public class LC_31{
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    int n = arr.length;
    nextPermutation(arr);
    System.out.println("Next Permutation: " + Arrays.toString(arr));
  }
   public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0) {
            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        reverse(nums, i+1);
    }
    
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}