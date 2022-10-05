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
// idead  : level order
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1) //given in question
        {
            TreeNode head = new TreeNode(val);
            head.left = root;
            return head;
        }
        return levelOrder(root, val, depth);
    }
    TreeNode levelOrder(TreeNode root, int val, int depth)
    {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level =1;
        while(q.size() >0)
        {
            int count = q.size();
            while(count-- >0)
            {
                TreeNode  curr = q.poll();

                if(level == depth-1)
                {//store left and right
                    TreeNode leftpart = curr.left;
                    TreeNode rightpart = curr.right;
                    //make new left and right with val 1
                    curr.left = new TreeNode(val);
                    curr.right = new TreeNode(val);

                    // shift the ptr
                    curr.left.left = leftpart;
                    curr.right.right = rightpart;
                }
                else
                {
                if(curr.left!=null)
                    q.add(curr.left);

                if(curr.right!=null)
                    q.add(curr.right);
                }
            }
            level++;
        }
        
        
        return root;
    }
}