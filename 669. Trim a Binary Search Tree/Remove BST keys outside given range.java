Best Video Solution with Live Coding: https://youtu.be/S7FG_Ea4j_8
LIKE | SHARE | SUBSCRIBE

    n,ht of tree

  */

class Solution {
    Node removekeys(Node root, int l, int r) {
        // code here
        return dfs(root, l ,r);
    }
    Node dfs( Node root, int l, int r){
        if(root==null)
        return null;
        
        
        root.left = dfs(root.left, l,r);
        root.right = dfs(root.right, l,r);
        
        //
        if(root.data<l){
            return root.right;
        }
        if(root.data>r){
             return root.left;
        }
        return root;
        
    }
}
