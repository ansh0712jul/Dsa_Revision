
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) return null;
      

        while(fast!= null && fast.next!=null ){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;
        }

        if(slow != fast ) return null; // cycle nhi mila hoga tbhi loop se bahar aaya 


        ListNode pointer = head;
        while(pointer != slow) {
            slow = slow.next;
            pointer = pointer.next;

        }

        return pointer;
         
    }
}