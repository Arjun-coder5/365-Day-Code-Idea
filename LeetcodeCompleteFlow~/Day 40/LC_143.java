import java.util.ArrayList;
import java.util.Scanner;
public class LC_143{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
     
      ArrayList<ListNode> arr = new ArrayList<>();
    
     ListNode curr = head;
      while(curr!=null){
        arr.add(curr);
        curr = curr.next;
      }
      int i = 0,j = arr.size()-1;
      while(i<j){
        arr.get(i).next = arr.get(j);
        i++;
        if(i==j)break;
        arr.get(j).next = arr.get(i);
        j--;
      }
      arr.get(i).next = null;
        curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
  }
}