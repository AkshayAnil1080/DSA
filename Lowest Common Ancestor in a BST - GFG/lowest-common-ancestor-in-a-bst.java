//{ Driver Code Starts
//Initial Template for Java


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
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
            //Scanner sc = new Scanner(System.in);
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    BST g = new BST();
        	    String X = br.readLine();
        	    String arr[] = X.split(" ");
        	    int x , y;
			    x = Integer.parseInt(arr[0]);
			    y = Integer.parseInt(arr[1]);
			    System.out.println(g.LCA(root,x,y).data);
                t--;
            
        }
    }
  
}


// } Driver Code Ends


//User function Template for Java

// O(h), O(h)

// class BST
// {   
//     //Function to find the lowest common ancestor in a BST. 
// 	Node LCA(Node root, int n1, int n2)
// 	{
//         // code here.
//         List<Node> l1 = path_finder( root,  n1);
//         List<Node> l2 = path_finder(root,  n2);
//          Set<Node> s = new HashSet<>(l1);

         
//          for(int i = l2.size()-1; i>=0; i--)
//          {
//              if(s.contains(l2.get(i)))
//              return l2.get(i);
//          }
//          return  null;
//     }
//     List<Node> path_finder(Node root, int target) {
//         List<Node> path = new ArrayList<>();
//         while (root != null) {
//             path.add(root);
//             if (root.data == target) break;
//             if (target > root.data) {
//                 root = root.right;
//             } else {
//                 root = root.left;
//             }
//         }
//         return path;   
//     }
    
// }

// O(h), O(1)
class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
       while (root != null) {
            
            if (root.data > n1 && root.data > n2) {
                root = root.left;
            }
            else if (root.data < n1 && root.data < n2) {
                root = root.right;
            }
            else break;
        }
        return root;
    }
    
}

