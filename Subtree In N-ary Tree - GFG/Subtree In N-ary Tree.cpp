
class Solution{
    unordered_map<string, int> map;

public:
    int duplicateSubtreeNaryTree(Node *root){
        int ans = 0;
        solve(root);

        for (auto e : map)
            if (e.second > 1) ans++;

        return ans;
    }

    string solve(Node* root) {
        string s = to_string(root->data);
        for (auto nei : root->children)
            s += solve(nei);

        map[s] = map[s] + 1;
        return s;
    }
};
