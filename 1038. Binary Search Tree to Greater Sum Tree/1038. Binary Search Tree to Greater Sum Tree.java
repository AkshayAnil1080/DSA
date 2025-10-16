Best Video Solution with Live Coding: https://youtu.be/WIEfybZx1NY
LIKE | SHARE | SUBSCRIBE

  N,  HT OF TREE
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum;
    public TreeNode bstToGst(TreeNode root) {
         sum=0;
        dfs(root);
        return root;
    }
     void dfs(TreeNode root){
        if(root==null)
        return;
        
        dfs(root.right);
        
        sum+=root.val;
        root.val = sum;
        
        dfs(root.left);
    }
}



