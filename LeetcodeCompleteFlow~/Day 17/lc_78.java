import java.util.*;

public class lc_78 {
  public static void main(String[] args) {
    int num[] = {1,2,3,4,5};
    List<List<Integer>> result =  subsets(num);
    System.out.println(result);
  }
  public static List<List<Integer>> subsets(int[] nums){
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums,0,new ArrayList<>(), result);
    return result;
  } 
  public static void backtrack(int[] nums,int index,List<Integer> current,List<List<Integer>> result){
    // Base Case :

     if(index==nums.length){
      result.add(new ArrayList<>(current));
      return;
     }
      backtrack(nums, index+1, current, result);
      current.add(nums[index]);
      backtrack(nums, index+1, current, result);
       current.remove(current.size()-1);

  }
}
