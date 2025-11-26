public class LC_21 {

    // Definition for singly-linked list.
  
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    // Function to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach remaining part of whichever list is not null
        if (list1 != null) tail.next = list1;
        else tail.next = list2;

        return dummy.next;
    }

    // Utility function to print a linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        ListNode mergedList = mergeTwoLists(list1, list2);

        System.out.println("Merged Sorted List:");
        printList(mergedList);
    }
}
