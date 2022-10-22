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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {

    static int fillingBucket(int N) {
        // code here
        if(N==1) return 1;
        
        long a =1;
        long b=1;
        long c=0;
        long mod= 100000000;
         for(int i =2; i<=N; i++)
         {
             c=((a%mod)+(b%mod) )%mod;
             
             a=b%mod;
             b=c%mod;
             
         }
         return (int)(c%mod);
     
    }
};


//
// static int fillingBucket(int N) {
//         // code here
        
//         return fun(N);
//     }
    
//  static int   fun (int N)
//     {
//         if(N==0) return 1;
//         if(N<0) return 0;
       
//       return  fun(N-1) + fun(N-2);
//     } 
    
//     after writing this code- i got correct and but it was tle , then i checked for firther inputs and observed it was 
//     Fibonacci serires