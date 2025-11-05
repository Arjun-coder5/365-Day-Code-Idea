 public class lc_61 {
      public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int k = 2;

        ListNode ans = rotateRight(head, k);
        printList(ans);
      }

      public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
          return head;
        }

        // compute length and get tail
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
          n++;
          temp = temp.next;
        }
        ListNode tail = temp;

        k = k % n;
        if (k == 0) return head;

        // make it circular and break at new tail
        tail.next = head;
        int stepsToNewTail = n - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
          newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
      }

      private static void printList(ListNode node) {
        while (node != null) {
          System.out.print(node.val);
          if (node.next != null) System.out.print(" -> ");
          node = node.next;
        }
        System.out.println();
      }
    }

