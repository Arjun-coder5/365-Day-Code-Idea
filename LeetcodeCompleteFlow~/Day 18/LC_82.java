class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LC_82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; // points before the duplicate group
        ListNode curr = head;

        while (curr != null) {
            boolean duplicate = false;

            // Move curr until end of duplicate group
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                duplicate = true;
            }

            // If duplicates found, skip them
            if (duplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        ListNode result = deleteDuplicates(head);
        System.out.print("After removing duplicates: ");
        printList(result);
    }
}
