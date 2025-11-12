class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LC_83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;  // skip duplicate
            } else {
                curr = curr.next;  // move forward
            }
        }

        return head;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        printList(head);

        ListNode result = deleteDuplicates(head);
        System.out.print("After removing duplicates: ");
        printList(result);
    }
}
