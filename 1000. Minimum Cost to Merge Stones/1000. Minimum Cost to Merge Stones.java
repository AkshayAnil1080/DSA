
Full Video Solution - https://youtu.be/hnFHuegpSwg

memo
  n^3, n^2
  
  class Solution {
    static int prefixSum[];
    static int dp[][];
    public static int mergeStones(int[] stones, int k) {
        // code here
        int n = stones.length;
         dp = new int[n][n];

        // do we even have to solve
        if((n-1)%(k-1)!=0) return -1;
        
        for(int x[] : dp){
            Arrays.fill(x,-1);
        }
        
        
        prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + stones[i];
        }
        
        
        return helper(0,n-1,k);
    }
    static int helper(int i, int j, int k){
        //base
        // invalid index// or just one ele
        if(i>=j) return 0;
        
        // track min via recursive call , groups of k-1 interval
        int minCost = Integer.MAX_VALUE;
        
        if(dp[i][j] !=-1) return dp[i][j];
        for(int idx=i; idx<j; idx+= k-1){
            int cost = helper(i,idx, k)  + helper(idx+1, j, k);
            minCost = Math.min(cost,minCost);
        }
        
          //check if this divison can actually be merged or not
        
        if( (j-i)%(k-1)==0) 
        minCost += prefixSum[j+1] - prefixSum[i];
        //retrun ans;
        return dp[i][j] =  minCost;
        
        
    }
}



// recsursion
n^n, n
class Solution {
    static int prefixSum[];
    public static int mergeStones(int[] stones, int k) {
        // code here
        int n = stones.length;
        // do we even have to solve
        if((n-1)%(k-1)!=0) return -1;
        
        
        prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + stones[i];
        }
        
        
        return helper(0,n-1,k);
    }
    static int helper(int i, int j, int k){
        //base
        // invalid index// or just one ele
        if(i>=j) return 0;
        
        // track min via recursive call , groups of k-1 interval
        int minCost = Integer.MAX_VALUE;
        
      
        for(int idx=i; idx<j; idx+= k-1){
            int cost = helper(i,idx, k)  + helper(idx+1, j, k);
            minCost = Math.min(cost,minCost);
        }
        
          //check if this divison can actually be merged or not
        
        if( (j-i)%(k-1)==0) 
        minCost += prefixSum[j+1] - prefixSum[i];
        //retrun ans;
        return minCost;
        
        
    }
}
///
