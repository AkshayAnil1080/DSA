class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node LCA = lca(root, a, b);
        return findLevel(LCA, a) + findLevel(LCA, b);
        // return findLevel(LCA, a,0) + findLevel(LCA, b,0); //for dfs
        
    }
    	Node lca(Node root, int n1,int n2){
		// Your code here
		if(root==null)
		return null;
		
		if(root.data==n1 || root.data== n2)
		return root;
		
		Node left = lca(root.left, n1,n2);
		Node right = lca(root.right, n1,n2);
		
		
		if(left!=null && right!=null)
		return root;
		
		if(left!=null && right==null)
		return left;
		
		else return right;
	}
	//bfs
	int findLevel(Node root, int a) {
    if (root == null)
        return -1;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    int level = 0;

    while (!q.isEmpty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            Node curr = q.poll();
            
            if (curr.data == a)
                return level;
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
        level++;
    }

    return -1;
	}
}
	
// 	int findLevel(Node root , int data , int level)   //to find the disatance from the one node to another node with data d.
//     {
//         if(root == null)  //
//         return -1 ;
        
//         if(root.data  == data)
//         return level;
        
       
        
//         int  left = findLevel(root.left , data , level+1);
//         int right =  findLevel(root.right , data , level+1);
        
//         if(left == -1)
//         return right;  
        
//         else   
//         return left;
//     }
// 
