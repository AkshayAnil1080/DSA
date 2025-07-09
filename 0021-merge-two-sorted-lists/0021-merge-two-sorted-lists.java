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
 //m1 (n+m)*log(n+m)
//  Sc: O(n+m)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>  al = new ArrayList<>();
        ListNode curr = list1;
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        curr = list2;
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(al);
        ListNode dummy= new ListNode(-1);
        curr=dummy;
       for(int i= 0; i<al.size(); i++){
            curr.next = new ListNode(al.get(i));
            curr=curr.next;
       }
       return dummy.next;
    }
}