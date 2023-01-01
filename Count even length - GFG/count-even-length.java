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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.compute_value(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution
{
   final long mod = 1000000007;
    public int  compute_value(int n)
    {
        // code here
        
        long ans=0;
        long a = 1; // n!
        for(int i=1; i<=n; i++)
        {
            a = (a%mod * i%mod)%mod;
        }
        
        long r_f =1 ; //r!
        long n_r_f = a;
        for(int i=0; i<=n; i++)
        {
            // n! / r! *n-r!
            long denom  = (r_f%mod * n_r_f%mod)%mod ;
            
            // long ncr = (a ) / denom -- a*b)%m = (a%m * b^-1 %m) -> b^-1 %m = b^mod-2
            long ncr = (a%mod *  power(denom,mod-2)) %mod;
            ans =  (ans%mod  +  (ncr%mod * ncr%mod)%mod )%mod;
            r_f = (r_f % mod * (i+1)%mod)%mod;
            
            //n-r! = n_r_f / n-r
            if(n!=i) n_r_f =  ( n_r_f%mod  * power((n-i),mod-2))%mod;
            
        }
        return (int)ans;
    }
    long power(long a , long b)
    {
        if(b==0) return 1;
        long x = power(a,b/2);
        long y = (x%mod * x%mod)%mod;
        
        if(b%2==1) y = (y%mod * a%mod)%mod;
        
        return y;
    }
}