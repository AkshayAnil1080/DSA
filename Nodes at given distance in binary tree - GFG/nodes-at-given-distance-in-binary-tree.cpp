//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// Tree Node
struct Node
{
    int data;
    Node* left;
    Node* right;
};

// Utility function to create a new Tree Node
Node* newNode(int val)
{
    Node* temp = new Node;
    temp->data = val;
    temp->left = NULL;
    temp->right = NULL;
    
    return temp;
}

// Function to Build Tree
Node* buildTree(string str)
{   
    // Corner Case
    if(str.length() == 0 || str[0] == 'N')
            return NULL;
    
    // Creating vector of strings from input 
    // string after spliting by space
    vector<string> ip;
    
    istringstream iss(str);
    for(string str; iss >> str; )
        ip.push_back(str);
        
    // Create the root of the tree
    Node* root = newNode(stoi(ip[0]));
        
    // Push the root to the queue
    queue<Node*> queue;
    queue.push(root);
        
    // Starting from the second element
    int i = 1;
    while(!queue.empty() && i < ip.size()) {
            
        // Get and remove the front of the queue
        Node* currNode = queue.front();
        queue.pop();
            
        // Get the current node's value from the string
        string currVal = ip[i];
            
        // If the left child is not null
        if(currVal != "N") {
                
            // Create the left child for the current node
            currNode->left = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->left);
        }
            
        // For the right child
        i++;
        if(i >= ip.size())
            break;
        currVal = ip[i];
            
        // If the right child is not null
        if(currVal != "N") {
                
            // Create the right child for the current node
            currNode->right = newNode(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }
    
    return root;
}


// } Driver Code Ends
/* A binary Tree node
struct Node
{
    int data;
    struct Node *left, *right;
};
*/
class Solution
{
private:

public:

    vector <int> KDistanceNodes(Node* root, int tar , int k)
    {
        /// Return the sorted list of all nodes at k distance
        // 1. Make a map to store all node neighbors
        Node* target = findTarget(root, tar);
        unordered_map<Node*, Node*> parent;
        markParent(root, parent);

        // BFS and traverse for its left, right, and parent - stop when traversal times == k
        // Maintain a Set for visited Node

        vector<int> res = fun(parent, target, k);

        return res;
    }
    //2
      void markParent(Node* root, unordered_map<Node*, Node*>& parent) {
        queue<Node*> q; // for BFS
        q.push(root);
        while (!q.empty()) {
            Node* curr = q.front();
            q.pop();

            if (curr->left != nullptr) {
                parent[curr->left] = curr;
                q.push(curr->left);
            }
            if (curr->right != nullptr) {
                parent[curr->right] = curr;
                q.push(curr->right);
            }
        }
    }
//3
     vector<int> fun(unordered_map<Node*, Node*>& parent, Node* target, int k) {
        queue<Node*> q; // for BFS
        unordered_set<Node*> vis; // for visited nodes

        q.push(target);
        vis.insert(target);
        int count = 0;
        while (!q.empty()) {
            int size = q.size();

            // Breaking when traversal time == k, then we reached all kth nodes from the target.
            if (count == k) break;
            count++;

            // Traversing left, right, and upwards.
            for (int i = 0; i < size; i++) {
                Node* curr = q.front();
                q.pop();
                if (curr->left != nullptr && vis.find(curr->left) == vis.end()) {
                    q.push(curr->left);
                    vis.insert(curr->left);
                }

                if (curr->right != nullptr && vis.find(curr->right) == vis.end()) {
                    q.push(curr->right);
                    vis.insert(curr->right);
                }

                if (parent.find(curr) != parent.end() && vis.find(parent[curr]) == vis.end()) {
                    q.push(parent[curr]);
                    vis.insert(parent[curr]);
                }
            }
        }
        vector<int> ans;
        while (!q.empty()) {
            Node* curr = q.front();
            q.pop();
            ans.push_back(curr->data);
        }
        sort(ans.begin(), ans.end());
        return ans;
    }
    //1
     Node* findTarget(Node* root, int target) {
        if (root == nullptr || root->data == target)
            return root;

        Node* left = findTarget(root->left, target);
        Node* right = findTarget(root->right, target);

        if (left != nullptr)
            return left;

        return right;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    getchar();
    
    Solution x = Solution();
    
    while(t--)
    {
        string s;
        getline(cin,s);
        Node* head = buildTree(s);
        
        int target, k;
        cin>> target >> k;
        getchar();
        
        vector <int> res = x.KDistanceNodes(head, target, k);
        
        for( int i=0; i<res.size(); i++ )
            cout<< res[i] << " ";
        cout<<endl;
    }
    return 0;
}

// } Driver Code Ends