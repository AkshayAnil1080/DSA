/* 
Deven Nandapurkar. 

Date:- 28th May.

problem:- Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

problem link:- https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

Difficultry:- Easy. 

Cpp solution below 👇👇
*/

class Solution{
public:
    int getNthFromLast(Node *head, int n)
    {
           // Your code here
           Node *temp1 = head;
           Node *temp2 = head; 
           
           int count = 0;
           
           while(temp1) {
                temp1 = temp1 -> next;
                count++;
                if(count > n)
                    temp2 = temp2 -> next;
           }
           
           if(count < n) {
               return -1;
           }
           
           return temp2->data; 
    }
};

// time complexity:- O(n) -> while loop will run for the one iteration and hence n. 

// space complexity:- O(1) -> takes constant extra space. 
