class Solution{
    public:
    // return true/false denoting whether the tree is Symmetric or not
    bool isSymmetric(struct Node* root)
    {
	    if (root == nullptr)
            return true;

        stack<Node*> st;
        st.push(root->left);
        st.push(root->right);

        while (!st.empty()) {
            Node* t1 = st.top(); st.pop();
            Node* t2 = st.top(); st.pop();

            if (t1 == nullptr && t2 == nullptr)
                continue;
            if (t1 == nullptr || t2 == nullptr)
                return false;
            if (t1->data != t2->data)
                return false;

            st.push(t1->right); st.push(t2->left);
            st.push(t1->left); st.push(t2->right);
        }
        return true;
    }
};
