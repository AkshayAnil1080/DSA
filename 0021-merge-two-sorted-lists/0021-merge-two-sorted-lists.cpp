/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
// **/
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        return merge(list1, list2);
    }

private:
    ListNode* merge(ListNode* h1, ListNode* h2) {
        // If either list is empty, return the non-empty list
        if (h1 == nullptr) return h2;
        if (h2 == nullptr) return h1;

        // Recursive case
        if (h1->val <= h2->val) {
            h1->next = merge(h1->next, h2);
            return h1;
        } else {
            h2->next = merge(h1, h2->next);
            return h2;
        }
    }
};