//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
public class Absolute_List_Sort
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head,PrintWriter out)
    {
        Node temp = head;
        while (temp != null)
        {
           out.print(temp.data+" ");
           temp = temp.next;
        }  
        out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
			head = node;
		else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;

		   temp.next = node;
		}
    }
	  
    /* Drier program to test above functions */
    public static void main(String args[])throws IOException
    {
       
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        // Scanner sc = new Scanner(System.in);
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
// 		int t=sc.nextInt();
        int t=Integer.parseInt(in.readLine().trim());
		 
		while(t>0)
        {
// 			int n = sc.nextInt();
            int n=Integer.parseInt(in.readLine().trim());
			Absolute_List_Sort llist = new Absolute_List_Sort();
			//int n=Integer.parseInt(br.readLine());
// 			int a1=sc.nextInt();
            String s[]=in.readLine().trim().split(" ");
            int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
			Node temp=head;
            for (int i = 1; i < n; i++) 
			{
				// int a = sc.nextInt();
				int a=Integer.parseInt(s[i]);
				temp.next=new Node(a);
				temp=temp.next;
			}
          
            Solution gfgobj = new Solution(); 
    		llist.head = gfgobj.sortList(head);
    		llist.printList(llist.head,out);
		
			t--;
		}
		out.close();
	}
}
// } Driver Code Ends


/* The structure of the node of the Linked List is
class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
*/

class Solution
{
	Node sortList(Node head) {
		// Your code here
		Node prev = head;
		Node curr = head.next;
		//s2
		while(curr!=null)
		{
		    if(prev.data > curr.data) // eg 1 -2
		    {
		        prev.next = curr.next;
		        curr.next = head;
		        //update head as curr
		        head = curr;
		        
		        curr = prev ;  // to check the nexr two nodes
		    }
		    else // 1 2
		    {
		        prev = curr;
		    }
		    curr = curr.next;
		    
		}
		return head;
	}
}