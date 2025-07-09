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
//  time : O(k * k * n)
// space : O(1)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       ListNode res = null;
       for(ListNode curr : lists){
        res = merge(res, curr);
       }
       return res;
    }
    //   TC: O(n+m) ~ k*n =>  n = number of ele in each list. 
    // n+ 2n+ 3n +....n*k
 //SC: O(1)
    ListNode merge(ListNode h1, ListNode h2){
       // 1. Create a dummy node to track the head of the resultant list
        //1. crete dummy node to track head of the resultant LL
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy; 

        //2. traverse from both ll and (add, iterate) in the smaller one 
        while(h1!=null && h2!=null){
            if(h1.val <= h2.val){
            curr.next=h1;
              h1= h1.next;
            }
            else{
                curr.next = h2;
                h2=h2.next;
            }

             curr=curr.next;
        }
        //traverse through either remaining non empty list
        if(h1!=null){
            curr.next = h1;
        }
        else{
            curr.next=h2;
        }

        return dummy.next;
    }
}