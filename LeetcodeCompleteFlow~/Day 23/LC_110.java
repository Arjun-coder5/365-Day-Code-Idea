 public class LC_110 {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

       public static void main(String[] args) {
        LC_110 sol = new LC_110();

        // create balanced tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Is tree balanced? " + sol.isBalanced(root));

        // create unbalanced tree
        TreeNode unb = new TreeNode(1);
        unb.left = new TreeNode(2);
        unb.left.left = new TreeNode(3);

        System.out.println("Is tree balanced? " + sol.isBalanced(unb));
    }
}
