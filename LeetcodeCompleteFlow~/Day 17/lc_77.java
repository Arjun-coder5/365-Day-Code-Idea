import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class lc_77 {
  static  List<List<Integer>> result = new ArrayList<>();
  static int n = 4;
  static int k = 2;
 public static void main(String[] args) {
  // Combinationas :
  
  backtrack(1,new ArrayList<>());

  System.out.println(result);
 } 
 private static void backtrack(int start,List<Integer> path){
  
    if(path.size()==k){
     result.add(new ArrayList<>(path));
     return;
    }
    if(start>n)return;
    path.add(start);
    backtrack(start+1,path);
    path.remove(path.size()-1);
    backtrack(start+1, path);
 }
}
