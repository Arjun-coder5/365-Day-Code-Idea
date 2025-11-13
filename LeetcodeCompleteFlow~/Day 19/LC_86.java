class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LC_86 {
    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead, after = afterHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;
        return beforeHead.next;
    }

    public static void main(String[] args) {
        // Example: head = [1,4,3,2,5,2], x = 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        ListNode res = partition(head, 3);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
