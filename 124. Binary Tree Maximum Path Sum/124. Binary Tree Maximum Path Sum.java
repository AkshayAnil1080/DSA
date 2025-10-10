Best Video Solution : https://youtu.be/aE8w7I_5b-w


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
     int maxSum;
    public int maxPathSum(TreeNode root) {
         maxSum = root.val;
        dfs(root);
        return maxSum;
    }
    
    int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftMax = Math.max(dfs(node.left), 0);
        int rightMax = Math.max(dfs(node.right), 0);

        // Compute max path sum WITH split
        maxSum = Math.max(maxSum, node.val + leftMax + rightMax);

        // Return max path sum WITHOUT split
        return node.val + Math.max(leftMax, rightMax);
    }
}

