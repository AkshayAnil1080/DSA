// best video solution ever - https://youtu.be/V8lpOgP_5fk
/*
class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int x) {
        data = x;
        left = right = NULL;
    }
};
*/

struct Pair {
    Node* node;
    int width;
    Pair(Node* n, int w) : node(n), width(w) {}
};

class Solution {
public:
    vector<int> bottomView(Node* root) {
        vector<int> result;
        if (root == nullptr)
            return result;

        queue<Pair> q;
        map<int, int> mp;

        q.push(Pair(root, 0));

        while (!q.empty()) {
            Pair p = q.front();
            q.pop();

            Node* temp = p.node;
            int d = p.width;

            // Overwrite the value at horizontal distance d
            mp[d] = temp->data;

            if (temp->left != nullptr)
                q.push(Pair(temp->left, d - 1));

            if (temp->right != nullptr)
                q.push(Pair(temp->right, d + 1));
        }

        for (auto it : mp) {
            result.push_back(it.second);
        }

        return result;
    }
};
