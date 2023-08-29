//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
// class Solution
// {
//     Node compute(Node head)
//     {
     
//         if(head.next==null)return head;
        
//         int max=Integer.MAX_VALUE;
//         Node new_n=new Node(max);
        
//         Stack<Node> stack=new Stack<Node>();
//         stack.push(new_n);
//         while(head!=null)
//         {
//             while(stack.peek().data<head.data)
//             stack.pop();
            
//             stack.peek().next=head;
//             stack.push(head);
//             head=head.next;
//         }
//         return new_n.next;
//     }
 
// }
class Solution
{
    Node compute(Node head)
    {
        // your code here
        Node new_head =  rev(head);
        Node curr = new_head;
        Node temp=null;
        Node maxNode = curr;
        while(curr.next!=null){
            
          
          if(curr.next.data < maxNode.data )
            {
                temp=curr.next;
                curr.next = temp.next;
            }
            else
            {
                curr=curr.next;
                maxNode=curr;
            }
        }
        
        return rev(new_head);
        
    }
    Node rev(Node head)
    {
        Node prev=null, next=null; Node curr=head;
        
        while(curr!=null)
        {
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}


  