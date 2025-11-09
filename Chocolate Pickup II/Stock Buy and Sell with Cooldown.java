Stock Buy and Sell with Cooldown

2^n, n - recursion
class Solution {
    int n; 
    int arr[];
    public int maxProfit(int prices[]) {
        // Code here
        arr=prices;
        n = arr.length;
        return helper(0, 1);
        
    }
    int helper(int i, int buy){
        if(i>=n) return 0;
        
        int profit=0;
        
        if(buy==1){
            profit = Math.max(-arr[i] + helper(i+1,0) , helper(i+1,1));
            
        }
        else{
            profit = Math.max(arr[i] + helper(i+2,1) , helper(i+1,0));
        }
        return profit;
    }
}

n,n - memo

  class Solution {
    int n; 
    int arr[];
    int dp[][];
    public int maxProfit(int prices[]) {
        // Code here
        arr=prices;
        n = arr.length;
        dp = new int [n][2]; //1
        for(int x[]: dp){
            Arrays.fill(x,-1);
        }
        return helper(0, 1);
        
    }
    int helper(int i, int buy){
        if(i>=n) return 0;
        
        int profit=0;
        //2
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        
        if(buy==1){
            profit = Math.max(-arr[i] + helper(i+1,0) , helper(i+1,1));
            
        }
        else{
            profit = Math.max(arr[i] + helper(i+2,1) , helper(i+1,0));
        }
        
        //3
        return dp[i][buy] = profit;
    }
}

  n,n - tab


    
class Solution {
  
    public int maxProfit(int prices[]) {
        int n = prices.length;
        int dp[][] = new int [n+2][2]; //1
        
        for(int i=n-1; i>=0; i--){
            // Math.max(-arr[i] + helper(i+1,0) , helper(i+1,1));
            dp[i][1] = Math.max(-prices[i] + dp[i+1][0] , dp[i+1][1]);
            dp[i][0] = Math.max(prices[i] + dp[i+2][1] , dp[i+1][0]);
        }
        return dp[0][1];
        
    }
}
