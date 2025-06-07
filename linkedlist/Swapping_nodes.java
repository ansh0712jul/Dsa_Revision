
class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode temp = head;
        ListNode p1 = null;
        ListNode p2 = null;

        while( temp!= null ) {

            if(p2 != null) p2=p2.next;

            k--;

            if(k == 0) {
                p1 = temp;
                p2 = head;
            }

            temp = temp.next;
        }

        int store = p1.val;
        p1.val = p2.val;
        p2.val = store;

        return head;
        
    }
}

//  ek baari ek pointer kth index pr phuch jaaye frr ek pointer starting se or ek kth index se parallaly chalao jb tk null n ho jaaye second pointer apne aap hi last se kth index pr phuch jaayega