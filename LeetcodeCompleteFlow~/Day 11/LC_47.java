
import java.util.ArrayList;
import java.util.Arrays;

public class LC_47 {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    ArrayList<ArrayList<Integer>> ans = permuteUnique(arr);
    System.out.println(ans);
  }
  public static ArrayList<ArrayList<Integer>> permuteUnique(int[] arr)
 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[arr.length];
    ArrayList<Integer> path = new ArrayList<>();
    Arrays.sort(arr);
   backtrack(arr,path,used,result);
    return result;
 }
   public static void backtrack(int[] arr, ArrayList<Integer> path, boolean[] used, ArrayList<ArrayList<Integer>> result){
   if (path.size() == arr.length) {
      result.add(new ArrayList<>(path));
      return;
    }
    for(int i = 0;i<arr.length;i++){
      if(used[i])continue;
      if(i>0 && arr[i]==arr[i-1]&&!used[i-1]){
         continue;
    }
    used[i]=true;
    path.add(arr[i]);
    backtrack(arr, path, used, result);
    path.remove(path.size()-1);
    used[i] = false;

    }
   
   }
}
