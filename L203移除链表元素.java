class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode temp=head;
        while(head.next!=null)
        {
            if(head.next.val==val)
            {
                head.next=head.next.next;
                continue;
            }
            head=head.next;
        }
        if(temp.val==val)return temp.next;
        else return temp;
        
    }
}