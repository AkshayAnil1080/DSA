
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> al = new ArrayList<>();
	    //Add your code here.
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    
	    s1.push(root);
	    while(!s1.isEmpty() || !s1.isEmpty())
	    {
	        
	        while(!s1.isEmpty())
	       {
	           Node temp  = s1.pop();
	           al.add(temp.data);
	           
	           if (temp.left!=null)
	           {
	                s2.push(temp.left);
	           }
	           
	           if(temp.right!=null)
	           {
	                s2.push(temp.right);
	           }
	       }
	    
	        
	        while(!s2.isEmpty())
	        {   
	            Node temp = s2.pop();
	               al.add(temp.data);
	            
	            if(temp.right!=null)
	           {
	                s1.push(temp.right);
	           }
	           
	           if (temp.left!=null)
	           {
	                s1.push(temp.left);
	           }
	            
	        }
	    }
	    
	    return al;
	    
	}
}
