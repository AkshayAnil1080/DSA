//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int dp[][];
  public static int maxCoins(int N, int[] arr) {
    // code here
    //s1
    int a[] = new int[N+2];
    int n = a.length;
    a[0]=1; a[n-1]=1;
    
    for(int i=1; i<=n-2;i++)
    a[i] = arr[i-1];
    
    dp = new int[n][n];
    for(int rows[] : dp) Arrays.fill(rows,-1);
    
    return solve(a, 0 , n-1);
    
  }
  static int solve(int a[], int st, int end)
  {
      if(end - st ==1) return 0;
      
      if(dp[st][end]!=-1) return dp[st][end];
      
      //m vary
      int ans=0;
      for(int m=st+1; m<end; m++)
      {
          int curr = a[st]*a[m]*a[end] + solve(a, st, m) + solve(a, m , end);
          ans = Math.max(ans,curr);
      }
      return dp[st][end] = ans;
  }
}
     