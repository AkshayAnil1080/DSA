
Best Video Solution with Live Coding: https://youtu.be/WIEfybZx1NY
LIKE | SHARE | SUBSCRIBE

  n,ht of tree

class Solution {
    static int sum;
    public static void transformTree(Node root) {
        // code here
        sum=0;
        dfs(root);
        
    }
    static void dfs(Node root){
        if(root==null)
        return;
        
        dfs(root.right);
        sum+=root.data;
        root.data  = sum-root.data;
        dfs(root.left);
    }
}
