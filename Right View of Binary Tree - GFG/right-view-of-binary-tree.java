//{ Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
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
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
			    Solution tree = new Solution();
                ArrayList<Integer> arr = tree.rightView(root);
                for(int x : arr)
                System.out.print(x +" ");
		        System.out.println();
    	        
	        }
	}
}


// } Driver Code Ends


//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


// class Solution{
//     //Function to return list containing elements of right view of binary tree.
//     ArrayList<Integer> rightView(Node root) {
//          ArrayList<Integer> b=new ArrayList<Integer>();
//      if(root == null) {
//           return b;
//         }
 
//         //Declare a queue and add a root node
//         Queue<Node> qu = new LinkedList<>();
//         qu.add(root);
 
//         //While queue is not empty
//         while(!qu.isEmpty()) {
//           //no. of record present in a queue   
//           int len = qu.size();
 
//           for(int i = 0; i < len; i++) {
//               Node node = qu.poll();
              
//               //Print last record of each level
//               if(i == len-1) {  // if(i==0) for left view
//                 b.add(node.data);
//               }
 
//               if(node.left != null) {
//                  qu.add(node.left);
//               }
 
//               if(node.right != null) {
//                   qu.add(node.right);
//               }
//           }
//       }
//       return b;
//     }
// }


class Solution{
    //Function to return list containing elements of right view of binary tree.
     int max_level ;
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        ArrayList<Integer> al = new ArrayList<>();
        max_level =0 ;
      if (root == null)
      return al;
      
      rightV(al, root,1);
      return al;
 
    }
   void rightV( ArrayList a, Node root, int level)
    {
        if (root ==null)
         return;
        
        if(max_level<level){
            a.add(root.data);
            max_level = level;
        }
        
        rightV(a, root.right, level+1);
        rightV(a, root.left, level+1);
        
    }    

}
