
class Solution
{
  public:
    //Function to convert binary tree into circular doubly linked list.
   Node *head=NULL, *prev=NULL;
    Node *bTreeToCList(Node *root)
    {
    //add code here.
    inorder (root); 
    
    //fixng the last node
    head->left=prev; prev->right=head;
    return head;
    }
    void inorder(Node* curr)
    {
        if(curr==NULL)
        return;
        
        inorder (curr->left);
        
        if (head==NULL)
        head=prev=curr;
        
        else{
        prev->right=curr;
        curr->left=prev;
        }
        //before moving right update prev to curr.
        prev=curr;
        inorder (curr->right);
    }
};
