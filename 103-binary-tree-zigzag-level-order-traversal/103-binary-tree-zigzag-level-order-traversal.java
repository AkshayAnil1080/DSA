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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack();
        List<List<Integer>> al = new ArrayList<>();
        if(root==null) return al;
    
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
             List<Integer> curr = new ArrayList<>();
            while(!s1.isEmpty()){
                TreeNode x =  s1.pop();
                curr.add(x.val);
                if(x.left!=null) s2.push(x.left);
                if(x.right!=null) s2.push(x.right);
            }
            al.add(curr); curr = new ArrayList<>();
            
            while(!s2.isEmpty()){
                // List<Integer> curr = new ArrayList<>();
                TreeNode x =  s2.pop();
                curr.add(x.val);
               
                if(x.right!=null) s1.push(x.right);
                 if(x.left!=null) s1.push(x.left);
            }
            al.add(curr); curr = new ArrayList<>();
          
        }
                        
        if(al.get(al.size()-1).isEmpty())       
             al.remove(al.size()-1);
        return al;
    }
    
}