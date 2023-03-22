//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;
#define MAX_HEIGHT 100000

// Tree Node
struct Node {
    int data;
    Node *right;
    Node *left;

    Node(int x) {
        data = x;
        right = NULL;
        left = NULL;
    }
};

Node *insert(Node *tree, int val) {
    Node *temp = NULL;
    if (tree == NULL) return new Node(val);

    if (val < tree->data) {
        tree->left = insert(tree->left, val);
    } else if (val > tree->data) {
        tree->right = insert(tree->right, val);
    }

    return tree;
}


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
  int res;
    int maxDifferenceBST(Node *root,int target)
  {
        int sum=0;
        Node* curr=root;
        while(curr!=NULL)
        {
            if(curr->data==target)
                break;
            else if(curr->data < target)
            {
                sum+= curr->data;
                curr = curr->right;
            }
            else
            {
                sum+= curr->data;
                curr= curr->left;
            }
        }
        if(curr==NULL) 
            return -1;
        else 
        {   
            if(curr->left==NULL && curr->right==NULL)
            {
                return sum;
            }
            res=INT_MIN;
            if(curr->left!=NULL)
                solve(curr->left,0,sum);

            if(curr->right!=NULL)
                solve(curr->right,0,sum);

            return res;
        }
    }

    void solve(Node* root, int path_sum , int sum)
    {
        if(root==NULL)
            return;
        if(root->left==NULL && root->right==NULL)
        {
            res = max(res, sum - (path_sum+root->data));
            return;
        }
        solve(root->left, path_sum+root->data, sum);
        solve(root->right, path_sum+root->data, sum);
    }
};

//{ Driver Code Starts.

int main() {
    int T;
    cin >> T;
    while (T--) {
        Node *root = NULL;

        int N;
        cin >> N;
        for (int i = 0; i < N; i++) {
            int k;
            cin >> k;
            root = insert(root, k);
        }

        int target;
        cin >> target;
        Solution ob;
        cout << ob.maxDifferenceBST(root, target);
        cout << endl;
    }
}
// } Driver Code Ends