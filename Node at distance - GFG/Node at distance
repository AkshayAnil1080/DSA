class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    HashSet<Node> set;
    int printKDistantfromLeaf(Node root, int k)
    {
        // Write your code here
        set = new HashSet<>();
        dfs(root,k);
        return set.size();
    }
    void dfs(Node root, int k){
        if(root==null) return;
        dfs(root.left, k);
        if(isValid(root,k))
            set.add(root);
        dfs(root.right, k);
        
    }
    boolean isValid(Node root, int k){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return k==0;
        }
        return isValid(root.left, k-1) || isValid(root.right,k-1);
    }

}
