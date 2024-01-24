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
