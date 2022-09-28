/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len=1;  // to handle lenth of linked list == n - here have to remove head and return head.next;
        if(head.next==null && n==1)
            return null;
        ListNode slow = head;
         ListNode fast = head;
        for(int i =0; i<n; i++)
        {
            if(fast.next!=null) 
            {
                fast=fast.next;
                len++;
            }
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
            len++;
        }
        if(len==n)
            return head.next;
        
        slow.next = slow.next.next==null ? null : slow.next.next;
        
        return head;
    }
}