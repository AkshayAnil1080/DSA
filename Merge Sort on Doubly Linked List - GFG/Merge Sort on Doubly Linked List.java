class Solution {
    // Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node h1) {
        //9 add your code here
       if (h1 == null || h1.next == null) { // empty or one node.
            return h1;
        }
        ///split in two halves recursively
        Node h2 = funsplit(h1);
        h1 = sortDoubly(h1);
        h2 = sortDoubly(h2);
        
        return merge(h1, h2);
        
    }
     static Node funsplit(Node h1){
         Node fast = h1, slow=h1;
        while(fast.next!=null && fast.next.next!=null){  //odd and even case
            slow = slow.next; fast= fast.next.next;
        }
        Node temp = slow.next; slow.next=null;
        return temp;
     }
     static Node merge(Node h1, Node h2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(h1!=null && h2!=null){ // till both list exist.
            if(h1.data < h2.data){
                curr.next = h1;
                h1.prev = curr;
                
                h1=h1.next;
            }
            else{
                curr.next = h2;
                h2.prev=curr;
                
                h2=h2.next;
            }
            curr=curr.next;
        }
        //iterating in remaining ele in h1 list
        if(h1!=null){
            curr.next = h1;
            h1.prev =curr;
        }
        if(h2!=null){
            curr.next = h2;
            h2.prev=  curr;
        }
        
        Node ans = dummy.next;
        ans.prev = null;
       return ans;
   }
}
