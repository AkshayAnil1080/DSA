
class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null || head.next==null)
        return null;
        Node slow=head, fast=head;
        Node preptr = slow;
        while(fast!=null && fast.next!=null){
            preptr=slow;
            slow=slow.next;
            fast = fast.next.next;
        }
        preptr.next = slow.next; 
        //preptr.next = preptr.next.next;
        return head;
    }
}

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head==null || head.next==null)
        return null;
        
        Node temp;
        int len=0;
        for( temp=head; temp!=null; temp=temp.next)
            len++;
        
        //  int num;
        // if(len%2!=0)
        int num=len/2;
        // else;
        // num=len/2 +1;
        
        Node t = head;
        for(int i =1; i<num;i++)
            t=t.next;
            
        t.next=t.next.next;
        return  head;
    }
}
