//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t > 0){
	            int n=Integer.parseInt(br.readLine().trim());
	            String s[] = br.readLine().trim().split(" ");

	            int target=Integer.parseInt(br.readLine().trim());
    	    	Node root = null;
                for(int i=0;i<n;i++){
                    root=insert(root,Integer.parseInt(s[i]));
                }
        	    Solution g = new Solution();
        	    System.out.println(g.maxDifferenceBST(root,target));
                t--;
            
        }
    }

    public static Node insert(Node tree, int val) {
        Node temp = null;
        if (tree == null) return new Node(val);
    
        if (val < tree.data) {
            tree.left = insert(tree.left, val);
        } else if (val > tree.data) {
            tree.right = insert(tree.right, val);
        }
    
        return tree;
    }
  
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int res;
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        int sum=0;
        Node  curr=root;
        while(curr!=null)
        {
            if(curr.data==target)
            break;
            else if(curr.data < target)
            {
                sum+= curr.data;
                curr =curr.right;
            }
            else
            {
                sum+=curr.data;
                curr=curr.left;
            }
        }
       if(curr==null)
       return -1;
       
       else{
           
           if(curr.left==null && curr.right==null)
           return sum;
           //now have to cover each path , comparing which path gives min value,
        // while traversing the path maintiain path sum and if reached leaves return the max diff
        res=Integer.MIN_VALUE;
        if(curr.left!=null)
        {
            solve(curr.left, 0, sum);
        }
        
        if(curr.right!=null)
        {
            solve(curr.right, 0, sum);
        }
       }
       return res;
        
    }
     static void solve(Node root, int path_sum , int sum)
    {
        
        if(root==null)
        return;
        
        //bc if reached leaves return the diff
        if(root.left==null && root.right==null)
        {
            res=Math.max(res, sum - (path_sum+root.data));
            return;
        }
        
        solve(root.left, path_sum+root.data, sum);
        solve(root.right, path_sum+root.data, sum);
        
        
    }
}