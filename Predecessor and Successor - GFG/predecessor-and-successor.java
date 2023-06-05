//{ Driver Code Starts
//Initial Template for Java
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
    
    static Node pre,suc;
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
	            int k=Integer.parseInt(br.readLine());
        	    pre=null;
        	    suc=null;
                findPreSuc(root,k);
                if(pre!=null){
                    System.out.print(pre.data+" ");
                }else{
                    System.out.print("-1 ");
                }
                if(suc!=null){
                    System.out.println(suc.data);
                }else{
                    System.out.println("-1 ");
                }
        }
    }
  
// } Driver Code Ends



//Function to check whether a Binary Tree is BST or not.
public static void findPreSuc(Node root, int key)
{
    // code here.
    
    /* There are two static nodes defined above pre(representing predecessor) and suc(representing successor) as follows:
       static Node pre=null,suc=null
       You need to update these both.
       And the data inside these classes will be printed automatically by the driver code. 
    */
  ArrayList<Integer> al  = new ArrayList<>();
    ino(root,key,al);
    
    int a1=-1; int a2=-1;
       /*for(int i=0; i<al.size(); i++)
       System.out.print(al.get(i)+ " ");*/
    for(int i=0; i<al.size(); i++)
    {
 
        if(al.get(i)>key)
        {
            a1= al.get(i);
           if( (i-1)>=0 && al.get(i-1)!=key )
               a2 = al.get(i-1);
             
            if((i-2)>=0 && al.get(i-1)==key  )
                a2 =  al.get(i-2);
                
             break;
        }
        
         if(i==al.size()-1 &&  al.get(i)<key) /// 1 6 8 10 , k=11
        a2 = al.get(i);
        
         if(i==al.size()-1 &&  al.get(i)==key) // 1 5 8 25,  k=25
             a2 = al.get(i-1);
    }
    
        
     pre = new Node(a2);
     suc = new Node(a1);
    
}

  static void ino(Node root,int k, ArrayList<Integer> al )
    {
        if(root!=null)
       {
        ino(root.left,k,al);
        al.add(root.data);
        ino(root.right, k, al);
       }
        
    }
}