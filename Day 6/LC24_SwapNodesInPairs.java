// 🔹 LeetCode 24: Swap Nodes in Pairs
// Approach: Iterative (Pointer manipulation)

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LC24_SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;

            first.next = second.next;
            second.next = first;
            cur.next = second;

            cur = cur.next.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode res = swapPairs(head);

        System.out.print("After swapping pairs: ");
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
