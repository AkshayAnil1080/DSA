
Best Video Solution with Live Coding: https://youtu.be/S7FG_Ea4j_8
LIKE | SHARE | SUBSCRIBE

  n,ht of tree

/*
class Node {
  public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};
*/
class Solution {
  public:
    Node* removekeys(Node* root, int l, int r) {
        return dfs(root, l, r);
    }
    
    Node* dfs(Node* root, int l, int r) {
        if (root == NULL)
            return NULL;
        
        // modifying left and right
        root->left = dfs(root->left, l, r);
        root->right = dfs(root->right, l, r);
        
        if (root->data < l) {
            return root->right;
        }
        if (root->data > r) {
            return root->left;
        }
        return root;
    }
};
