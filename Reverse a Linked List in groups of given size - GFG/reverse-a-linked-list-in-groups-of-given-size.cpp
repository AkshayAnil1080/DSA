//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


struct node
{
    int data;
    struct node* next;
    
    node(int x){
        data = x;
        next = NULL;
    }
    
};

/* Function to print linked list */
void printList(struct node *node)
{
    while (node != NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}


// } Driver Code Ends
/*
  Reverse a linked list
  The input list will have at least one element  
  Return the node which points to the head of the new LinkedList
  Node is defined as 
    struct node
    {
        int data;
        struct node* next;
    
        node(int x){
            data = x;
            next = NULL;
        }
    
    }*head;
*/

// class Solution
// {
//     public:
//     struct node *reverse (struct node *head, int k)
//     { 
//         node* curr = head;
//         node* next = nullptr;
//         node* prev = nullptr;
//         int count = 0;

//         while (curr != nullptr && count < k)
//         {
//             next = curr->next;
//             curr->next = prev;
//             prev = curr;
//             curr = next;
//             count++;
//         }

//         if (next != nullptr)
//         {
//             node* new_head = reverse(next, k);
//             head->next = new_head;
//         }

//         return prev;
//     }
// };

class Solution
{
    public:
    struct node *reverse (struct node *head, int k)
    {
        node* curr = head;
        node* prevFirst = nullptr;
        bool isFirst = true;

        while (curr != nullptr)
        {
            node* first = curr; // to store the starting node of each group,
            // which will also be the last node after getting reversed.
            node* prev = nullptr;
            int count = 0;

            while (curr != nullptr && count < k)
            {
                node* next = curr->next;
                curr->next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            if (isFirst)
            {
                head = prev;
                isFirst = false;
            }
            else
            {
                prevFirst->next = prev; // pointing to the new head of the current reversed group
            }

            prevFirst = first;
        }

        return head;
    }
};


//{ Driver Code Starts.

/* Drier program to test above function*/
int main(void)
{
    int t;
    cin>>t;
     
    while(t--)
    {
        struct node* head = NULL;
        struct node* temp = NULL;
        int n;
        cin >> n;
         
        for(int i=0 ; i<n ; i++)
        {
            int value;
            cin >> value;
            if(i == 0)
            {
                head = new node(value);
                temp = head;
            }
            else
            {
                temp->next = new node(value);
                temp = temp->next;
            }
        }
        
        int k;
        cin>>k;
        
        Solution ob;
        head = ob.reverse(head, k);
        printList(head);
    }
     
    return(0);
}


// } Driver Code Ends