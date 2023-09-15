//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
    public:
    //Function to count the number of ways in which frog can reach the top.
    const long long mod = 1000000007;
    long long countWays(int n)
    {
        
    long long a = 1, b = 2, c = 4;
    
        if (n == 1) return a;
        if (n == 2) return b;
        if (n == 3) return c;
    
        long long d = 0;
    
        for (int i = 4; i <= n; i++) {
            d = (((a % mod + b % mod) % mod + c % mod) % mod);
            a = b % mod;
            b = c % mod;
            c = d % mod;
        }
    
        return d % mod;
        
    }
};


// class Solution
// {
//     public:
//     //Function to count the number of ways in which frog can reach the top.
//     const long long mod = 1000000007;
//     long long countWays(int n)
//     {
        
//       if (n == 1) return 1;
//         if (n == 2) return 2;
//         if (n == 3) return 4;
    
//         long long dp[n];
    
//         dp[0] = 1;
//         dp[1] = 2;
//         dp[2] = 4;
    
//         for (int i = 3; i < n; i++) {
//             dp[i] = (((dp[i - 1] % mod + dp[i - 2] % mod) % mod + dp[i - 3] % mod) % mod);
//         }
    
//         return dp[n - 1];
//     }
// };



//{ Driver Code Starts.
int main()
{
    //taking testcases
	int t;
	cin >> t;
	
	while(t--)
	{
	    //taking number of steps in stair
		int n;
		cin>>n;
		Solution ob;
		//calling function countWays()
		cout << ob.countWays(n) << endl;
	}
    
    return 0;
    
}

// } Driver Code Ends