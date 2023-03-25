//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int vis[leaves+1]={0};
        for(int i=0; i<N; i++)
        {
            int pos=frogs[i];
            
            if(pos<=leaves && vis[pos]==0)
            {
                int temp=pos;
                while(temp<=leaves)
                {
                    if(vis[temp]==0)
                    vis[temp]=1;
                    
                    temp+=pos;
                }
            }
        }
        int count=0;
        for(int i=1; i<leaves+1; i++)
        {
            if(vis[i]==0)
            count++;
        }
        return count;
    }
};


//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, leaves;
        cin >> N >> leaves;
        int frogs[N];
        for (int i = 0; i < N; i++) {
            cin >> frogs[i];
        }

        Solution ob;
        cout << ob.unvisitedLeaves(N, leaves, frogs) << endl;
    }
}
// } Driver Code Ends