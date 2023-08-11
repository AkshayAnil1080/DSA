//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

//rec
// class Solution {
//     public long count(int coins[], int n, int sum) {
//         // code here.
//         return solve(coins, n, sum);
//     }
//   long solve(int coins[], int n, int sum)
//   {
//       if(sum<0) return 0;
//       if(n<=0) return 0;
       
//       if(sum==0) return 1;
       
//       return 
//       solve(coins, n-1,sum) + solve(coins, n, sum-coins[n-1]);
//   }
// }

// memo
// class Solution {
//     public long count(int coins[], int n, int sum) {
//         // code here.
//         long dp[] = new long[sum+1];
//         dp[0] =1;
        
//         for(int i =0; i<n; i++){
//           for(int j = coins[i] ; j<=sum ; j++)
//           {
//               dp[j] = dp[j] + dp[j-coins[i]];
//           }
//         }
       
//     return dp[sum];        
//     }
// }
//tab
class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
        
        long dp[] = new long[sum+1];
        dp[0] =1;
        
        for(int i=0; i<n ;i++ ) //for every coins
        {
            for(int j=coins[i] ;j<=sum; j++){ // itr in sum
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        
        return dp[sum];
    }
}