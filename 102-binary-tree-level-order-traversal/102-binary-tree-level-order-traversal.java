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
    public List<List<Integer>> levelOrder(TreeNode node) {
        
        
      List<List<Integer>> al = new ArrayList<>();
        if(node==null) return al;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode root = node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            int c= q.size();
             List<Integer> li = new ArrayList<>();
            for(int i=0;i<c;i++)
            {

            TreeNode temp =q.poll();
            li.add(temp.val);
                
            // System.out.print(temp.val+ " ");
            
            if(temp.left!=null)
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
            }
            al.add(li);
            
           
           
        }
       
        return al;  
    }
}