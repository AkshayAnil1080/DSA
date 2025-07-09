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
    public ListNode mergeKLists(ListNode[] lists) {
         // Step 1: Define a min heap based on ListNode value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );


        // Step 2: Add head of each non-null list to the minHeap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        // Step 3: Create a dummy node to build the result
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // Step 4: Build the merged list
        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll(); // getting node smallest value
            curr.next = smallest;
            curr = curr.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next); // push next node from same list
            }
        }
        return dummy.next;
    }
}