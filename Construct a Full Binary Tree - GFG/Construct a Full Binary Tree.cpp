
class Solution{
    int preIndex = 0;
    
  public:
    Node* constructBinaryTree(int pre[], int preMirror[], int size)
    {
        Node* root = build(pre, preMirror, 0, size - 1, size);
        return root;
    }

    Node* build(int pre[], int preM[], int l, int h, int size) {
        if (preIndex >= size)
            return NULL;

        Node* root = new Node(pre[preIndex++]);

        if (l == h)
            return root;

        int i;
        for (i = l; i <= h; ++i) {
            if (pre[preIndex] == preM[i])
                break;
        }

        root->left = build(pre, preM, i, h, size);
        root->right = build(pre, preM, l + 1, i - 1, size);

        return root;
    }
};
