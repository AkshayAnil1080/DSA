
Best Video Solution with Live Coding: https://youtu.be/6y1Q8Cm9SK0
LIKE | SHARE | SUBSCRIBE
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
k,1
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr;   // create thread
                    curr = curr.left;
                } else {
                    prev.right = null;   // remove thread
                    // Process the node as part of inorder traversal
                    if (k == 1) return curr.val;
                    k--;
                    curr = curr.right;
                }
            } else {
                // Process the node as part of inorder traversal
                if (k == 1) return curr.val;
                k--;
                curr = curr.right;
            }
        }
        return -1; // not enough nodes
    }
}
