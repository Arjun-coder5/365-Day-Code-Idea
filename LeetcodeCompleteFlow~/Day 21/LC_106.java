public class LC_106 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = buildTree(inorder, postorder);

        System.out.println("Tree constructed! Root = " + root.val);
    }

    // ------------------- LeetCode 106 SOLUTION --------------------

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Map each value to its index in inorder
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1,
                     new int[]{postorder.length - 1}, map);
    }

    private static TreeNode build(int[] inorder, int[] postorder,
                                  int inStart, int inEnd,
                                  int[] postIndex,
                                  java.util.HashMap<Integer, Integer> map) {

        if (inStart > inEnd) return null;

        int rootVal = postorder[postIndex[0]--];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = map.get(rootVal);

        // Postorder → Left, Right, Root (we process in reverse)
        // So right subtree must be built first
        root.right = build(inorder, postorder, inIndex + 1, inEnd, postIndex, map);
        root.left = build(inorder, postorder, inStart, inIndex - 1, postIndex, map);

        return root;
    }
}
