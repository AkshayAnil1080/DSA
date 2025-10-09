Best solution ever with live coding - https://youtu.be/4zHgaANyJLM

//m1 c++

class Solution {
public:
    vector<int> zigZagTraversal(Node* root) {
        vector<int> al;
        if (!root) return al;

        stack<Node*> s1; // For left to right
        stack<Node*> s2; // For right to left

        s1.push(root);

        while (!s1.empty() || !s2.empty()) {
            while (!s1.empty()) {
                Node* temp = s1.top();
                s1.pop();
                al.push_back(temp->data);

                if (temp->left)
                    s2.push(temp->left);
                if (temp->right)
                    s2.push(temp->right);
            }

            while (!s2.empty()) {
                Node* temp = s2.top();
                s2.pop();
                al.push_back(temp->data);

                if (temp->right)
                    s1.push(temp->right);
                if (temp->left)
                    s1.push(temp->left);
            }
        }
        return al;
    }
};

//
//m2 c++

class Solution {
public:
    vector<int> zigZagTraversal(Node* root) {
        vector<int> res;
        if (!root) return res;

        deque<Node*> dq;
        dq.push_back(root);
        bool evenLevel = true;

        while (!dq.empty()) {
            int n = dq.size();
            for (int i = 0; i < n; i++) {
                if (evenLevel) {a
                    Node* curr = dq.front();
                    dq.pop_front();
                    res.push_back(curr->data);
                    if (curr->left) dq.push_back(curr->left);
                    if (curr->right) dq.push_back(curr->right);
                } else {
                    Node* curr = dq.back();
                    dq.pop_back();
                    res.push_back(curr->data);
                    if (curr->right) dq.push_front(curr->right);
                    if (curr->left) dq.push_front(curr->left);
                }
            }
            evenLevel = !evenLevel;
        }
        return res;
    }
};
