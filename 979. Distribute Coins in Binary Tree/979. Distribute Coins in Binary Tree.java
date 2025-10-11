Best Solution ever with live coding - https://youtu.be/njSs-j9yUoU
  
class Solution {
    int ans;
    public int distributeCoins(TreeNode root) {
        // code here
        ans=0;
        dfs(root);
        return ans;
        
    }
    int dfs(TreeNode root){
        if(root==null)
        return 0;
        
        int l = dfs(root.left);
        int r = dfs(root.right);
        
        ans+= Math.abs(l)+Math.abs(r); // number of moves caannot be negative
        
        //return remainning nodes / req nodes to parent to balance the curr node.
        return root.val + l + r -1;
    }
}

