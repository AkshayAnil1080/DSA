rec
K^n
k ≈ sqrt(n) choices at each step → exponential branching
Space	O(n) (due to recursion stack)

class Solution {
    public int minSquares(int n) {
        // Code here
        return fun(n);
    }
    int fun(int n){
        if(n==0) return 0;
         
         int ans = Integer.MAX_VALUE;
         
        for(int i=1 ;i*i<=n; i++){

            ans =  Math.min(1 + fun(n-(i*i)), ans);
        }
        return ans;
    }
}


Time	O(n × √n)
Space	O(n) (dp array) + O(n) (recursion stack) → O(n)
✅ Each n solved once
✅ Each state loops over √n
class Solution {
    int dp[];
    public int minSquares(int n) {
        // Code here
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n);
    }
    int fun(int n){
        if(n==0) return 0;
         
         if(dp[n]!=-1)
         return dp[n];
         
         int ans = Integer.MAX_VALUE;
         
        for(int i=1 ;i*i<=n; i++){
            ans =  Math.min(1 + fun(n-(i*i)), ans);
        }
        dp[n] = ans ;
        
        return ans;
    }
}


class Solution {
    public int minSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j*j <= i; j++){
                dp[i] = Math.min(dp[i], 1 + dp[i - j*j]);
            }
        }

        return dp[n];
    }
}

