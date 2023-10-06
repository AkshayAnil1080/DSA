//{ Driver Code Starts
#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
/* A linked list node */


struct Node
{
    int data;
    struct Node *next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
    
};

struct Node *start = NULL;

/* Function to print nodes in a given linked list */
void printList(struct Node *node)
{
    while (node != NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
    
}

void insert()
{
    int n,value;
    cin>>n;
    struct Node *temp;
    for(int i=0;i<n;i++)
    {
        cin>>value;
        if(i==0)
        {
            start = new Node(value);
            temp = start;
            continue;
        }
        else
        {
            temp->next = new Node(value);
            temp = temp->next;
        }
    }
}


// } Driver Code Ends
/*
  reverse alternate nodes and append at the end
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
      int data;
      struct Node *next;
    
      Node(int x){
        data = x;
        next = NULL;
      }
    
   };

*/
class Solution
{
    public:
    void rearrange(struct Node *odd)
    {
        if (odd->next == nullptr)
            return;

        Node* h1 = odd;
        Node* h2 = odd->next;//need in reversing the list
        Node* t1 = h1, *t2 = h2;

        while (true) {
            t1->next = t1->next->next;
            t1 = t1->next;

            if (t2->next->next == nullptr) {
                t1->next = nullptr;
                break;
            }

            t2->next = t1->next;
            t2 = t2->next;

            if (t1->next->next == nullptr) {
                t1->next = nullptr;
                break;
            }
        }

        t2->next = nullptr;
        t1->next = reverse(h2);
    }

     Node* reverse(Node* head) {
        Node* current = head;
        Node* prev = nullptr;
        Node* next = nullptr;

        while (current != nullptr) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
};



//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while (t--) {
        insert();
        Solution ob;
        ob.rearrange(start);
        printList(start);
    }
    return 0;
}

// } Driver Code Ends