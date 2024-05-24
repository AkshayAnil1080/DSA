

// class Solution {
//      static int mod = 1000000007;
//     public static int countPartitions(int n, int d, int[] arr) {
//         // code here
//         int sum=0;
//         for(int x : arr)
//         sum+=x;
        
//         if(sum<d || (sum-d)%2!=0)
//         return 0;
        
//         int k = (sum-d)/2;
        
//         return fun(0, k , arr);
//     }
   
// 	static int fun(int pos, int sum, int arr[])
//     {
//         if(sum<0) return 0;
//         if (pos == arr.length)
//             return sum==0? 1:0; 
            
//         return (fun(pos + 1, sum,arr)% mod +   fun(pos + 1, sum - arr[pos], arr)% mod)% mod; 
//         //not take + take
//     }
// }

//memo
class Solution {
     static int mod = 1000000007;
    public static int countPartitions(int n, int d, int[] arr) {
        // code here
        int sum=0;
        for(int x : arr)
        sum+=x;
        
        if(sum<d || (sum-d)%2!=0)
        return 0;
        
        int k = (sum-d)/2;
        
         int[][] dp = new int[n + 1][sum + 1];
         for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                dp[i][j] = -1;
            }
        }
        return fun(0, k , arr,dp);
    }
   
	static int fun(int pos, int sum, int arr[],int[][] dp)
    {
        if(sum<0) return 0;
        if (pos == arr.length)
            return sum==0? 1:0; 
        
          if (dp[pos][sum] != -1)
            return dp[pos][sum];
            
      dp[pos][sum] = (fun(pos + 1, sum, arr, dp) % mod +
                        fun(pos + 1, sum - arr[pos], arr, dp) % mod) % mod;
        return dp[pos][sum];
    }
}
       
       
// class Solution {
//      static int mod = 1000000007;
//     public static int countPartitions(int n, int d, int[] arr) {
//         // code here
//         int sum=0;
//         for(int x : arr)
//         sum+=x;
        
//         if(sum<d || (sum-d)%2!=0)
//         return 0;
        
//           int k = (sum+d)/2;

//         return perfectSum(arr,n,k);
//     }
   
//     static int perfectSum(int arr[],int n, int sum) 
// 	{ 
// 	    // Your code goes here
// 	    int dp[][]= new int[n+1][sum+1];
// 	     dp[0][0] = 1;
// 	    for(int i=1; i<=sum; i++)
// 	    dp[0][i]=0;//first row from 2nd cell
	     
// 	    for(int i=1; i<=n; i++)
// 	    {
// 	        for(int j=0; j<=sum; j++)
// 	        {
// 	            if(j<arr[i-1])
// 	            dp[i][j] = dp[i-1][j];
	            
// 	            else 
// 	            dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
	            
// 	            dp[i][j] %= mod;
// 	        }
// 	    }
	 
// 	    return dp[n][sum]%mod;
// 	} 
// } 
