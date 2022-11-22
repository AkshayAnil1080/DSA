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
   
    static long nthFibonacci(long n){
        // code here
        
        long fib[] = new long[(int)n+1];
        
        //s2
        fib[0]=0; fib[1]=1;
        
        for(int i =2; i<=n; i++)
        {
            fib[i] = (fib[i-1]%mod + fib[i-2]%mod)%mod;
        }
        return fib[(int)n];
    }    
}
// TC: O(n)
// SC:O(n)