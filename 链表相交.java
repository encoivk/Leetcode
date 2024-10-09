    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0,lenB=0;
        ListNode a=headA,b=headB;
        while(a!=null) {
            lenA++;
            a=a.next;
        }
        while(b!=null) {
            lenB++;
            b=b.next;
        }
        int temp=lenA-lenB;
        while(temp!=0)
        {
            if(temp>0)
            {
                headA=headA.next;
                temp--;
            }
            else {
                headB=headB.next;
                temp++;
            }
        }
        while(headA!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }