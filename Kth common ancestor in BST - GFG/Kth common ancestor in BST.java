class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        // code here
        Node LCA = lca(root, x, y);
       
        ArrayList<Integer> al = new  ArrayList<>();
       
        search(root, LCA, al);
        return (al.size()-k<0) ? -1 : al.get(al.size()-k);
    }
    void search(Node root, Node x, ArrayList<Integer> al){ //logn
        while(root!=null){
             al.add(root.data);
            if(root.data==x.data){
            return;
            }
            if(root.data < x.data){
                root = root.right;
            }
            else 
            root= root.left;
        }
    }
//     Node lca(Node root, int n1,int n2) //O(n)
// 	{
// 		// Your code here
// 		if(root==null)
// 		return null;
		
// 		if(root.data==n1 || root.data== n2)
// 		return root;
		
// 		Node left = lca(root.left, n1,n2);
// 		Node right = lca(root.right, n1,n2);
		
// 		if(left==null && right==null)
// 		return null;
		
// 		if(left!=null && right!=null)
// 		return root;
		
// 		if(left!=null && right==null)
// 		return left;
		
// 		else return right;
// 	}
Node lca(Node root, int n1, int n2) // ht of tree // logn
	{
       while (root != null) {
            
            if (root.data > n1 && root.data > n2) {
                root = root.left;
            }
            else if (root.data < n1 && root.data < n2) {
                root = root.right;
            }
            else break;
        }
        return root;
    }

}
