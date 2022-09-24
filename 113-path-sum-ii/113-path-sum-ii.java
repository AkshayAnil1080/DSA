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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(root==null) return ans;
        
        preorder(ans, path,root,targetSum );
        return ans;
    }
    
    void preorder(List<List<Integer>> ans, List<Integer> path, TreeNode root, int sum)
    {
        if(root==null) return;
        
        sum-=root.val;
        path.add(root.val); // process current node and recur for left and right;
        
        //bc sum==0 and left anf right child is null
            if(root.right==null && root.left==null && sum==0)
            {
                ans.add(path);
            }
        
        preorder(ans, new ArrayList<>(path), root.left, sum);// y new  ? because we need a a path, if not ,mentions to new then we cannot have added this unique path in our ans 2d array.
        preorder(ans, new ArrayList<>(path), root.right, sum);
    }
}

// TC:O(n) - y - visiting all nodes at leastonce
//SC: O(h) -  logn  - worst case it can traverse to deep left and rec stack has to store al these at once.
    