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



class Solution
{
    public:
    //Function to find the nodes that are common in both BST. 
    vector <int> findCommon(Node *root1, Node *root2)
    {
     vector<int> result;
        stack<Node*> stack1;
        stack<Node*> stack2;

        while (true) {
            if (root1 != nullptr) {
                stack1.push(root1);
                root1 = root1->left;
            }
            else if (root2 != nullptr) {
                stack2.push(root2);
                root2 = root2->left;
            }
            else if (!stack1.empty() && !stack2.empty()) {
                root1 = stack1.top();
                root2 = stack2.top();

                if (root1->data == root2->data) {
                    result.push_back(root1->data);
                    stack1.pop();
                    stack2.pop();
                    root1 = root1->right;
                    root2 = root2->right;
                }
                else if (root1->data < root2->data) {
                    stack1.pop();
                    root1 = root1->right;
                    root2 = nullptr;
                }
                else if (root1->data > root2->data) {
                    stack2.pop();
                    root2 = root2->right;
                    root1 = nullptr;
                }
            }
            else {
                break;
            }
        }
        return result;
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
        Node* root1 = buildTree(s);

        getline(cin,s);
        Node* root2 = buildTree(s);
        Solution ob;
        vector <int> res = ob.findCommon(root1, root2);
        for (int i : res)
            cout << i << " ";
        cout<< endl;
    }

	return 1;
}
// } Driver Code Ends