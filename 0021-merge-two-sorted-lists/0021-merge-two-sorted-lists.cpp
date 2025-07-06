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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        vector<int> values;

        // Traverse list1
        ListNode* curr = list1;
        while (curr != nullptr) {
            values.push_back(curr->val);
            curr = curr->next;
        }

        // Traverse list2
        curr = list2;
        while (curr != nullptr) {
            values.push_back(curr->val);
            curr = curr->next;
        }

        // Sort all values
        sort(values.begin(), values.end());

        // Create new sorted list from vector
        ListNode* dummy = new ListNode(-1);
        curr = dummy;
        for (int val : values) {
            curr->next = new ListNode(val);
            curr = curr->next;
        }

        return dummy->next;
    }
};
