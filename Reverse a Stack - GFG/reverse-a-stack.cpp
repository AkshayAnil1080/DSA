//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

// class Solution{
// public:
//     void Reverse(stack<int> &s){
//         queue<int> q;
//     while (!s.empty()) {
//         q.push(s.top());
//         s.pop();
//     }
//     while (!q.empty()) {
//         s.push(q.front());
//         q.pop();
//     }
//     }
// };



class Solution{
public:

void push_back(stack<int>& s, int x) {
    if (s.empty()) 
        s.push(x);
     else {
        int y = s.top();
        s.pop();
        push_back(s, x);
        s.push(y);
    }
}


    void Reverse(stack<int> &s){
        if (!s.empty()) {
        int x = s.top();
        s.pop();
        Reverse(s);
        push_back(s, x);
        }
    }
};


//{ Driver Code Starts.


int main(){
    int T;
    cin>>T;
    while(T--){
        int N;
        cin>>N;
        stack<int> St;
        for(int i=0;i<N;i++){
            int x;
            cin>>x;
            St.push(x);
        }
        Solution ob;
        ob.Reverse(St);
        vector<int>res;
        while(St.size())
        {
            res.push_back(St.top());
            St.pop();
        }
        for(int i = res.size()-1;i>=0;i--)
        {
            cout<<res[i]<<" ";
        }
        
        cout<<endl;
    }
}
// } Driver Code Ends