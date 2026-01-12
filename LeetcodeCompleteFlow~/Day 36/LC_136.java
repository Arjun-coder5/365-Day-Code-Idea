public class LC_136 {
    public static  int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
      int arr[] = {1,1,2,3,3,3};
      singleNumber(arr);
    }
}

// xor - property -  a^0 = a  and a^a = 0;
//  in this ques the number who is more than one time is getting zero and and single one is geetting stored in ans variable .
