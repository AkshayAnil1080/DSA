//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    public static long distinctColoring(int N, int[]r, int[]g, int[]b){
        //code here
        
        long dp[][] = new long[N][3]; // bcoz given 3 colors.
        
        //s2  - fill 1st row of dp with 1st col of colors
        dp[0][0] = r[0]; dp[0][1] = g[0]; dp[0][2] = b[0];
        //
        
        //s3
        for(int i=1 ; i<N ;i++)
        {
            dp[i][0]  = r[i] + Math.min(dp[i-1][1] , dp[i-1][2]);
             dp[i][1]  = g[i] + Math.min(dp[i-1][0] , dp[i-1][2]);
              dp[i][2]  =  b[i] + Math.min(dp[i-1][0] , dp[i-1][1]);
        }
        
        return Math.min(Math.min(dp[N-1][0], dp[N-1][1]) , dp[N-1][2] );
        
    }
}


//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input[] = read.readLine().trim().split("\\s+");
            int[]r=new int[N];
            for(int i=0;i<N;i++)
                r[i]=Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[]g=new int[N];
            for(int i=0;i<N;i++)
                g[i]=Integer.parseInt(input[i]);
            input = read.readLine().trim().split("\\s+");
            int[]b=new int[N];
            for(int i=0;i<N;i++)
                b[i]=Integer.parseInt(input[i]);

            Solution ob = new Solution();
            out.println(ob.distinctColoring(N, r, g, b));
        }
        out.close();
    }
}
// } Driver Code Ends