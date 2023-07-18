//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        StringBuilder str = new StringBuilder(S);
        String s1 = S;
        String s2 = str.reverse().toString();
        int n = S.length();
        int dp[][] = new int[n+1][n+1];
        
        
        for( int i =0 ; i<=n ;i++)
        {
            for( int j =0; j<=n;j++)
            {
                if(i==0 || j==0)
                dp[i][j] =0; 
                
               else if( s1.charAt(i-1)==s2.charAt(j-1) )
                    dp[i][j] = 1+dp[i-1][j-1];  
                    
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        
        return dp[n][n];
    }
}