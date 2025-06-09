
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {

        int len = findLength(head);
        ListNode[] arr = new ListNode[k];

        int nodesInBucket = len/k;
        int remNodes = len%k;

        ListNode curr = head;
         ListNode prev = null;
        for(int i=0; i<k ; i++) {

            arr[i] = curr;
            for(int j=1; j<=nodesInBucket + (remNodes > 0 ? 1 : 0) ; j++){

                prev = curr;
                curr = curr.next;
            }

            if(prev != null ) prev.next = null;
            remNodes--;


        }

        return arr;

    }

    public static int findLength(ListNode head) {

        int cnt=0;
        while(head!=null) {
            cnt++;
            head = head.next;
            
        }

        return cnt;

    }
}