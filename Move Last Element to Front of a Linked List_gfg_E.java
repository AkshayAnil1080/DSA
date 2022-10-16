// https://practice.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1
// TC: O(n), SC:O(1)
class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head.next==null) return head;
        
        Node curr = head;
        Node ptr=curr.next;
        while(ptr.next!=null)
        {
            curr=curr.next;
            ptr=ptr.next;
            
        }
        curr.next=null;
        ptr.next=head;
        
        return ptr;
    }
}
    
