//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

// class Solution
// {
//     public:
//     //Function to delete middle element of a stack.
//     void deleteMid(stack<int>&s, int sizeOfStack)
//     {
//         stack<int> st;
//         int m = sizeOfStack / 2;
//         int i = 0;
        
//          while (!s.empty()) 
//          {
//         st.push(s.top());
//         s.pop();
//         i++;
        
//         if (i == m)
//             s.pop();
//          }
    
//         while (!st.empty()) {
//             s.push(st.top());
//             st.pop();
//         }
//     }
// };

class Solution
{
    public:
    //Function to delete middle element of a stack.
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        // code here.. 
        helper(s, sizeOfStack, 0);
    }
    void helper(std::stack<int>& s, int n, int idx) {
        if (idx == n/2)
        {
            s.pop();
            return;
        }
        
        int x = s.top();
        s.pop();
        idx++;
        
        helper(s, n, idx);
        
        s.push(x);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--)
    {
        int sizeOfStack;
        cin>>sizeOfStack;
        
        stack<int> myStack;
        
        for(int i=0;i<sizeOfStack;i++)
        {
            int x;
            cin>>x;
            myStack.push(x);    
        }

            Solution ob;
            ob.deleteMid(myStack,myStack.size());
            while(!myStack.empty())
            {
                cout<<myStack.top()<<" ";
                myStack.pop();
            }
        cout<<endl;
    }   
    return 0;
}

// } Driver Code Ends