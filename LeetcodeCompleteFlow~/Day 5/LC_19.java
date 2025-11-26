import java.util.*;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create a dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Step 2: Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Step 3: Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Step 4: Remove the nth node from end
        second.next = second.next.next;

        // Step 5: Return new head
        return dummy.next;
    }
}

public class LC_19  {
    public static void main(String[] args) {
        // Create linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;  // remove 2nd node from end (which is 4)

        Solution sol = new Solution();
        ListNode newHead = sol.removeNthFromEnd(head, n);

        // Print the new linked list
        System.out.print("Updated List: ");
        printList(newHead);
    }

    // Utility method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
