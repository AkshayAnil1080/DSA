//{ Driver Code Starts
//

#include <bits/stdc++.h>
using namespace std;

struct Node
{
	int data, height;
	Node *left, *right;
	Node(int x)
	{
		data = x;
		height = 1;
		left = right = NULL;
	}
};

int setHeights(Node* n)
{
	if(!n) return 0;
	n->height = 1 + max( setHeights(n->left) , setHeights(n->right) );
	return n->height;
}

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
    
    setHeights(root);
    return root;
}

bool isBST(Node *n, int lower, int upper)
{
	if(!n) return 1;
	if( n->data <= lower || n->data >= upper ) return 0;
	return isBST(n->left, lower, n->data) && isBST(n->right, n->data, upper) ;
}

pair<int,bool> isBalanced(Node* n)
{
	if(!n) return pair<int,bool> (0,1);

	pair<int,bool> l = isBalanced(n->left);
	pair<int,bool> r = isBalanced(n->right);

	if( abs(l.first - r.first) > 1 ) return pair<int,bool> (0,0);

	return pair<int,bool> ( 1 + max(l.first , r.first) , l.second && r.second );
}

bool isBalancedBST(Node* root)
{
	if( !isBST(root, INT_MIN, INT_MAX) )
		cout<< "BST voilated, inorder traversal : ";

	else if ( ! isBalanced(root).second )
		cout<< "Unbalanced BST, inorder traversal : ";

	else return 1;
	return 0;
}

void printInorder(Node* n)
{
	if(!n) return;
	printInorder(n->left);
	cout<< n->data << " ";
	printInorder(n->right);
}

struct Node* deleteNode(struct Node* root, int data);

int main()
{
	int t;
	cin>>t;
	getchar();

	while(t--)
	{
		string s;
		getline(cin,s);
		Node* root = buildTree(s);
        
		int n;
		cin>> n;
		int ip[n];
		for(int i=0; i<n; i++)
			cin>> ip[i];
        
		for(int i=0; i<n; i++)
		{
			root = deleteNode(root, ip[i]);
			
			if( !isBalancedBST(root) )
				break;
		}
        
		if(root==NULL)
			cout<<"null";
		else
			printInorder(root);
		cout<< endl;
        
		getline(cin,s); // to deal with newline char
	}
	return 1;
}

// } Driver Code Ends


/* Node is as follows:

struct Node
{
	int data, height;
	Node *left, *right;
	Node(int x)
	{
		data = x;
		height = 1;
		left = right = NULL;
	}
};

*/

int NodeHeight(Node* p)
{
    int hl=0, hr=0;
    hl = p&&p->left?p->left->height:0;
    hr = p&&p->right?p->right->height:0;
    return (hl>hr?hl+1:hr+1);
}

int BalanceFactor(Node* p)
{
    // hl-hr
    int hl=0, hr=0;
    hl = p&&p->left?p->left->height:0;
    hr = p&&p->right?p->right->height:0;
    
    return (hl-hr);
}

Node* LLRotate(Node* p)
{
    Node* pl = p->left;
    Node* plr = pl->right;
    
    pl->right = p;
    p->left = plr;
    
    p->height = NodeHeight(p);
    pl->height = NodeHeight(pl);
    
    return pl;
}

Node* LRRotate(Node* p)
{
    Node* pl = p->left;
    Node* plr = pl->right;
    
    pl->right = plr->left;
    p->left = plr->right;
    
    plr->left = pl;
    plr->right = p;
    
    p->height = NodeHeight(p);
    pl->height = NodeHeight(pl);
    plr->height = NodeHeight(plr);
    
    return plr;
}

Node* RRRotate(Node* p)
{
    Node* pr = p->right;
    Node* prl = pr->left;
    
    pr->left = p;
    p->right = prl;
    
    p->height = NodeHeight(p);
    pr->height = NodeHeight(pr);
    
    return pr;
}

Node* RLRotate(Node* p)
{
    Node* pr = p->right;
    Node* prl = pr->left;
    
    p->right = prl->left;
    pr->left = prl->right;
    
    prl->left = p;
    prl->right = pr;
    
    p->height = NodeHeight(p);
    pr->height = NodeHeight(pr);
    prl->height = NodeHeight(prl);
    
    return prl;
}

Node* InSuccessor(Node* p)
{
    while(p && p->left)
    {
        p=p->left;
    }
    return p;
}

Node* InPredecessor(Node* p)
{
    while(p && p->right)
    p=p->right;
    return p;
}


Node* deleteNode(Node* root, int data)
{
    if(root==NULL) return NULL;
    if(root->left==NULL && root->right==NULL)
    {
        if(data==root->data)
        {
            free(root);
            return NULL;
        }
    }
    
    if(data<root->data)
    root->left = deleteNode(root->left,data);
    else if(data>root->data)
    root->right = deleteNode(root->right,data);
    else
    {
        if(root->right!=NULL)
        {
            // successor
            Node* q = InSuccessor(root->right);
            root->data = q->data;
            root->right = deleteNode(root->right, q->data);
        }
        else
        {
            // Predecessor
            Node* q = InPredecessor(root->left);
            root->data = q->data;
            root->left = deleteNode(root->left,q->data);
        }
    }
    root->height = NodeHeight(root);
    if(BalanceFactor(root)==2 && BalanceFactor(root->left)==1)
    return LLRotate(root);
    else if(BalanceFactor(root)==2&&BalanceFactor(root->left)==-1)
    return LRRotate(root);
    else if(BalanceFactor(root)==2&&BalanceFactor(root->left)==0)
    return LLRotate(root);
    else if(BalanceFactor(root)==-2&&BalanceFactor(root->right)==1)
    return RLRotate(root);
    else if(BalanceFactor(root)==-2&&BalanceFactor(root->right)==-1)
    return RRRotate(root);
    else if(BalanceFactor(root)==-2&&BalanceFactor(root->right)==0)
    return RRRotate(root);
    
    return root;
}