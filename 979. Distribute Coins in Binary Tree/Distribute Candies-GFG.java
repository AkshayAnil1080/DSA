
Best solution ever with live coding - https://youtu.be/njSs-j9yUoU
/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
n,h
class Solution {
    int ans;
    public int distCandy(Node root) {
        // code here
        ans=0;
        dfs(root);
        return ans;
        
    }
    int dfs(Node root){
        if(root==null)
        return 0;
        
        int l = dfs(root.left);
        int r = dfs(root.right);
        
        ans+= Math.abs(l)+Math.abs(r); // number of moves caannot be negative
        
        //return remainning nodes / req nodes to parent to balance the curr node.
        return root.data + l + r -1;
    }
}
