//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException
    {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for(int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));

        return head;
    }

    public static void printList(Node node)
    {
        while (node != null)
        {
    		System.out.print(node.data + " ");
    		node = node.next;
    	}
    	System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node head = Node.inputList(br);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            Node res = obj.reverse(head, k);
            
            Node.printList(res);
            
        }
    }
}

// } Driver Code Ends


/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node curr = head;
        //itr for k-1 times
        for(int i=1; i<k; i++)
        {
            curr=curr.next;
        }
        Node new_head = curr.next;
        curr.next =null;
        
        Node r1 = reverse(head);
        Node r2 = reverse(new_head);
        
        //lets traverse in r1 till last- then pt it to  r2
         curr = r1;
         while(curr.next!=null)
         curr=curr.next;
         
         curr.next = r2;
         
         return r1;
         
        
    }
    static Node reverse(Node head)
    {
        Node curr=head; Node prev=null; Node next=null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev=curr; curr=next;
        }
        return prev;
        
    }
}
   
   
   
   
   
   
   
   
   
   
   
