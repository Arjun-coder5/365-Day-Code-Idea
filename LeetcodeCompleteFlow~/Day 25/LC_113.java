import java.util.*;

// TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LC_113 {

    public static void main(String[] args) {

        // Example: [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        Solution sol = new Solution();
        List<List<Integer>> ans = sol.pathSum(root, targetSum);

        System.out.println("Paths with sum = " + targetSum + ":");
        for (List<Integer> path : ans) {
            System.out.println(path);
        }
    }
}

// -------- SOLUTION CLASS ----------
class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode node, int target, List<Integer> current, List<List<Integer>> result) {
        if (node == null) return;

        current.add(node.val);

        // leaf node
        if (node.left == null && node.right == null && node.val == target) {
            result.add(new ArrayList<>(current));
        }

        dfs(node.left, target - node.val, current, result);
        dfs(node.right, target - node.val, current, result);

        current.remove(current.size() - 1); // backtrack
    }
}
