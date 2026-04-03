import java.util.*;

class Ques_1 {
    public int thirdMax(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int num : nums) {
        h.add(num);
        }
        List<Integer> lt = new ArrayList<>(h);
        Collections.sort(lt);
        int n = lt.size();
        if (n < 3) return lt.get(n - 1);
        int count = 1;
        int prev = lt.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (lt.get(i) != prev) {
                count++;
                prev = lt.get(i);
             }
            if (count == 3) {
                return lt.get(i);
             }
    }
        return lt.get(n - 1);
    }
}