//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int dp [][] = new int[100][100];
    int removals(int[] arr, int n, int k) {
        // code here
        
        Arrays.sort(arr);
        
        for(int [] r: dp)
        {
            Arrays.fill(r,-1);
        }
        
        return solve(arr, 0, n-1,k);
    }
    int solve(int arr[] , int i, int j, int k)
    {
        if(i>=j) return 0;
        
        if(arr[j] - arr[i] <=k) return 0;
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        dp[i][j] = 1+ Math.min(solve(arr, i+1, j,k), solve(arr,i,j-1,k));
        
        return dp[i][j];
    }
}