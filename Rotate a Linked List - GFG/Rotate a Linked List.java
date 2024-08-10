
class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        Node ptr=head;
        Node pre_ptr = null;
        while(k>0 && ptr!=null){
            pre_ptr = ptr;
            ptr =  ptr.next;
            k--;
        }

// k>=size; 
        if(ptr==null)
        return head;
        
        pre_ptr.next=null;
        
        Node new_head = ptr;
          while( ptr.next!=null){
              ptr =  ptr.next;
          }
          ptr.next = head;
          
          return new_head;
    }
}
