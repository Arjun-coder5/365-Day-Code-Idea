import java.util.*;

class Ques_2 {
  public static void main(String[] args) {
    
  }
    public int[] arrayRankTransform(int[] arr) {
       
       int[] sortedArray = arr.clone(); 
       Arrays.sort(sortedArray);
       
       Map<Integer, Integer> rankMap = new HashMap<>();
       int currentRank = 1;
       
       for (int num : sortedArray) {
           if (!rankMap.containsKey(num)) {
               rankMap.put(num, currentRank++); 
           }
       }
       
       for (int i = 0; i < arr.length; i++) {
           arr[i] = rankMap.get(arr[i]);
       }
       
       return arr;
    }
}
