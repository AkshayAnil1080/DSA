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
    struct compare {
        bool operator()(ListNode* a, ListNode* b) {
            return a->val > b->val;  // min-heap: smallest value comes first
        }
    };

    ListNode* mergeKLists(vector<ListNode*>& lists) {
        priority_queue<ListNode*, vector<ListNode*>, compare> minHeap;

        // Step 1: Push head of each non-null list into the heap
        for (ListNode* node : lists) {
            if (node != nullptr) {
                minHeap.push(node);
            }
        }

        // Step 2: Dummy node for result list
        ListNode* dummy = new ListNode(-1);
        ListNode* curr = dummy;

        // Step 3: Build the merged list
        while (!minHeap.empty()) {
            ListNode* smallest = minHeap.top();
            minHeap.pop();

            curr->next = smallest;
            curr = curr->next;

            if (smallest->next != nullptr) {
                minHeap.push(smallest->next);
            }
        }

        return dummy->next;
    }
};