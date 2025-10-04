
import java.util.Arrays;

public class lc_1{

// Fxn to find two sum :
     public static int[] twoSum(int[] nums, int target) {
      int n = nums.length;
        for(int i = 0;i<n;i++){
          for(int j = i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
              return new int[]{i,j};
            }
          }
        }
        return new int[] {};
     }
   public static void main(String[] args) {
/*   
         Problem   : You need to find indices of two numbers in the array such that they add up to target   


       Given : 1. An array of integers nums.
               2. An integer target
*/
/* 
    Constraints:

     - Only one valid solution exists.

     - You cannot use the same element twice.

     - Return the indices in any order. 
*/

 /* 
nums = [2,7,11,15], target = 9
Output: [0,1] // because 2 + 7 = 9
 */



/* 
 Approach 1 :  Iterative :
                  - Loop through each element i
                  - loop through each element after i,j
                  - check if nums[i] + nums[j] == target
                  - return [i,j]

                 - Work but ineffecient for large arrays
 */
/* 
 Steps:
      -Loop i from 0 to nums.length - 1.
      -Loop j from i+1 to nums.length - 1.
      -Check if nums[i] + nums[j] == target.
      -If yes, return [i, j].
      -Time Complexity: O(n²)
      -Space Complexity: O(1) (no extra space needed)
 */
    // Code :
    int[] nums = {2,7,11,15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}