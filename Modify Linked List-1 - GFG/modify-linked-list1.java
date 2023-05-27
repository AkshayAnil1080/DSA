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
        //make array and ele in list
        ArrayList<Integer> al = new ArrayList<>();
        Node curr = head;
        while(curr!=null)
        {
            al.add(curr.data);
            curr=curr.next;
        }
        int n = al.size();
         curr=head;
        for(int i=0; i<n/2; i++)
        {
            int x =   al.get(n-i-1) - al.get(i);
           al.set(n-i-1,al.get(i));
           
           al.set(i,x);
        }
        int i =0; 
        while(curr!=null)
        {
            curr.data = al.get(i++);
            curr=curr.next;
        }
        return head;
    }
}
