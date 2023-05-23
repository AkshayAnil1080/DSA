//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


class ConstructTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int pre[] = new int[n];
            int preM[] = new int[n];
            
            for(int i = 0; i < n; i++)
              pre[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preM[i] = sc.nextInt();
            
            Solution gfg = new Solution();  
           
            
            inorder(gfg.constructBTree(pre, preM, n));
            System.out.println();
            
        }
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
         return;
         
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    int preIndex = 0 ;
    public Node constructBTree(int pre[], int preM[], int size)
    {
        // your code here
         Node root = build(pre, preM, 0, size - 1);
        return root;
        
    }
    Node build(int[] pre, int[] preM, int l, int h) {
        if (preIndex > pre.length-1 )
            return null;
        
        
        //make new node - first
        Node root = new Node(pre[preIndex++]);
        
        if (l == h)
            return root;
            
        int i; 
        //search next
        for (i = l; i <= h; ++i) {
            if (pre[preIndex] == preM[i])
                break;
        }
        
        root.left = build(pre, preM, i, h);
        root.right = build(pre, preM,  l + 1, i - 1);
        
        return root;
    }
    
}