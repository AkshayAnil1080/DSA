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
    public TreeNode bstFromPreorder(int[] preorder) {
        int inorder[] = new int[preorder.length];
            for( int i=0 ;i <preorder.length; i++)
                inorder[i] = preorder[i];
        
        Arrays.sort(inorder);
        
        return construct(preorder, inorder, 0, inorder.length-1);
    }
     int preIndex =0;
    TreeNode construct(int pre[] , int in[], int is, int ie)
    {
        if(is>ie) return null;
        
        TreeNode  root =  new TreeNode(pre[preIndex++]);
        int inIndex=is;
        //search root in iorder
        for( int i=is ;i<=ie; i++)
        {
            if(in[i]==root.val){
                inIndex=i; break;
            }
        }
        
        // make 0-inIndex of inorder array the left part of root sim the right part
        root.left =  construct(pre, in, is, inIndex-1);
        root.right =  construct(pre, in, inIndex+1, ie);
        
        return root;
    }
}