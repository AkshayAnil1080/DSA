class Solution {
     public:
    int cutRod(int price[], int n) {
        int dp[n + 1];
     
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            int max_val = -1;
            for (int j = 0; j < i; j++)
                max_val = max(max_val, price[j] + dp[i - j - 1]);
            dp[i] = max_val;
        }
        return dp[n];
    }
};
