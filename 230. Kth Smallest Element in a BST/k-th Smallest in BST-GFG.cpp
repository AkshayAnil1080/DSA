Best Video Solution with Live Coding: https://youtu.be/6y1Q8Cm9SK0
LIKE | SHARE | SUBSCRIBE



k,1
  class Solution {
public:
    int kthSmallest(Node* root, int k) {
        Node* curr = root;
        while (curr != nullptr) {
            if (curr->left == nullptr) {
                if (k == 1) return curr->data;
                k--;
                curr = curr->right;
            } else {
                Node* prev = curr->left;
                while (prev->right != nullptr && prev->right != curr)
                    prev = prev->right;

                if (prev->right == nullptr) {
                    prev->right = curr;
                    curr = curr->left;
                } else {
                    prev->right = nullptr;
                    if (k == 1) return curr->data;
                    k--;
                    curr = curr->right;
                }
            }
        }
        return -1;
    }
};



//m1
//n,ht of tree
class Solution {
    int count;
    int result;
    
public:
    int kthSmallest(Node* root, int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result;
    }

private:
    void inorder(Node* root, int k) {
        if (root == nullptr || count >= k) 
            return;
        inorder(root->left, k);
        count++;
        if (count == k) {
            result = root->data;
            return;
        }
        inorder(root->right, k);
    }
};
