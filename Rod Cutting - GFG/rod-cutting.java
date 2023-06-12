//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
       int dp[][] = new int[n+1][n+1];
        for(int x[] : dp)
      Arrays.fill(x,-1);
      return fun(n, price, 0, dp);
       
     
    }
     int fun(int n, int price[], int ind,   int dp[][])
    {
       //cut to be made > rod length  - not poss
        if(ind+1 >n) return 0;
        
        if(dp[ind+1][n]!=-1) return dp[ind+1][n];
        //not take and take(not incremented the index because can take same price more then once)
        return dp[ind+1][n] =  Math.max(fun(n, price,ind+1,dp) , price[ind] + 
        fun(n-ind-1, price, ind,dp));
        
    }
}