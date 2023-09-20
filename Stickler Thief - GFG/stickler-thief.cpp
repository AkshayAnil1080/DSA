//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;

// } Driver Code Ends

// / class Solution
// {
//     public:
//     //Function to find the maximum money the thief can get.
//     int FindMaxSum(int arr[], int n)
//     {
//          return helper(arr, n,  0);
//     }

//     int helper(int nums[], int n,  int index) {
//         if (index >= n) return 0;
//         return max(helper(nums, n, index + 2) + nums[index], helper(nums, n, index + 1));
//     }
// };

// class Solution
// {
//     public:
//     //Function to find the maximum money the thief can get.
//     int FindMaxSum(int arr[], int n)
//     {
//       vector<int> memo(n, -1); // Initialize memoization array with -1 values
//         return helper(arr, n, 0, memo);
//     }

//     int helper(int nums[], int n, int index, std::vector<int>& memo) {
//         if (index >= n) return 0;

//         // Check if the result for the current index is already calculated
//         if (memo[index] != -1) return memo[index];

//         int result = max(helper(nums, n, index + 2, memo) + nums[index], helper(nums, n, index + 1, memo));
//         memo[index] = result;
//         return result;
//     }
// };

//tabulation
class Solution
{
    public:
    //Function to find the maximum money the thief can get.
    int FindMaxSum(int arr[], int n)
    {
        if (n == 0) {
            return 0;
        }

        vector<int> dp(n + 1);
        dp[0] = 0;
        dp[1] = arr[0];

        for (int i = 2; i <= n; i++) {
            dp[i] = std::max(dp[i - 2] + arr[i - 1], dp[i - 1]);
        }

        return dp[n];
    }
};

//{ Driver Code Starts.
int main()
{
    //taking total testcases
	int t;
	cin>>t;
	while(t--)
	{
	    //taking number of houses
		int n;
		cin>>n;
		int a[n];
		
		//inserting money of each house in the array
		for(int i=0;i<n;++i)
			cin>>a[i];
		Solution ob;
		//calling function FindMaxSum()
		cout<<ob.FindMaxSum(a,n)<<endl;
	}
	return 0;
}

// } Driver Code Ends