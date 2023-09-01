//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 


class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

class GFG {
    
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    public static void inorder(Node root){
        if(root == null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
		    String s = br.readLine();
	    	Node root = buildTree(s);
	    	int k = Integer.parseInt(br.readLine());
		    Solution obj = new Solution();
		    int res = obj.getCount(root,k);
		    System.out.println(res);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
     ArrayList<Integer> al; 
    public int getCount(Node node, int bud)
    {
        //code here  
        int cnt=0;
        al = new ArrayList<Integer>();
        vis_leaf(node, 0);
        Collections.sort(al);
        //   for(int x : al)
        // System.out.print(x+" ");
        
         for(int i=0; i<al.size(); i++)
         {
             if(bud - al.get(i) >=0)
             {
                 cnt++ ;  bud-=al.get(i); 
             }
             else 
             return cnt;
         }
          return cnt;
    }
    void vis_leaf(Node node, int level)
    {
        if (node==null)	return;  // If the node is null, return
        
        level++;  // Increment the path length
        
        if (node.left==null && node.right==null)  // If the node is a leaf node
        {
            al.add(level);  
            return;
        }
            vis_leaf(node.left, level);
            vis_leaf(node.right,  level);
    }
}