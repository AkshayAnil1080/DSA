//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod = 1000000007;
    int dp[] = new int[10001];
    public int CountWays(String str)
    {
        // code here
        Arrays.fill(dp, -1);
        if(str.charAt(0) =='0')
        return 0;
        
        int n = str.length();
        
        return solve( str, n);
    }
    int solve(String str, int n)
    {
        
        //bc
        if(n==0 || n==1)  // n==0 out of ch, n==1 => 1
        return 1;
        
        if(dp[n]!=-1)
        return dp[n];
        
        int count=0;
        if(str.charAt(n-1) >'0') // not taking as pair
        count = solve(str, n-1);
        
        if(str.charAt(n-2) =='1' || str.charAt(n-2) =='2' && str.charAt(n-1)<'7')
        count = (count + solve(str, n-2)%mod)%mod;
        
        
        return dp[n] = count;
    }
}