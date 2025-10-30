
import java.util.ArrayList;
import java.util.List;

public class LC_46{
  public static void main(String[] args) {
      // Permutation in array : print all possibles :
      // 1 - BackTrack Logic :
      int[] arr = {1,2,3};
     ArrayList<ArrayList<Integer>> ans =  permute(arr);
     System.out.println(ans);

  }
  public static ArrayList<ArrayList<Integer>> permute(int[] arr){
   ArrayList<ArrayList<Integer>> result = new ArrayList<>();
   boolean[] used = new boolean[arr.length];
   ArrayList<Integer> path = new ArrayList<>();
   BackTrack(arr,path,used,result);
   return result;
  }
   public static void BackTrack(int[] arr,ArrayList<Integer> path,boolean [] used , ArrayList<ArrayList<Integer>> result) {
      //  Base Case :
      if(path.size()==arr.length){
      result.add(new ArrayList<>(path));
      return;
      }
      for(int i = 0;i<arr.length;i++){
        if(used[i])continue;
        used[i] = true;
        path.add(arr[i]);
        BackTrack(arr, path, used, result);
        path.remove(path.size()-1);
        used[i] = false;
      }
   }
  //  2. Swapping Logic :
     static void helper(int[] arr, int start, List<List<Integer>> result) {
    if (start == arr.length) {
      List<Integer> temp = new ArrayList<>();
      for (int num : arr) temp.add(num);
      result.add(temp);
      return;
    }
    for (int i = start; i < arr.length; i++) {
      swap(arr, start, i);
      helper(arr, start + 1, result);
      swap(arr, start, i); // backtrack
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}