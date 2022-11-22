//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long mod = 1000000007;
    static long memo[];
    static long nthFibonacci(long n){
        // code here
        memo  = new long[(int)n+1];
        Arrays.fill(memo,-1);
        return fib(n);
    }
    static long fib(long n)
    {
        long res =0;
        if(memo[(int)n]==-1)
        {
            if(n==0 || n==1)
            res = n;
            
            else
             res = (fib(n-1)%mod + fib(n-2)%mod)%mod ;
             
             memo[(int)n] = res;
        }
        return memo[(int)n];
        
    }
}