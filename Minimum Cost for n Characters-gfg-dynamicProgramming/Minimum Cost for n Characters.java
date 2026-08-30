Explanation of all approaches by me on Utube - https://youtu.be/ocs4yPiC4XI
try before watching the vide  https://www.geeksforgeeks.org/problems/minimum-time1238/1

memo , n, n
  import java.util.*;

class Solution {

    int insertAmt, deleteAmt, copyAmt;
    int[] dp;

    public int minCost(int n, int i, int d, int c) {

        insertAmt = i;
        deleteAmt = d;
        copyAmt = c;

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return  solve(n);
    }

    int solve(int len) {

        // Already reached 0
        if (len == 0)
            return 0;

        // 1 -> 0
        if (len == 1)
            return insertAmt;

        // Already calculated
        if (dp[len] != -1)
            return dp[len];

        // Remove all characters one by one
        int ans =  len * insertAmt;

        if (len % 2 == 0) {

            // len -> len/2
            // Reverse of Copy-Paste
            int copy = copyAmt + solve(len / 2);

            ans = Math.min(ans, copy);

        } else {

            // len -> len-1
            // Reverse of Insert
            int down = insertAmt + solve(len - 1);

            // len -> len+1 -> (len+1)/2
            // Reverse of Delete + Reverse of Copy
            int up = deleteAmt
                    + copyAmt
                    + solve((len + 1) / 2);

            ans = Math.min(ans, Math.min(down, up));
        }

        return dp[len] = ans;
    }
}

 // rec / n, logn
import java.util.*;

class Solution {

    int insertAmt, deleteAmt, copyAmt;

    public int minCost(int n, int i, int d, int c) {

        insertAmt = i;
        deleteAmt = d;
        copyAmt = c;


        return  solve(n);
    }

    int solve(int len) {

        // Already reached 0
        if (len == 0)
            return 0;

        // 1 -> 0
        if (len == 1)
            return insertAmt;

        // Remove all characters one by one
        int ans =  len * insertAmt;

        if (len % 2 == 0) {

            // len -> len/2
            // Reverse of Copy-Paste
            int copy = copyAmt + solve(len / 2);

            ans = Math.min(ans, copy);

        } else {

            // len -> len-1
            // Reverse of Insert
            int down = insertAmt + solve(len - 1);

            // len -> len+1 -> (len+1)/2
            // Reverse of Delete + Reverse of Copy
            int up = deleteAmt
                    + copyAmt
                    + solve((len + 1) / 2);

            ans = Math.min(ans, Math.min(down, up));
        }

        return ans;
    }
}
