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
       int len = 1;  // to track total length
        ListNode* slow = head;
        ListNode* fast = head;

        // Move fast n steps ahead and count length
        for (int i = 0; i < n; i++) {
            if (fast->next != nullptr) {
                fast = fast->next;
                len++;
            }
        }

        // Move both fast and slow pointers
        while (fast->next != nullptr) {
            slow = slow->next;
            fast = fast->next;
            len++;
        }

        // If we need to remove the head node
        if (len == n) {
            return head->next;
        }

        // Remove nth node from end
        slow->next = slow->next->next;

        return head;
    }
};