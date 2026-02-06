import java.util.HashMap;

public class Ques_2 {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int ans = findLHS(nums);
    System.out.println(ans);

  }
   public static  int findLHS(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxLen = 0;
        
        // Step 2: check for pairs with difference = 1
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int len = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, len);
            }
        }
        
        return maxLen;
    }
}
