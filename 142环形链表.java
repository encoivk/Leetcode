    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)return null;
        ListNode fast=head;
        ListNode low=head;
        int i=0;
        while(fast!=low||i==0)
        {
            i=1;
            if(fast==null||fast.next==null)return null;
            low=low.next;
            fast=fast.next.next;
        }
        ListNode temp=head;
        while(temp!=low)
        {
            temp=temp.next;
            low=low.next;
        }
        return temp;

    }