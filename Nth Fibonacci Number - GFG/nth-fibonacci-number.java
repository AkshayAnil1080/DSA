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
//1. Recursion - O(2^n)
class Solution { 
    static long mod = 1000000007;
    static long nthFibonacci(long n){
        // code here
        
        return fib(n);
    }
    static long fib(long n)
    {
        if(n==0 || n==1)
        return n;
        
        return (fib(n-1)%mod + fib(n-2)%mod)%mod ;
    }
}
2. DP - Tabulation , Memoization - O(n), O(n)
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

// 3. O(n), O(1)
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
// 4. O(logN), O(ht of recursive stack)
class Solution {
     static long m = 1000000007;
     static long nthFibonacci(long N){ 
        // Code here
        return (int)fib(N);
    }
    
   static long fib(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
         if (n == 0)
            return 0;
        power(F, n-1);
      
        return F[0][0];
    }
    
    static void multiply(long F[][], long M[][])
    {
        long x = ( (F[0][0]%m *M[0][0]%m)%m + (F[0][1]%m * M[1][0]%m)%m )%m;
        long y = ( (F[0][0]%m *M[0][1]%m)%m + (F[0][1]%m * M[1][1]%m)%m )%m;
        long z = ( (F[1][0]%m *M[0][0]%m)%m + (F[1][1]%m * M[1][0]%m)%m )%m;
        long w = ( (F[1][0]%m *M[0][1]%m)%m + (F[1][1]%m * M[1][1]%m)%m )%m;
         
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    
    static void power(long F[][], long n)
    {
    if( n == 0 || n == 1)
      return;
    long M[][] = new long[][]{{1,1},{1,0}};
      
    power(F, n/2);
    multiply(F, F);
      
    if (n%2 != 0)
       multiply(F, M);
    }
      
}
