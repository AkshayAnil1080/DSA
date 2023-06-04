int minDiff(Node* root, int K) {
    return help(root, K);
}

int help(Node* root, int k) {
    if (root == nullptr) return INT_MAX;
    
    if (root->data == k)
        return 0;
        
    if (root->data > k)
        return std::min(root->data - k, help(root->left, k));
    
    return std::min(k - root->data, help(root->right, k));
}
