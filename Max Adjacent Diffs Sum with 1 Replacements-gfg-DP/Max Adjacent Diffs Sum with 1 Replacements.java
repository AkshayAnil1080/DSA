Explanation of all approaches by me on Utube - https://youtu.be/C5osc0ny5WA
try before watching the video - https://www.geeksforgeeks.org/problems/modify-array-to-maximize-sum-of-adjacent-differences1729/1


//recursion
2^n, n
  class Solution {
    public int maxDiffSum(int[] arr) {
        // code here
        int keepFirst = helper(1, arr[0], arr);

        int replaceFirst = helper(1, 1, arr);

        return Math.max(keepFirst, replaceFirst);
    }
    int helper(int i, int prev, int[] arr) {

        // base case - arr end at i ==n
        if (i == arr.length) {
            return 0;
        }
        //  Keep arr[i]
        int keep = Math.abs(prev - arr[i])
                 + helper(i + 1, arr[i], arr);

        // Replace arr[i] with 1
        int replace = Math.abs(prev - 1)
                    + helper(i + 1, 1, arr);

        return Math.max(keep, replace);
    }
}


// memoization 
n,n
class Solution {
    int dp[][];
    public int maxDiffSum(int[] arr) {
        // code here
        int n = arr.length;
        // prev can be 1 or any arr[i]
        int maxVal = 0;
        for (int x : arr) {
            maxVal = Math.max(maxVal, x);
        }
        dp = new int[n][maxVal + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int keepFirst = helper(1, arr[0], arr);

        int replaceFirst = helper(1, 1, arr);

        return Math.max(keepFirst, replaceFirst);
    }
    int helper(int i, int prev, int[] arr) {

        if (i == arr.length) {
            return 0;
        }

        if(dp[i][prev]!=-1)
        return dp[i][prev];
        // Keep arr[i]
        int keep = Math.abs(prev - arr[i])
                 + helper(i + 1, arr[i], arr);

        // Replace arr[i] with 1
        int replace = Math.abs(prev - 1)
                    + helper(i + 1, 1, arr);

        return dp[i][prev] = Math.max(keep, replace);
    }
}

