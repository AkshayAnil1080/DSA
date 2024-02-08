class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
       return ChildSum(root) ? 1:0;
    }
    
    public static boolean ChildSum(Node root){ 
        // base condition
        if(root == null) return true;
        if(root.left==null && root.right==null) return true;
        
        int sum = 0 ;
        if(root.left!=null) sum+= root.left.data;
        if(root.right!=null) sum+= root.right.data;
        
         return (root.data==sum && ChildSum(root.left) && ChildSum(root.right));
    }
}

