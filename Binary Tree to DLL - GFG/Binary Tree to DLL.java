
class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
     Node head, prev = null;
    Node bToDLL(Node node)
    {
	//1
    	if(node == null) return null;
    	 
    	 //2
    	 bToDLL(node.left);
    	 
    	 //4
    	 if(prev==null){
    	     head = node;
    	     prev = node;
    	 }
    	
    	 //5
    	 else
    	 {
    	     node.left = prev;
    	     prev.right=node;
    	     prev=node;
    	 }
    	
    	 //3
    	 bToDLL(node.right);
    	 return head;
    }
}
