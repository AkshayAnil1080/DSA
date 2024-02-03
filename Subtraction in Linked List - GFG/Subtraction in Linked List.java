
class Solution {
    public Node subLinkedList(Node h1, Node h2) {
        // code here
        //removing zeros
        while(h1!=null && h1.data==0)
        h1=h1.next;
        
        while(h2!=null && h2.data==0)
        h2=h2.next;
        
        //finding lengt of LL
        int s1 = getLength(h1), s2 = getLength(h2);
        
        if(s1==0 && s2==0) return new Node(0);
        
        //making l1 list size largest.
        if(s2>s1){
            Node temp = h1; h1=h2; h2=temp; //swap the list
        }
        if(s1==s2){
            Node curr1 = h1, curr2=h2;
            while(curr1.data==curr2.data){
                curr1=curr1.next; curr2=curr2.next;
                
                //if reached end => both ll are same
                if(curr1==null)
                return new Node(0);
            }
            if(curr2.data > curr1.data){
                Node temp = h1; h1=h2; h2=temp; //swap the list
            }
        }
        //reverse the list for subtraction
        h1 = reverse(h1); h2=reverse(h2);
        Node ans = null;
        while(h1!=null){
            int n1 = h1.data; int n2=0;
            if(h2!=null)  n2= h2.data;
            
            if(n1<n2){
                if(h1.next!=null){
                    h1.next.data -= 1;
                }
                n1+=10;
            }
        
            //store the difference
            Node curr = new Node(n1-n2);
            curr.next = ans;
            ans = curr;
            
            h1 = h1.next;
            if(h2!=null)
                h2 = h2.next;
        }
            
        // remove zeros from end;
      
        while(ans!=null && ans.next != null )
        {
            if(ans.data==0){
               ans = ans.next;
            }
            else
            break;
        }
        return ans;
 
        
    }
    int getLength(Node head){
         int cnt=0;  
 	   for(Node curr=head; curr!=null;  curr=curr.next)
 	   cnt++;
 	   return cnt;
    }
    Node reverse(Node head){
        Node prev=null, curr=head, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}    
