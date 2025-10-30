import java.util.*;

public class LC_49 {
  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};

    // Step 2: Store anagrams using HashMap
    HashMap<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      // Sort the word to make the key
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String key = new String(arr);

      // If key doesn’t exist, create new list
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      // Add original word to its list
      map.get(key).add(s);
    }

    // Print the map
    System.out.println("Step 2: Grouped in HashMap:");
    for (String key : map.keySet()) {
      System.out.println(key + " → " + map.get(key));
    }
  }
}
