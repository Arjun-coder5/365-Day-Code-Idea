import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;

    
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

 
        cur = head;
        while (cur != null) {
            Node copy = map.get(cur);
            copy.next = map.get(cur.next);
            copy.random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}

public class LC_138 {
    public static void main(String[] args) {
        
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        Solution sol = new Solution();
        Node copyHead = sol.copyRandomList(n1);

      
        Node cur = copyHead;
        while (cur != null) {
            System.out.print("[" + cur.val + ", ");
            if (cur.random != null)
                System.out.print(cur.random.val);
            else
                System.out.print("null");
            System.out.print("] -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
}
