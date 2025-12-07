
public class LC_117 {

    // ✅ Definition of Node
    static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // ✅ Solution class
    static class Solution {
        public Node connect(Node root) {
            if (root == null) return null;

            Node curr = root;

            while (curr != null) {
                Node dummy = new Node(0);
                Node tail = dummy;

                // Traverse current level
                while (curr != null) {

                    if (curr.left != null) {
                        tail.next = curr.left;
                        tail = tail.next;
                    }

                    if (curr.right != null) {
                        tail.next = curr.right;
                        tail = tail.next;
                    }

                    curr = curr.next;
                }

                // Move to next level
                curr = dummy.next;
            }

            return root;
        }
    }

    // ✅ MAIN METHOD (for testing)
    public static void main(String[] args) {

        /*
             Tree:
                   1
                  / \
                 2   3
                / \   \
               4   5   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        Solution sol = new Solution();
        sol.connect(root);

        // ✅ Print level-wise using next pointers
        printLevels(root);
    }

    // ✅ Helper function to print using next pointers
    static void printLevels(Node root) {
        Node level = root;

        while (level != null) {
            Node curr = level;

            while (curr != null) {
                System.out.print(curr.val + " -> ");
                curr = curr.next;
            }
            System.out.println("NULL");

            // Move to next level
            if (level.left != null) level = level.left;
            else if (level.right != null) level = level.right;
            else break;
        }
    }
}
