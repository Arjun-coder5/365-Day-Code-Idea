import java.util.*;

public class LC_90 {
    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return ans;
    }

    private static void backtrack(int[] nums, int start, List<Integer> temp) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backtrack(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> res = subsetsWithDup(nums);
        for (List<Integer> subset : res) {
            System.out.println(subset);
        }
    }
}
