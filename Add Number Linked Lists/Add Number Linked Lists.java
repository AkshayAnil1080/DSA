

Full video explanation by me : https://youtu.be/DvYccbpFjSg

class Solution{
    //Function to reverse the linked list.
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null)
        {
            next = curr.next;     
            curr.next = prev;     
            prev = curr;          
            curr = next;        
        }
        
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        //reversing both lists to simplify addition.
        num1 = reverse(num1);      
        num2 = reverse(num2);     
        
        Node sum = null;
        int carry = 0;
        
        //using a loop till both lists and carry gets exhausted.
        while( num1!=null || num2!=null || carry>0 )
        {
            //using a variable to store sum of two digits along with carry.
            int newVal = carry;
            
            //if nodes are left in any list, we add their data in newVal.
            if(num1!=null) newVal+=num1.data;
            if(num2!=null) newVal+=num2.data;
            
            //updating carry.
            carry = newVal / 10;
            
            //using modulus to store only a single digit at that place.
            newVal = newVal % 10;
            
            //creating new node which gets connected with other nodes that 
            //we get after calculating sum of respective digits.
            Node newNode = new Node(newVal);
            
            //storing the previously made nodes in the link part of new node.
            newNode.next = sum;
            //making the new node as the num1 node of all previously made node.
            sum = newNode;
            
            //moving ahead in both lists.
            if(num1!=null) num1 = num1.next;      
            if(num2!=null) num2 = num2.next;
        }
        // remove leading zeros
        while(sum != null && sum.data==0)
        {
            sum=sum.next;
        }
      
        return sum;
    }
}
