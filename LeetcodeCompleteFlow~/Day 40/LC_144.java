import java.util.*;

// Tree node definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LC_144 {

    // Preorder function
    public static void preorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        ans.add(root.val);          // ROOT
        preorder(root.left, ans);   // LEFT
        preorder(root.right, ans);  // RIGHT
    }

    public static void main(String[] args) {

        // Build tree:
        //      1
        //       \
        //        2
        //       /
        //      3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        // Print result
        System.out.println(ans);
    }
}
