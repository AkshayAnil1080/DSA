
//User function Template for Java
class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node curr = head;
        Node newNode = new Node(data);
        
        //1 list empty
        if(head ==null){
            newNode.next = newNode;
        return newNode;
        }
        //insert at head
        else if(data <= head.data){
            while(curr.next!=head)
            curr=curr.next;
            
            curr.next = newNode; newNode.next = head;
            return newNode;
        }
        //insert at position
        else{
            while(curr.next!=head && data > curr.next.data){
                curr=curr.next;
            }
            
            newNode.next = curr.next;
            curr.next = newNode;
            return head;
        }
    }
}
