//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int equalPartition(int n, int arr[])
    {
         int totalSum = 0;
    for (int i = 0; i < n; i++)
        totalSum += arr[i];

    if (totalSum % 2 != 0)
        return 0;

    int targetSum = totalSum / 2;

    vector<vector<bool>> dp(n + 1, vector<bool>(targetSum + 1, false));
    dp[0][0] = true;

    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= targetSum; j++) {
            if (j < arr[i - 1])
                dp[i][j] = dp[i - 1][j];
            else
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
        }
    }

    return dp[n][targetSum] ? 1 : 0;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        int arr[N];
        for(int i = 0;i < N;i++)
            cin>>arr[i];
        
        Solution ob;
        if(ob.equalPartition(N, arr))
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }
    return 0;
}
// } Driver Code Ends