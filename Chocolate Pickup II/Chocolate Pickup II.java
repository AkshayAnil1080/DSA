recursion
  4^n, n
    class Solution {

    int n;
    int[][] grid;

    public int chocolatePickup(int[][] mat) {
        n = mat.length;
        grid = mat;

        int ans = helper(0, 0, 0);
        return Math.max(ans, 0);   // final result cannot be negative
    }

    private int helper(int r1, int c1, int r2) {

        int c2 = r1 + c1 - r2;     // since steps count for both must be same

        // out of bounds
        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n)
            return Integer.MIN_VALUE;

        // blocked cell
        if (grid[r1][c1] == -1 || grid[r2][c2] == -1)
            return Integer.MIN_VALUE;

        // base: reached bottom-right
        if (r1 == n-1 && c1 == n-1)
            return grid[r1][c1];

        int val = grid[r1][c1];
        if (!(r1 == r2 && c1 == c2)) {
            val += grid[r2][c2];   // avoid double count
        }

        int best = Integer.MIN_VALUE;

        // 4 combinations
        best = Math.max(best, helper(r1+1, c1,     r2+1)); // Down, Down
        best = Math.max(best, helper(r1+1, c1,     r2));   // Down, Right
        best = Math.max(best, helper(r1,   c1+1,   r2+1)); // Right, Down
        best = Math.max(best, helper(r1,   c1+1,   r2));   // Right, Right

        if (best == Integer.MIN_VALUE)
            return best;

        return val + best;
    }
}
