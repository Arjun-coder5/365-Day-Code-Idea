public class LC_105 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Tree constructed! (Root = " + root.val + ")");
    }



    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Map each value to its index in inorder[]
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1, map, new int[]{0});
    }

    private static TreeNode build(int[] preorder, int inStart, int inEnd,
                                  java.util.HashMap<Integer, Integer> map, int[] preIndexHolder) {

        // No elements → no tree
        if (inStart > inEnd) return null;

        // Current root from preorder
        int rootVal = preorder[preIndexHolder[0]++];
        TreeNode root = new TreeNode(rootVal);

        // Find root in inorder
        int inIndex = map.get(rootVal);

        // Build left + right subtree
        root.left = build(preorder, inStart, inIndex - 1, map, preIndexHolder);
        root.right = build(preorder, inIndex + 1, inEnd, map, preIndexHolder);

        return root;
    }
}
