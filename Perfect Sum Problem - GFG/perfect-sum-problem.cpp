//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


//m1 - recursion
// class Solution{
// const int mod = 1000000007;
// 	public:
// 	int fun(int pos, int sum, int arr[], int n) {
//     if (sum < 0)
//         return 0;
//     if (pos == n)
//         return sum == 0 ? 1 : 0;

//     return (fun(pos + 1, sum, arr, n) % mod + fun(pos + 1, sum - arr[pos], arr, n) % mod) % mod;
//     }
//     int perfectSum(int arr[], int n, int sum) {
//      return fun(0, sum, arr, n);
//     }
// };
//m2 - memoization
// class Solution{
// const int mod = 1000000007;
// 	public:
// 	int fun(int pos, int sum, int arr[], int n, vector<vector<int>>& dp) {
//     if (sum < 0)
//         return 0;
//     if (pos == n)
//         return sum == 0 ? 1 : 0;

//     if (dp[pos][sum] != -1)
//         return dp[pos][sum];

//     dp[pos][sum] = (fun(pos + 1, sum, arr, n, dp) % mod + fun(pos + 1, sum - arr[pos], arr, n, dp) % mod) % mod;
//     return dp[pos][sum];
// }


// 	int perfectSum(int arr[], int n, int sum)
// 	{
//         vector<vector<int>> dp(n + 1, vector<int>(sum + 1, -1));
//          return fun(0, sum, arr, n, dp);
// 	}
	  
// };
// m3 - tabulation
class Solution{
const int mod = 1000000007;
	public:
int perfectSum(int arr[], int n, int sum) {
    int dp[n + 1][sum + 1];

    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= sum; j++) {
            if (i == 0)
                dp[i][j] = (j == 0) ? 1 : 0;
            else if (j < arr[i - 1])
                dp[i][j] = dp[i - 1][j];
            else
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - arr[i - 1]]) % mod;
        }
    }

    return dp[n][sum] % mod;
}
};


//{ Driver Code Starts.
int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n, sum;

        cin >> n >> sum;

        int a[n];
        for(int i = 0; i < n; i++)
        	cin >> a[i];

       

	    Solution ob;
	    cout << ob.perfectSum(a, n, sum) << "\n";
	     
    }
    return 0;
}

// } Driver Code Ends