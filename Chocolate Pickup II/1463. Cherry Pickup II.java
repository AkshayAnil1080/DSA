class Solution {

    int[][] grid;
    int[][][] dp;
    int n, m;

    public int cherryPickup(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;

        dp = new int[n][m][m];

        for (int[][] layer : dp)
            for (int[] row : layer)
                Arrays.fill(row, -2);   // NOT COMPUTED

        return helper(0, 0, m - 1);
    }

    private int helper(int r, int c1, int c2) {

        // boundary check
        if (c1 < 0 || c2 < 0 || c1 >= m || c2 >= m)
            return Integer.MIN_VALUE;

        // last row
        if (r == n - 1) {
            if (c1 == c2) return grid[r][c1];
            return grid[r][c1] + grid[r][c2];
        }

        if (dp[r][c1][c2] != -2)
            return dp[r][c1][c2];

        int val = grid[r][c1];
        if (c1 != c2) val += grid[r][c2]; // avoid double count

        int best = Integer.MIN_VALUE;

        // both robots can move to [-1,0,+1] columns
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {

                int next = helper(r + 1, c1 + d1, c2 + d2);
                if (next != Integer.MIN_VALUE)
                    best = Math.max(best, next);
            }
        }

        if (best == Integer.MIN_VALUE)
            return dp[r][c1][c2] = Integer.MIN_VALUE;

        return dp[r][c1][c2] = val + best;
    }
}
