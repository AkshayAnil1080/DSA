//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// Tree Node
struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};

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
    Node* root = new Node(stoi(ip[0]));
        
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
            currNode->left = new Node(stoi(currVal));
                
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
            currNode->right = new Node(stoi(currVal));
                
            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }
    
    return root;
}


// } Driver Code Ends
/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};
*/

// return the Kth largest element in the given BST rooted at 'root'
// class Solution
// {
//     public:
//     int kthLargest(Node *root, int k)
//     {
//         vector<int> elements;
//         inorder(root, elements);

//         if (k > elements.size())
//             return -1;

//         return elements[elements.size() - k];
//     }

//     void inorder(Node* root, vector<int>& elements) {
//         if (root != nullptr) {
//             inorder(root->left, elements);
//             elements.push_back(root->data);
//             inorder(root->right, elements);
//         }
//     }
// };

class Solution
{
    public:
    int kthLargest(Node *root, int K)
    {
       Node* ans = morris(root, K);
        return (ans != nullptr) ? ans->data : -1;
    }

    Node* morris(Node* curr, int k) {
        while (curr != nullptr) {
            if (curr->right == nullptr) {
                // Print root node
                if (k == 1)
                    return curr;
                k--;
                curr = curr->left;
            } else {
                // Finding the inorder successor
                Node* prev = curr->right;
                while (prev->left != nullptr && prev->left != curr)
                    prev = prev->left;

                if (prev->left == nullptr) {
                    prev->left = curr; // Making a thread and now move right
                    curr = curr->right;
                } else {
                    prev->left = nullptr; // Remove it, as the thread is already present
                    if (k == 1)
                        return curr;
                    k--;
                    curr = curr->left;
                }
            }
        }
        return nullptr;
    }
};
 

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    getchar();
    
    while(t--)
    {
        string s;
        getline(cin,s);
        Node* head = buildTree(s);
        
        int k;
        cin>>k;
        getchar();
        
        Solution ob;
        cout << ob.kthLargest( head, k ) << endl;
    }
    return 1;
}
// } Driver Code Ends