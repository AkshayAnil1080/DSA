

Best solution ever with live coding - https://youtu.be/njSs-j9yUoU
n,h
class Solution {
    int ans;
public:
    int distCandy(Node* root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    
    int dfs(Node* root) {
        if (root == nullptr)
            return 0;

        int l = dfs(root->left);
        int r = dfs(root->right);

        ans += abs(l) + abs(r); // number of moves cannot be negative

        // Return remaining nodes / required nodes to parent to balance the current node.
        return root->data + l + r - 1;
    }
};
