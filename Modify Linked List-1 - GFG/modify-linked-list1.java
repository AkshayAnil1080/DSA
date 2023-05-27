//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            int n=Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            Node head=new Node(Integer.parseInt(s[0]));
            Node copy=head;
            for(int i=1;i<n;i++){
                Node temp=new Node(Integer.parseInt(s[i]));
                copy.next=temp;
                copy=copy.next;
            }
            Solution ob=new Solution();
            Node ans=ob.modifyTheList(head);
            while(ans!=null){
                out.print(ans.data+" ");
                ans=ans.next;
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static Node modifyTheList(Node head)
    {
     Node mid = get_m(head);
     
     //partion 2nd list
     Node backlist = mid.next;  // 3->6 -> N
     
     //mark next as null for last node of first list
     mid.next=null;  //10 > 4 > 5> N
     
     backlist = reverse(backlist);  //6 >3 >N
     
     //itr in both list , store diff in 1st and copy 1st list data to 2nd
     Node curr1 = head; Node curr2 = backlist;
     while(curr2!=null)
     {
         int temp = curr1.data;
         curr1.data = curr2.data-temp;
         curr2.data = temp;
         
         curr1 = curr1.next; curr2=curr2.next;
     }
    //  1st : -4, -1, 5 -> N  || 2nd : 10>4>N
     //3. reverse 2nd list and append in 1st(last node of 1st list is mid)
     mid.next  = reverse(backlist);
     return head;
    }
   static Node get_m(Node head)
    {
        Node f=head;
        Node s=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
   static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            
            curr=next; // repeat the above three lines for next nodes;
        }
        return prev;
    }
}
