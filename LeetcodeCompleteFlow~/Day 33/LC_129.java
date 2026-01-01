class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LC_129 {

    public static void main(String[] args) {
        /*
            Example tree:
                1
               / \
              2   3

            Expected output: 25
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Main obj = new Main();
        int result = obj.sumNumbers(root);

        System.out.println(result); // 25
    }

    // LeetCode function
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) return 0;

        current = current * 10 + node.val;

        // leaf node
        if (node.left == null && node.right == null) {
            return current;
        }

        return dfs(node.left, current) + dfs(node.right, current);
    }
}
