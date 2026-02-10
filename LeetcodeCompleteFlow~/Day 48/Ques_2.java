public class Ques_2{
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int n = nums.length;
    int ans[] = new int[n];
    int evenPointer = 0;
    int oddPointer = 1;
   for(int i = 0;i<n-1;i++){
      if(nums[i]%2==0){
        ans[evenPointer]=nums[i];
        evenPointer+=2;
      }else if(nums[i]%2!=0){
        ans[oddPointer] = nums[i];
        oddPointer+=2;
      }
   }
    for(int i : nums){
     System.out.println(i+" ");
    }
    }
  
}