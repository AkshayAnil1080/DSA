//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
     static int mod = 1000000007;
	public static int countPaths(int n){
		//code here
	
		int dp[][] = new int[4][n+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 3; j++) {
                dp[j][i] = (dp[j][i] + (dp[(j + 1) % 4][i - 1])) % mod;
                dp[j][i] = (dp[j][i] + (dp[(j + 2) % 4][i - 1])) % mod;
                dp[j][i] = (dp[j][i] + (dp[(j + 3) % 4][i - 1])) % mod;
            }
        }
        return dp[0][n];
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countPaths(N));
        }
    }
}

// } Driver Code Ends