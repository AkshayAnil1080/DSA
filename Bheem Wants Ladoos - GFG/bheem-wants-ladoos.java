//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
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

class GfG {
    
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
    
	public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0){
            String line = br.readLine().trim();
            Node root = buildTree(line);
            
            line = br.readLine().trim();
            String target_k[] = line.split(" ");
            int home = Integer.parseInt(target_k[0]);
            int k = Integer.parseInt(target_k[1]);
            
            Solution x = new Solution();
            System.out.println( x.ladoos(root, home, k) );
            t--;
        }
    }
}


// } Driver Code Ends


/*
// node structure:

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

*/

class Solution{
    static int ans=0;
    static int ladoos(Node root, int home, int k){
        // Your code goes here
    ans=0;
    solve(root, home,k);
    return ans;
   
    }
    static int solve(Node root, int home, int k)
    {
        if(root==null) return -1;
        if(root.data==home) //add till k levels downstream
        {
            add(root,k); 
            return k-1; // will add k-1 downstream nodes from parent node of target
        }
        
        int rem = solve(root.right, home, k); // found in right st - rem is catching k-1 
        if(rem>=0)
        {
            ans+=root.data; // adding the target's parent in sum;
            add(root.left, rem-1);// since found on right,ie we need to target parent left st
            return rem-1; 
        }
        
        //try writing for left st as well.
         rem = solve(root.left, home, k); // when we found the target in lst
         if(rem>=0)
         {
             ans+=root.data;
             add(root.right, rem-1);
             return rem-1;
         }
        return -1;
        
    }
    static void add(Node n, int dist){
        if( (n==null) || (dist<0) ) return;
        ans += n.data;
        //sum curr node and recur for left and right;
        add(n.left, dist-1);
        add(n.right, dist-1);
    }
}

