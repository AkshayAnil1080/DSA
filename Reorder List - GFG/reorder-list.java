//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
// Tc: o(n
// Sc: O(1)
class Solution {
    Node reorderlist(Node head) {
        // Your code here
        //s1
        Node slow = head; Node fast = slow.next;
        while(fast!=null && fast.next!=null) // n/2
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node l1 = head; // 1>2>3
        Node l2 = slow.next; //4>5
        slow.next=null;
        
        //s2
        l2 = reverse(l2);
        
        // s3 merger
        Node ans = new Node(0);
        Node curr=ans;
        
        while(l1!=null || l2!=null) //n/2
        {
            if(l1!=null)
            {
                curr.next =l1;
                curr=curr.next;
                l1 = l1.next;
            }
            
             if(l2!=null)
            {
                curr.next =l2;
                curr=curr.next;
                l2 = l2.next;
            }
        }
        return ans.next;
    }
    
    //s2 rev
    Node reverse(Node head )
    {
        Node prev= null; Node curr = head,next;
        while(curr!=null)
        {
            next = curr.next;
            
            // 3 steps
            curr.next = prev;
            prev = curr;
            curr=  next;
        }
        return prev;
    }
}
