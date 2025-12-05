import java.util.*;

class Node {
    int val;
    Node left, right, next;

    Node(int val) {
        this.val = val;
    }
}

public class LC_116 {

    public static Node connect(Node root) {
        if (root == null) return null;

        Node level = root;

        // Because it is a perfect binary tree
        while (level.left != null) {
            Node curr = level;

            while (curr != null) {
                curr.left.next = curr.right;

                if (curr.next != null)
                    curr.right.next = curr.next.left;

                curr = curr.next;
            }

            level = level.left;
        }

        return root;
    }

    public static void main(String[] args) {
        // Example Tree:
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4  5  6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        connect(root);

        // Printing next pointers of level 2
        System.out.println(root.left.left.next.val); // 5
        System.out.println(root.left.right.next.val); // 6
        System.out.println(root.right.left.next.val); // 7
    }
}
