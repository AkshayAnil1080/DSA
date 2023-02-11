//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends

// loglogn  + n , O(n)
class Solution
{
    Node primeList(Node head){
        //code here
        
        //pre processing - seive
        int n=100000;
        boolean isPrime[] = new boolean [n];
        Arrays.fill(isPrime, true);//every num is prime
        
        for(int i=2; i*i<n; i++)
        {
            if(isPrime[i]==true)
            {
                for(int j=i*i ;j<n; j+=i)
                isPrime[j]=false;
            }
        }
        ///
        Node  curr = head;
        while(curr!=null)
        {
            if(curr.val==1)
            {
                curr.val=2; curr=curr.next ; continue;
            }
            // else
            int x=curr.val; int y= curr.val;
            while(!isPrime[x]) //O(1)
            x--;
             while(!isPrime[y]) 
            y++;
            
            //chech the nearest one
            if(curr.val-x > y-curr.val)
            {
                curr.val=y;
            }
            else //<=
            curr.val=x;
            
            curr=curr.next;
        }
        return head;
        
    }
   
}