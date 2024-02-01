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
    public ListNode reverseKGroup(ListNode head, int k) {

     ListNode curr=head, prevFirst=null; 
        //strore last node of reversed grp
        boolean isFirst=true;
         
        while(curr!=null)
        {
            ListNode first=curr;  // to store the starting node of each group, 
            //which will also be the last node after getting reversed.
            
            ListNode prev=null;
            int count = 0;
            ListNode countGroupNode = curr;
                while (countGroupNode != null && count < k) {
                    countGroupNode = countGroupNode.next;
                    count++;
            }
            if(count<k){
                 if(isFirst ){
                    return head;
                 }
                 else{
                    prevFirst.next = curr; 
                    break;
                 }
            }
            //reverse k nodes
             count=0;
             while(curr!=null && count<k){
        
                ListNode next=curr.next; 
                curr.next=prev; prev=curr; curr = next; 
                
                count++;
            } 
            if(isFirst ){
                head = prev;  isFirst=false;
            }
            else{
                prevFirst.next=prev; 
            }
           
            prevFirst=first; 
        }
         return head;
    }
}
