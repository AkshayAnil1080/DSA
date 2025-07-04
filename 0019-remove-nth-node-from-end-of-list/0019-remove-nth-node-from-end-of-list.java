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
        //1 get length
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length++; curr=curr.next;
        }

        //if remove head node
         if (n == length) {
            return head.next;
        }

        curr=head;
        for(int i=1; i<length-n;i++){
            curr=curr.next;
        }
        //remove nth node
        curr.next = curr.next.next;

        return head;
    }
}