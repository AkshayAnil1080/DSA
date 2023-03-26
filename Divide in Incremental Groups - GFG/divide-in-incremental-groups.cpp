//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++


class Solution {
  public:
    const int mod = 1e9 + 7;
    int dp[105][105][105];
    
    int countWaystoDivide(int n, int k) {
        // Code here
        memset(dp, -1, sizeof(dp));
        return solve(n, k, n);
    }
    int solve(int n, int k, int last) {
    if (k == 0) 
    {
        return (n == 0) ? 1 : 0;
    }

    if (dp[n][k][last] != -1) 
    {
        return dp[n][k][last];
        
    }

    int answer = 0;
    for (int s = 1; s <= min(n, last); s++)
    {
        answer += solve(n - s, k - 1, s);
        answer %= mod;
    }

    return dp[n][k][last] = answer;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, K;
        cin >> N >> K;
        Solution ob;
        cout << ob.countWaystoDivide(N, K) << endl;
    }
}
// } Driver Code Ends