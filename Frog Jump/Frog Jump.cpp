// Plain Recursion: Time Complexity O(2^n), Space O(n) due to call stack
class Solution {
public:
    int minCost(vector<int>& height) {
        return fun(height.size() - 1, height);
    }
    
    int fun(int i, vector<int>& height) {
        if(i == 0) return 0;
        
        int costOneStep = fun(i - 1, height) + abs(height[i] - height[i - 1]);
        int costTwoSteps = INT_MAX;
        if(i > 1) {
            costTwoSteps = fun(i - 2, height) + abs(height[i] - height[i - 2]);
        }
        
        return min(costOneStep, costTwoSteps);
    }
};


// Memoization (Top-Down DP): Time Complexity O(n), Space O(n)
class Solution {
public:
    vector<int> dp;
    
    int minCost(vector<int>& height) {
        int n = height.size();
        dp.assign(n, -1);
        return fun(n - 1, height);
    }
    
    int fun(int i, vector<int>& height) {
        if(i == 0) return 0;
        if(dp[i] != -1) return dp[i];
        
        int costOneStep = fun(i - 1, height) + abs(height[i] - height[i - 1]);
        int costTwoSteps = INT_MAX;
        if(i > 1) {
            costTwoSteps = fun(i - 2, height) + abs(height[i] - height[i - 2]);
        }
        
        dp[i] = min(costOneStep, costTwoSteps);
        return dp[i];
    }
};
// Tabulation (Bottom-Up DP): Time Complexity O(n), Space O(n)
class Solution {
public:
    int minCost(vector<int>& height) {
        int n = height.size();
        vector<int> dp(n, 0);
        dp[0] = 0;
        
        for(int i = 1; i < n; i++) {
            int costOneStep = dp[i - 1] + abs(height[i] - height[i - 1]);
            int costTwoSteps = INT_MAX;
            if(i > 1) {
                costTwoSteps = dp[i - 2] + abs(height[i] - height[i - 2]);
            }
            dp[i] = min(costOneStep, costTwoSteps);
        }
        return dp[n - 1];
    }
};
