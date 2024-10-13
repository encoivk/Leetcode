class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode front=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode next=current.next;
            current.next=front;
            front=current;
            current=next;
        }
        return  front;
    }
}