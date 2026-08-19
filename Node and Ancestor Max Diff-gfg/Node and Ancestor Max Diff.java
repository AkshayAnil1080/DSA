https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1

youtube link  - https://youtu.be/5OKe7dTnnOs


// n,n
/* Structure of binary tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/


class Solution {
    int ans = Integer.MIN_VALUE; // since we are tracking max
    int maxDiff(Node root) {
        //  code here
        helper(root);
        return ans;

    }
    int helper(Node root){ // find min in subtree

        if(root==null)
        return Integer.MAX_VALUE; // since we are tracking min value;

        int left =helper(root.left);
        int right =helper(root.right);

        int minDesc = Math.min(left, right);

        if(minDesc!=Integer.MAX_VALUE){ // process only when we have desc
            ans = Math.max(ans, root.data-minDesc);
        }
        return Math.min(root.data, minDesc);
    }
}
