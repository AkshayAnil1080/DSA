Explanation of all approaches by me on Utube - https://youtu.be/-_MLEGYaZK4
Please try problem here before watching the above video - https://www.geeksforgeeks.org/problems/minimum-number-of-elements-which-are-not-part-of-increasing-or-decreasing-subsequence2617/1


//rec 
3^n, n
class Solution {

     int n;
    public int minCount(int[] arr) {
        // code here
         n = arr.length;
        int maxSelected = helper(
            0,
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            arr
        );
        return n - maxSelected;
    }

     int helper(int i, int inc, int dec, int[] arr) {

        // No elements left
        if (i == n)
            return 0;
        // 1. Skip current element
        int skip = helper(i + 1, inc, dec, arr);
        // 2. Put current element in increasing
        int takeInc = 0;
        if (arr[i] > inc) {
            takeInc = 1 + helper(i + 1, arr[i], dec, arr);
        }
        // 3. Put current element in decreasing
        int takeDec = 0;
        if (arr[i] < dec) {
            takeDec = 1 + helper(i + 1, inc, arr[i], arr);
        }
        return Math.max(skip, Math.max(takeInc, takeDec));
    }

}



//memo
n^3, n^3

class Solution {
   int dp[][][];
     int n;
    public int minCount(int[] arr) {
        // code here

         n = arr.length;
         dp = new int[n+1][102][102];
         for(int x[][] : dp)
            for(int y[]:  x)
            Arrays.fill(y,-1);

        int maxSelected = helper(
            0,
            Integer.MIN_VALUE,
            Integer.MAX_VALUE, arr
        );

        return n - maxSelected;

    }

     int helper(int i, int inc, int dec, int[] arr) {

        // No elements left
        if (i == n)
            return 0;

        int inc_idx = (inc == Integer.MIN_VALUE ) ? 0 : inc+1;
          int dec_idx= (dec == Integer.MAX_VALUE ) ? 0 : dec+1;
        if(dp[i][inc_idx][dec_idx]!=-1)
        return dp[i][inc_idx][dec_idx];
        
        // 1. Skip current element
        int skip = helper(i + 1, inc, dec, arr);
        // 2. Put current element in increasing
        int takeInc = 0;
        if (arr[i] > inc) {
            takeInc = 1 + helper(i + 1, arr[i], dec, arr);
        }
        // 3. Put current element in decreasing
        int takeDec = 0;
        if (arr[i] < dec) {
            takeDec = 1 + helper(i + 1, inc, arr[i], arr);
        }
       return dp[i][inc_idx][dec_idx]=  Math.max(skip, Math.max(takeInc, takeDec));

    }

}


//tab
//n^3, n^3

class Solution {

    int dp[][][];
    int n;

    public int minCount(int[] arr) {

        n = arr.length;

        dp = new int[n + 1][102][102];

        // Base case:
        // i == n => 0  => dp[n][][]=0; // by def its 0 in java

        for (int i = n - 1; i >= 0; i--) {
         for (int inc_idx = 0; inc_idx < 102; inc_idx++) {
          for (int dec_idx = 0; dec_idx < 102; dec_idx++) {
    
            int inc = (inc_idx == 0)
                    ? Integer.MIN_VALUE
                    : inc_idx - 1;
    
            int dec = (dec_idx == 0)
                    ? Integer.MAX_VALUE
                    : dec_idx - 1;
    
            // 1. Skip
            int skip = dp[i + 1][inc_idx][dec_idx];
    
    
            // 2. Take in increasing
            int takeInc = 0;
    
            if (arr[i] > inc) {
                int newIncIdx = arr[i] + 1;
                takeInc = 1 +
                    dp[i + 1][newIncIdx][dec_idx];
            }
    
    
            // 3. Take in decreasing
            int takeDec = 0;
            if (arr[i] < dec) {
                int newDecIdx = arr[i] + 1;
                takeDec = 1 +
                    dp[i + 1][inc_idx][newDecIdx];
            }
    
    
            dp[i][inc_idx][dec_idx] =
                Math.max(
                    skip,
                    Math.max(takeInc, takeDec)
                );
          }
         }
        }

        // Initially:
        // inc = Integer.MIN_VALUE -> index 0
        // dec = Integer.MAX_VALUE -> index 0

        int maxSelected = dp[0][0][0];

        return n - maxSelected;
    }
}
