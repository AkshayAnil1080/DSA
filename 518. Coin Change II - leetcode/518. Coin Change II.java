//leetcode
class Solution {
    public int change(int sum, int[] coins) {
        int n= coins.length;
        int dp[] = new int[sum+1];
        dp[0]=1;
        for(int i=0; i<n ;i++){
            for(int j=coins[i]; j<=sum; j++){
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
      return dp[sum];
    }
}


//gfg
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

  
