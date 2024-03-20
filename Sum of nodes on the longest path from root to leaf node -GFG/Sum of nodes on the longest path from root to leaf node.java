class Solution{
    int maxSum = Integer.MIN_VALUE;
    int maxLength = 0;
    
    public int sumOfLongRootToLeafPath(Node root) {
        fun(root, 0, 0);
        return maxSum;
    }
    
    private void fun(Node node, int pathLength, int pathSum) {
        if (node == null) //bc1
            return;

        pathLength++;
        pathSum += node.data;

       //bc2 - leaf node
        if (node.left == null && node.right == null) {
            if (pathLength > maxLength || (pathLength == maxLength && pathSum > maxSum)) {
                maxLength = pathLength;
                maxSum = pathSum;
            }
        }

       //recur
        fun(node.left, pathLength, pathSum);
        fun(node.right, pathLength, pathSum);
        }
}
