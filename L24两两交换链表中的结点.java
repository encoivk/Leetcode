class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        return null;
        if(head.next==null)
        {
            return head;
        }
        ListNode third=head.next.next;
        ListNode second=head.next;
        head.next.next=head;
        head.next=swapPairs(third);
        return second;
    }
}