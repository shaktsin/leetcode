/**
 * Created by shaktsin on 6/10/17.
 */
public class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }

  public static ListNode createList(int[] a) {
    ListNode head=null, current = null;
    for (int i=0; i < a.length; i++) {
      ListNode temp = new ListNode(a[i]);
      if (head == null) {
        head = temp;
      } else {
        current.next = temp;
      }
      current = temp;

    }
    return head;
  }

  public static void printList(ListNode head) {
    System.out.println();
    for (ListNode temp = head; temp != null; temp = temp.next) {
      System.out.print(temp.val+ " ");
    }
  }
}
