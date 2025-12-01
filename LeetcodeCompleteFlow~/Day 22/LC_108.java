import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LC_108 {

    // LC 108 Function
    public static TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private static TreeNode build(int[] nums, int l, int r) {
        if (l > r) return null;

        int mid = l + (r - l) / 2;   // using midpoint
        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, l, mid - 1);
        root.right = build(nums, mid + 1, r);

        return root;
    }

    // Preorder print (root-left-right)
    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(nums);

        System.out.println("Preorder Traversal of BST:");
        preorder(root);
    }
}
