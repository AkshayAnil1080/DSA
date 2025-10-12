Best Video Solution :https://youtu.be/S68tDCB4mTY


n,n
class Solution {
    unordered_map<Node*, int> dp;
    
    int dfs(Node* root) {
        // base case
        if(root == nullptr)
            return 0;
        
        if(dp.count(root))
            return dp[root];

        // dt
        int dt = dfs(root->left) + dfs(root->right);

        // take
        int take = root->data;
        if(root->left != nullptr){
            take += dfs(root->left->left) + dfs(root->left->right);
        }
        if(root->right != nullptr){
            take += dfs(root->right->left) + dfs(root->right->right);
        }

        int result = std::max(dt, take);
        dp[root] = result;
        return result;
    }

public:
    int getMaxSum(Node *root) {
        dp.clear();
        return dfs(root);
    }
};
