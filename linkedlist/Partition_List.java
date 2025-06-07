
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode smallerLL = new ListNode(0);
        ListNode largerLL = new ListNode(0);


        ListNode smallPointer = smallerLL;
        ListNode largePointer = largerLL;

        while( head != null ) {
            if(head.val < x ) {
                smallPointer.next = head;
                smallPointer = smallPointer.next;
            }

            else {
                largePointer.next = head;
                largePointer = largePointer.next;
            }
            head = head.next;
        } 
        smallPointer.next = largerLL.next;
        largePointer.next = null;

        return smallerLL.next;
        
    }
}