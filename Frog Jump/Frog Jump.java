rec 
  2^n, n
class Solution {
    int minCost(int[] height) {
        return fun(height.length - 1, height);
    }
    
    int fun(int i, int[] height) {
        if(i == 0) return 0;
        
        int costOneStep = fun(i - 1, height) + Math.abs(height[i] - height[i - 1]);
        int costTwoSteps = Integer.MAX_VALUE;
        if(i > 1) {
            costTwoSteps = fun(i - 2, height) + Math.abs(height[i] - height[i - 2]);
        }
        
        return Math.min(costOneStep, costTwoSteps);
    }
}
memo
  n,n
class Solution {
    int[] dp;
    
    int minCost(int[] height) {
        int n = height.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(n - 1, height);
    }
    
    int fun(int i, int[] height) {
        if(i == 0) return 0;
        if(dp[i] != -1) return dp[i];
        
        int costOneStep = fun(i - 1, height) + Math.abs(height[i] - height[i - 1]);
        int costTwoSteps = Integer.MAX_VALUE;
        if(i > 1) {
            costTwoSteps = fun(i - 2, height) + Math.abs(height[i] - height[i - 2]);
        }
        
        dp[i] = Math.min(costOneStep, costTwoSteps);
        return dp[i];
    }
}
tab
  n,n

class Solution {
    int[] dp;
    
    int minCost(int[] height) {
        int n = height.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        return fun(n - 1, height);
    }
    
    int fun(int i, int[] height) {
        if(i == 0) return 0;
        if(dp[i] != -1) return dp[i];
        
        int costOneStep = fun(i - 1, height) + Math.abs(height[i] - height[i - 1]);
        int costTwoSteps = Integer.MAX_VALUE;
        if(i > 1) {
            costTwoSteps = fun(i - 2, height) + Math.abs(height[i] - height[i - 2]);
        }
        
        dp[i] = Math.min(costOneStep, costTwoSteps);
        return dp[i];
    }
}
