class Geeks {
    public long count(int n) {
        // Add your code here.
        long dp[] = new long [(int)n+1];
        dp[0]=1; // {} //empty set
    
        for (int i=3 ;i <=n; i++) 
        dp[i] += dp[i -  3];  
       for (int i=5 ;i <=n; i++) 
        dp[i] += dp[i -  5]; 
        for (int i=10 ;i <=n; i++) 
        dp[i] += dp[i - 10];
        
        return dp[n];
    }
}
