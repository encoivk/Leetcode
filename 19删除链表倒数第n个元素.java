class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode right=head;
        ListNode left=head;
        ListNode front=null;
        int i=1;
        while(right.next!=null)
        {
            right=right.next;
            if(i>=n)
            {
            front=left;
            left=left.next;
            }
            i++;
        }
        if(front==null)
        {
            return left.next;
        }
        front.next=left.next;
        return head;
    }
}