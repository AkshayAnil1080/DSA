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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        ListNode* res = nullptr;

        for (ListNode* curr : lists) {
            res = merge(res, curr);
        }

        return res;
    }

private:
    // Merge two sorted linked lists
    ListNode* merge(ListNode* h1, ListNode* h2) {
        // 1. Dummy node to build merged list
        ListNode* dummy = new ListNode(-1);
        ListNode* curr = dummy;

        // 2. Merge both lists
        while (h1 != nullptr && h2 != nullptr) {
            if (h1->val <= h2->val) {
                curr->next = h1;
                h1 = h1->next;
            } else {
                curr->next = h2;
                h2 = h2->next;
            }
            curr = curr->next;
        }

        // 3. Attach remaining part
        if (h1 != nullptr) {
            curr->next = h1;
        } else {
            curr->next = h2;
        }

        return dummy->next;
    }
};