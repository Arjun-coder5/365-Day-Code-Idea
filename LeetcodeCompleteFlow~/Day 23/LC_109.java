class Solution109 {

    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

      
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

       
        if (prev != null) prev.next = null;

        TreeNode root = new TreeNode(slow.val);

       
        if (head != slow) root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }

   
    static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    
    public static void main(String[] args) {
        Solution109 sol = new Solution109();

      
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        TreeNode root = sol.sortedListToBST(head);

        System.out.println("Inorder of BST:");
        printInorder(root);
    }
}
