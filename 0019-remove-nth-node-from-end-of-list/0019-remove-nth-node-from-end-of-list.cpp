/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        // Step 1: Get the length of the list
        ListNode* curr = head;
        int length = 0;
        while (curr != nullptr) {
            length++;
            curr = curr->next;
        }

        // Step 2: If we need to remove the head node
        if (n == length) {
            return head->next;
        }

        // Step 3: Move to (length - n - 1)th node
        curr = head;
        for (int i = 1; i < length - n; i++) {
            curr = curr->next;
        }

        // Step 4: Remove the nth node from end
        if (curr->next != nullptr) {
            curr->next = curr->next->next;
        }

        return head; 
    }
};