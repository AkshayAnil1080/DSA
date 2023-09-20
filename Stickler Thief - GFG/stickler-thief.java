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

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
         int[] memo = new int[n];
        Arrays.fill(memo, -1); 
        // Initialize the memoization array with -1 to indicate uncalculated values
        return helper(arr, 0, memo);
    }

    public int helper(int[] nums, int index, int[] memo) {
        if (index >= nums.length)
            return 0;

        // Check if the result for the current index is already calculated
        if (memo[index] != -1)
            return memo[index];

        // Calculate the result and store it in memo array
       return  memo[index] = Math.max(helper(nums, index + 2, memo) 
       + nums[index], helper(nums, index + 1, memo));
    }
}
