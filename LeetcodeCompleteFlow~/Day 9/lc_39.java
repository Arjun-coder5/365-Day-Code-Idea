import java.util.*;

public class lc_39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("All combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    public static void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
     
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }

        // 1️⃣ Include current element (reuse allowed → same index)
        current.add(arr[index]);
        backtrack(arr, target - arr[index], index, current, result);  // stay on same index
        current.remove(current.size() - 1); // backtrack

        // 2️⃣ Exclude current element (move ahead)
        backtrack(arr, target, index + 1, current, result);
    }
}
