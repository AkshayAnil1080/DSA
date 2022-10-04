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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
       
        targetSum -= root.val;
        
        if(root.left==null && root.right==null)// check if ha reached a leaf node
            return targetSum==0;
        
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}