/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
     
        //1.
        if(root==null) return null;
        
        if(root.val==p.val || root.val==q.val)
            return root;
            
        TreeNode left =  lowestCommonAncestor(root.left,p,q);
        TreeNode right =  lowestCommonAncestor(root.right,p,q);
            
        if(left!=null && right!=null)
            return root;
        
         if(left!=null )
            return left;
        else
            return right;
    
        
    }
   
}