Best Video Solution with Live Coding: https://youtu.be/S7FG_Ea4j_8
LIKE | SHARE | SUBSCRIBE

  n,ht of tree

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
    public TreeNode trimBST(TreeNode root, int l, int r) {
         if(root==null)
        return null;
        
        
        root.left = trimBST(root.left, l,r);
        root.right = trimBST(root.right, l,r);
        
        //
        if(root.val<l){
            return root.right;
        }
        if(root.val>r){
             return root.left;
        }
        return root;
    }
}
