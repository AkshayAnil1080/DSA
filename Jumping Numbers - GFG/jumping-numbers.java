//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long ans;
    static long jumpingNums(long X) {
        // code here
        ans=0;
        for(int i =1; i<=9 ;i++)
        {
            dfs(X, i);
        }
        return ans;
    }
    static void dfs(long X, long curr)
    {
       
            if(curr>X) return;
            if(curr<=X)
            {
                ans= Math.max(ans, curr);
                
            long lastDig = curr%10;   
            
            long a = curr*10 + (lastDig-1);
             long b = curr*10 + (lastDig+1);
             
             if(lastDig==0)
             {
                 dfs(X,b);  // for eg 10-  we cannot add 99 but we can add 101
             }
             else if(lastDig==9)
             {
                 dfs(X,a); // for eg 9 - we can add 98 but cannot add 100
             }
             
             else
             {
                 dfs(X,b);
                  dfs(X,a);
             }
             
             
            }
            
    }
};