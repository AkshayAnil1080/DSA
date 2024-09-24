https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
Palindrome Linked List
Difficulty: MediumAccuracy: 41.48%Submissions: 319K+Points: 4
Given a singly linked list of integers. The task is to check if the given linked list is palindrome or not.

Examples:

Input: LinkedList: 1->2->1->1->2->1
Output: true
Explanation: The given linked list is 1->2->1->1->2->1 , which is a palindrome and Hence, the output is true.

  M2 - Optimized
  // find the middle node, reverse the second half and compare 1st with 2nd half
TC: O(n),
SC: O(1)
  
class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        // get middle
        if(head.next == null)//have single node
        return true;
        
        Node slow = head, fast=head, preptrslow =null;
        while(fast!=null && fast.next!=null){
            preptrslow = slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        preptrslow.next = null;
        
        // reverse the second half
        Node secondHead = reverse(slow);
        //compare the two list
        while(head!=null && secondHead!=null){
            if(head.data !=secondHead.data){
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        return true;
    }
    
    Node reverse(Node head){
        Node curr=head, prev=null, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr=next;
        }
        return prev;
    }
}


m2 - Using Stack Space
TC: O(n),
SC:O(n)

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        Node curr = head;
        //add data to stack
        while(curr!=null){
            st.push(curr.data);
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            if(st.pop()!=curr.data)
            return false;
           
            curr=curr.next;
        }
        return true;
    }
}
