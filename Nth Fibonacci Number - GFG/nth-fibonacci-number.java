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
            int n = Integer.parseInt(read.readLine());
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
      long a =0;long b=1; long c =0;
      for(int i =2; i<=n; i++)
      {
          c=(a%mod+b%mod)%mod;
          a=b%mod;
          b=c%mod;
      }
      return c%mod;
    }    
}