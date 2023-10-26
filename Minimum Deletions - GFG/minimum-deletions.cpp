//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++

// class Solution{
//   public:
 
//     int minimumNumberOfDeletions(string S) { 
//         int n = S.size();
//         vector<vector<int> > dp(n, vector<int>(n, -1));

//         return fun(S, 0, n - 1, dp);
//     } 
//       int fun(string& S, int i, int j, vector<vector<int> >& dp)
//     {
//         if (i >= j)
//             return 0;

//         if (S[i] == S[j]) {
//             return dp[i][j] = fun(S, i + 1, j - 1, dp);
//         }

//         if (dp[i][j] != -1) {
//             return dp[i][j];
//         }

//         return dp[i][j] = (1 + min(fun(S, i + 1, j, dp), fun(S, i, j - 1, dp)));
//     }

// };
//tab - LPS = LCS(str, revstr)
class Solution{
  public:
    int minimumNumberOfDeletions(string S) { 
        // code here
        int len = longestPalinSubseq(S);
        return S.size()-len;
    } 
    int longestPalinSubseq(string S) {
        string s1 = S;
    reverse(S.begin(), S.end());
    string s2 = S;
    int n = S.length();
    int dp[n + 1][n + 1];

    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0)
                dp[i][j] = 0;
            else if (s1[i - 1] == s2[j - 1])
                dp[i][j] = 1 + dp[i - 1][j - 1];
            else
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
        }
    }

    return dp[n][n];
    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--){
        string S;
        cin >> S;
        Solution obj;
        cout << obj.minimumNumberOfDeletions(S) << endl;
    }
    return 0;
}
// } Driver Code Ends