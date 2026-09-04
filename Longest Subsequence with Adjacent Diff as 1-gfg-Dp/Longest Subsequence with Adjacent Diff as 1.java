Explanation of all approaches by me on Utube - https://youtu.be/b6Zt-4yL0as
try before watching the vide https://www.geeksforgeeks.org/problems/longest-sub-sequence-such-that-difference-between-adjacents-is-one2558/1
// rec 2^n, n
class Solution {
    public int longestSubseq(int[] arr) {
        // code here
        return helper(0, -1, arr);
    }

    int helper(int idx, int prev, int[] arr) {

        if (idx==arr.length)
            return 0;

        int noTake=helper(idx+1, prev, arr);
        int take = 0;

        if(prev==-1 || Math.abs(arr[idx]-arr[prev])==1)
        take = 1 + helper(idx+1, idx, arr);

        return Math.max(take,noTake);
    }
}

//memo n^2, n^2
class Solution {
    int dp[][];
    public int longestSubseq(int[] arr) {
        // code here
        int n = arr.length;

        int maxVal = arr[0];

         dp = new int[n+1][n+1];
         for(int x[]  : dp)
            Arrays.fill(x, -1);

        return helper(0, -1, arr);
    }

    int helper(int idx, int prev, int[] arr) {

        if (idx==arr.length)
            return 0;

        int prevIdx = (prev==-1) ? 0 : prev+1;
        if(dp[idx][prevIdx]!=-1)
        return  dp[idx][prevIdx];

        int noTake=helper(idx+1, prev, arr);
        int take = 0;

        if(prev==-1 || Math.abs(arr[idx]-arr[prev])==1)
        take = 1 + helper(idx+1, idx, arr);

        return dp[idx][prevIdx]= Math.max(take,noTake);
    }
}


//optimal n,n
class Solution {
    public int longestSubseq(int[] arr) {
        // code here
        int dp[] = new int[1000002];
        int ans=0;

        for (int x : arr) {
            dp[x] = 1 + Math.max(dp[x - 1], dp[x + 1]);
            ans = Math.max(ans, dp[x]);
        }

        return ans;
    }
}
