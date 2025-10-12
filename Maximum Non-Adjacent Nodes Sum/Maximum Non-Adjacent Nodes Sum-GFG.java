Best Video Solution :https://youtu.be/S68tDCB4mTY

//optimal
//n, n

class Solution {
    HashMap<Node, Integer> dp = new HashMap<>();
    public int getMaxSum(Node root) {
        // Add your code here
        return rec(root);
    }
    // Function to return the maximum sum of non-adjacent nodes.
     int rec(Node root) {
        if (root == null)
            return 0;
        
        if (dp.containsKey(root))
            return dp.get(root);

        int nottake = rec(root.left) + rec(root.right);

        int take = root.data;
        if (root.left != null)
            take += rec(root.left.left) + rec(root.left.right);
        
        if (root.right != null)
            take += rec(root.right.left) + rec(root.right.right);

       int result = Math.max(take, nottake);
        dp.put(root, result);
        return result;
    }
}



// better
2^n, ht
  
class Solution {

    public int getMaxSum(Node root) {
        // Add your code here
        return rec(root);
    }
    // Function to return the maximum sum of non-adjacent nodes.
     int rec(Node root) {
        if (root == null)
            return 0;

        int nottake = rec(root.left) + rec(root.right);

        int take = root.data;
        if (root.left != null)
            take += rec(root.left.left) + rec(root.left.right);
        
        if (root.right != null)
            take += rec(root.right.left) + rec(root.right.right);

        return Math.max(take, nottake);
    }
}

