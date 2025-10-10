Best Video Solution : https://youtu.be/aE8w7I_5b-w



class Solution {
    int maxSum;
    
    int dfs(Node* root) {
        if (!root) return 0;
        
        int leftMax = std::max(dfs(root->left), 0);
        int rightMax = std::max(dfs(root->right), 0);

        // Compute max path sum WITH split
        maxSum = std::max(maxSum, root->data + leftMax + rightMax);

        // WITHOUT split
        return root->data + std::max(leftMax, rightMax);
    }
public:
    int findMaxSum(Node* root) {
        maxSum = root->data;
        dfs(root);
        return maxSum;
    }
};
