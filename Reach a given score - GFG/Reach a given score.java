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




class Geeks {
    ArrayList<Long> numbers = new ArrayList<>();

    public long count(int n) {
        numbers.add(3L);
        numbers.add(5L);
        numbers.add(10L);

        return solve(n, 0);
    }

    private long solve(int remaining, int index) {
        if (remaining == 0) {
            return 1;
        }

        if (index >= 3 || remaining < 0) {
            return 0;
        }

        return solve(remaining - numbers.get(index).intValue(), index) + solve(remaining, index + 1);
    }
}
