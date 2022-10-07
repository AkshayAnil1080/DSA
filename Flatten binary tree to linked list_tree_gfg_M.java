// https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)
class Solution
{
    public static void flatten(Node root)
    {
        //code here
        if(root==null || root.left==null && root.right==null)
        return;
        
       // if root->left exists then we have 
    // to make it root->right
        if(root.left!=null)
       
          
        {  flatten(root.left);  // move left recursively
            
            Node tempRight = root.right;  // store the node root->right
            root.right = root.left;
            root.left=null;
                
         
            Node t = root.right; // find the position to insert // the stored value  
            while(t.right!=null)
            t=t.right;
            
       
            t.right=tempRight; // insert the stored value
       }
        
         flatten(root.right);  // now call the same function     // for root->right

    }
}
