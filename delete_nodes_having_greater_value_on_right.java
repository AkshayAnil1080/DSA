/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        // Check if the input list is empty or contains only one node, in which case
        // nothing needs to be removed
        if (head == null || head.next == null)
            return head;

        Node curr = head;
        while (curr != null && curr.next != null) {
            // Check if the current node's value is less than the next node's value
            if (curr.data < curr.next.data) {
                // If true, update the current node's value with the next node's value
                curr.data = curr.next.data;
                // Remove the next node by bypassing it in the list
                curr.next = curr.next.next;
                // Reset the current pointer to the head to recheck the entire list
                curr = head;
            } else {
                // If the current node's value is not less than the next node's value, move to
                // the next node
                curr = curr.next;
            }
        }

        // Return the modified head of the list
        return head;
    }
}
