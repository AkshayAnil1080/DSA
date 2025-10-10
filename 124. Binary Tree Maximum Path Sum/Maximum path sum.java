Best Video Solution : https://youtu.be/aE8w7I_5b-w


/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
     int maxSum;
    int findMaxSum(Node root) {
        // code here
        maxSum=root.data;
        dfs(root);
        return maxSum;
        
    }
    int dfs(Node root){
        if(root==null){
            return 0;
        }
        int leftMax = Math.max(dfs(root.left),0);
        int rightMax = Math.max(dfs(root.right),0);
        
        //max path sum with split
        maxSum = Math.max(maxSum, root.data+leftMax+rightMax);
        
        //
        return root.data + Math.max(leftMax, rightMax);
    }
}
