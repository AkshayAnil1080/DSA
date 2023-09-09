//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals("N")) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            int key = Integer.parseInt(br.readLine().trim());
            Solution T = new Solution();
            root = T.insert(root, key);
            inorder(root);
            System.out.println();
            t--;
        }
    }

    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// } Driver Code Ends


// User function Template for Java

// class Solution{
    
//     // The function returns the root of the BST (currently rooted at 'root') 
//     // after inserting a new Node with value 'Key' into it. 
//     Node insert(Node root, int key)
//     {
//         // your code here
        
//         if(root ==null)
//         root = new Node(key);
        
        
//         if(key < root.data)
//         {
            
//           root.left =  insert(root.left , key);
//         }
//         else if(key  > root.data)
//         {
//             root.right = insert(root.right , key);
//         }
//         return root;
//     }
// }

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int x) {
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.data>x)
                curr=curr.left;
            else if(curr.data<x)
                curr=curr.right;
            else  // node already present , do not make any change in BST
                return root;
        }
        // decide the node to be placed on left or right.
        if(parent==null) // empty BST is passed.
            return temp;
        if(parent.data>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }
}
