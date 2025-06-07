
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenFirstNode = head.next;

        while( even != null && even.next != null ) {

            odd.next = even.next;
            even.next = even.next.next;

            // moving forward pointers
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenFirstNode;

        return head;
        
    }
}