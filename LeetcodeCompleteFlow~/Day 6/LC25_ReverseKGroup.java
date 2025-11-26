// 🔹 LeetCode 25: Reverse Nodes in k-Group
// Approach: Recursion + Linked List reversal

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LC25_ReverseKGroup {
public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;

        // Check if there are at least k nodes
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count == k) {
            curr = reverseKGroup(curr, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode result = reverseKGroup(head, k);

        System.out.print("Reversed in groups of " + k + ": ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
