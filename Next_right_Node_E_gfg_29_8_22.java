https://practice.geeksforgeeks.org/problems/next-right-node/1

class Solution{
	Node nextRight(Node node, int key)
    {
		//Write your code here
		Node ans = new Node(-1);
		if(node==null)
		return ans;
		
		
        Queue<Node> q = new LinkedList<Node>();
        Node root = node;
        q.add(root);
    
        
        while(!q.isEmpty())
        {
            int s=q.size();
            
            for( int i =0; i<s; i++)
            {
                Node temp =q.poll();
            
            if(temp.data==key && i!=s-1)
            return q.peek();
            
            if(temp.left!=null)
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
            }
 
        }
 
        return ans;
    }
}

// Do level order, just mainttain the size of queue and then operate
