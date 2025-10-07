// Best Video Solution ever - https://youtu.be/_xnl0tzL5gg
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
     int preIndex = 0;
    HashMap<Integer,Integer> postMap;
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
         postMap = new HashMap<>();
    for (int i = 0; i < post.length; i++) postMap.put(post[i], i);
    preIndex = 0; //iterate in pre order array. and to search in post array.
    // return constructFromPrePost(pre, post, 0,6);
    return constructFromPrePost(pre, post, 0,post.length-1);
    }
    
    TreeNode constructFromPrePost(int[] pre, int[] post, int postStart, int postEnd) {

    if(postStart>postEnd) return null;

    TreeNode root = new TreeNode(pre[preIndex++]);

    if (postStart == postEnd ) return root;

    // int i; // search in post array //O(n)
    // for (i = postStart; i <= postEnd; i++)
    //     if (pre[preIndex] == post[i]) break;
      int i = postMap.get(pre[preIndex]);

    root.left = constructFromPrePost(pre, post, postStart, i);
    root.right = constructFromPrePost(pre, post, i + 1, postEnd-1);

    return root;
    }
}
