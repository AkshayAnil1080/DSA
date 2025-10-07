
Best Video Solution ever - https://youtu.be/_xnl0tzL5gg

/*
class Node {
public:
    int data;
    Node *left;
    Node *right;

    Node(int x) {
        data = x;
        left = NULL;
        right = NULL;
    }
};
*/

class Solution {
    int preIndex;
    unordered_map<int,int> postMap;

    Node* constructFromPrePost(vector<int> &pre, vector<int> &post, int postStart, int postEnd) {
        if(postStart > postEnd) return nullptr;

        Node* root = new Node(pre[preIndex++]);

        if(postStart == postEnd) return root;

        int i = postMap[pre[preIndex]];

        root->left = constructFromPrePost(pre, post, postStart, i);
        root->right = constructFromPrePost(pre, post, i+1, postEnd-1);

        return root;
    }

  public:
    Node* constructTree(vector<int> &pre, vector<int> &post) {
        preIndex = 0;
        postMap.clear();
        int n = pre.size();
        for(int i = 0; i < n; i++) {
            postMap[post[i]] = i;
        }
        return constructFromPrePost(pre, post, 0, n-1);
    }
};
