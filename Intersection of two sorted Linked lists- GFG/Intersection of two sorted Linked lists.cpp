
class Solution
{
    public:
    Node* findIntersection(Node* t1, Node* t2)
    {
       Node* result = nullptr;
        Node* curr = nullptr;

        std::unordered_map<int, int> set;
        while (t1 != nullptr) {
            set[t1->data] = set[t1->data] + 1;
            t1 = t1->next;
        }

        while (t2 != nullptr) {
            if (set.find(t2->data) != set.end() && set[t2->data] > 0) {
                set[t2->data] = set[t2->data] - 1;
                if (result == nullptr) {
                    result = new Node(t2->data);
                    curr = result;
                } else {
                    curr->next = new Node(t2->data);
                    curr = curr->next;
                }
            }
            t2 = t2->next;
        }

        return result;
    }
};

