Best Video Solution with Live Coding: https://youtu.be/WIEfybZx1NY
LIKE | SHARE | SUBSCRIBE


n,ht of tree
  class Solution {
    
  public:
   int sum;
    void transformTree(Node *root) {
        // code here
          sum = 0;
        dfs(root);
    }
    void dfs(Node* root) {
        if (root == NULL)
            return;
        
        dfs(root->right);
        
        sum += root->data;
        root->data = sum - root->data;
        
        dfs(root->left);
    }
    
};
