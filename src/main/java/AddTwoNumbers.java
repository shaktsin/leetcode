/**
 * Created by shaktsin on 6/10/17.
 */
public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode output = null, head = null, current=null, remainingNode = null;
    int remainder=0, carry=0;
    for (;l1 != null && l2 != null; l1=l1.next, l2=l2.next) {
      int num = l1.val + l2.val + carry;
      remainder = num % 10;
      carry = num / 10;
      output = new ListNode(remainder);
      if (head == null) {
        head = output;

      } else {
        current.next = output;
      }
      current = output;
    }

    if (l1 == null) {
      remainingNode = l2;
    } else {
      remainingNode = l1;
    }

    for (; remainingNode != null; remainingNode = remainingNode.next) {
      int num =  remainingNode.val + carry;
      remainder = num % 10;
      carry = num / 10;
      output = new ListNode(remainder);
      if (current != null) {
        current.next = output;
        current = output;
      }
    }

    if (carry != 0) {
      output = new ListNode(carry);
      if (current != null) {
        current.next = output;
      }
    }
    return head;
  }


  public static void main(String[] args) {
    ListNode l1 = ListNode.createList(new int[]{2, 4, 3});
    ListNode.printList(l1);

    ListNode l2 = ListNode.createList(new int[]{5, 6, 4});
    ListNode.printList(l2);

    ListNode sumList = AddTwoNumbers.addTwoNumbers(l1, l2);
    ListNode.printList(sumList);
  }
}
