class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        // Code Here
        return dfs(root);
        
    }
    Node dfs(Node root){
        if(root==null)
        return null;
        
        root.left = dfs(root.left);
        root.right = dfs(root.right);
         //leaf node
        if(root.right==null && root.left==null)return root;
        
        if(root.right==null || root.left==null){
            Node curr_root = (root.left == null) ? root.right : root.left;
            return curr_root;
        }
        
        return root;
    }
}
