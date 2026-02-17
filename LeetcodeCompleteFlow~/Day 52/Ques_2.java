import java.util.*;
public class Ques_2 {
  public static void main(String[] args) {
    int[] arr={1,4,3,2};
    minimumAbsDifference(arr);
  }
    public static  List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            mindiff = Math.min(mindiff,Math.abs(arr[i+1]-arr[i]));
        }
        for(int i=0;i<arr.length-1;i++){
        if(arr[i+1] - arr[i] == mindiff ){
            ans.add(Arrays.asList(arr[i],arr[i+1]));
        }
        } 
        return ans;
    }
}