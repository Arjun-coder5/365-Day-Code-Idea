import java.util.*;

// // TreeNode class
// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int x) {
//         val = x;
//     }
// }

public class LC_114 {

    static TreeNode prev = null;  // Used in flatten function

    public static void main(String[] args) {

        // Example tree:
        //     1
        //    / \
        //   2   5
        //  / \   \
        // 3   4   6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        flatten(root);

        System.out.println("Flattened Tree (Linked List):");
        printRightList(root); 
    }

    // ---- LeetCode 114 Solution ----
    public static void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    // Helper to print the final list
    public static void printRightList(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }
}
