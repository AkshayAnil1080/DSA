//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//function Template for C++

// //Function to reverse the queue.
// class Solution
// {
//     public:
//     queue<int> rev(queue<int> q)
//     {
//         stack<int> st;

//         while (!q.empty()) {
//             st.push(q.front());
//             q.pop();
//         }

//         while (!st.empty()) {
//             q.push(st.top());
//             st.pop();
//         }

//         return q;
//     }
// };
class Solution
{
    public:
    queue<int> rev(queue<int> q)
    {
          helper(q);
     	return q;// add code here.
    }
    
     void helper(queue<int>& q)
    {
        // base case
        if (q.size() == 0)
            return ;
     //store the ele
        int x = q.front();
        q.pop();
    // recur
         helper(q);
        //  push the ele back
        q.push(x);
    }
    
};

//{ Driver Code Starts.
int main()
{
    int test;
    cin>>test; 
    while(test--)
    {
    queue<int> q; 
    int n, var; 
    cin>>n; 
    while(n--)
    {
        cin>>var; 
        q.push(var);
    }
    Solution ob;
    queue<int> a=ob.rev(q); 
    while(!a.empty())
    {
        cout<<a.front()<<" ";
        a.pop();
    }
    cout<<endl; 
    }
}
// } Driver Code Ends