import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample   {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      Map<String, String> map = new HashMap<>();
      System.out.print("Enter number of entries: ");
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        System.out.print("Enter key and value: ");
        String key = sc.next();
        String val = sc.next();
        map.put(key, val);
      }
       for(String x : map.keySet()){
           System.out.println(x + "->"+map.get(x));
       }
    }
}