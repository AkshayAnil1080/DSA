//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


// class Solution{
//     static long largestPrimeFactor(int n) {
//         // code here
//         // int n = (int)Math.sqrt(N);
//          boolean prime[] = new boolean[n+ 1];  // nloglogn
//         for (int i = 0; i <= n; i++)
//             prime[i] = true;
//         prime[1] = false;
  
//         for (int p = 2; p * p <= n; p++) {
            
//             if (prime[p] == true) {
//                 for (int i = p * p; i <= n; i += p)
//                     prime[i] = false;
//             }
//         }
        
//         for(int i=(int)Math.sqrt(n) ;i>=1; i--)
//         {
//             if(n%i==0)
//             {
//                 int f1 =i; int f2=(n/i);
//                 if(prime[f1] && prime[f2])
//                 return f1>f2?f1:f2;
//                  if(prime[f1])
//                 return f1;
//                 if(prime[f2]) 
//                 return f2;
//             }
//         }
        
//         return -1;
//     }
    
// }

class Solution{
    static long largestPrimeFactor(int N) {
        //prime factorization
        long n = 2;
        // loop till sqrt(N)
        while ((n * n) <=N)
            if (N % n == 0) 
                N /= n; 
            else
                n++; 
        return N;
    }
}

