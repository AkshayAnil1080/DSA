//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int dp[] = new int[N+1];
        int dp2[] = new int[N+1];
        
        
        dp[0]=0;
        dp2[0]=0;
        
        for(int i=1; i<=N; i++)
        {
            dp[i]= Integer.MAX_VALUE;
            dp2[i] = -1;
        }
        for(int i=0; i<10; i++) // coins range
        {
            for(int j =1; j<=N ;j++) // val range
            {
             if(j >= coins[i]) // updation 
             {
                 dp[j] = Math.min(dp[j], dp[j-coins[i]] +1);
                 dp2[j] = coins[i];  // step2
             }
            }
        }
        List<Integer> ans = new ArrayList<>(); // s3
        while(N>0)
        {
            if(dp2[N]!= -1)
            ans.add(dp2[N]);
            
            N -= dp2[N];
            
        }
        return ans;
        
        
    }
}