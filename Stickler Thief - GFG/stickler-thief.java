//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends

//rec O(2^n), O(n)
// class Solution
// {
//     //Function to find the maximum money the thief can get.
//     public int FindMaxSum(int arr[], int n)
//     {
//          return helper(arr, 0);
//     }
//     public int helper(int [] nums, int index)
//     {
//         if(index  >=nums.length) return 0;
//         return Math.max(helper(nums, index + 2) + nums[index], helper(nums, index +1));
//     }
// }

//memo O(n), O(n)
// class Solution
// {
//     //Function to find the maximum money the thief can get.
//     public int FindMaxSum(int arr[], int n)
//     {
//          int[] memo = new int[n];
//         Arrays.fill(memo, -1); 
//         // Initialize the memoization array with -1 to indicate uncalculated values
//         return helper(arr, 0, memo);
//     }

//     public int helper(int[] nums, int index, int[] memo) {
//         if (index >= nums.length)
//             return 0;

//         // Check if the result for the current index is already calculated
//         if (memo[index] != -1)
//             return memo[index];

//         // Calculate the result and store it in memo array
//       return  memo[index] = Math.max(helper(nums, index + 2, memo) 
//       + nums[index], helper(nums, index + 1, memo));
//     }
// }
// tab O(n), O(N)
// class Solution
// {
//     //Function to find the maximum money the thief can get.
//     public int FindMaxSum(int arr[], int n)
//     {
//       if (n == 0) {
//             return 0;
//         }

//         int[] dp = new int[n + 1];
//         dp[0] = 0;
//         dp[1] = arr[0];

//         for (int i = 2; i <= n; i++) {
//             dp[i] = Math.max(dp[i - 2] + arr[i - 1], dp[i - 1]);
//         }

//         return dp[n];
//     }
// }

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
      if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = arr[0];
    int c=0;
        for (int i = 2; i <= n; i++) {
            c=Math.max(arr[i-1]+a, b);
            a=b; b=c;
        }

        return c;
    }
}

