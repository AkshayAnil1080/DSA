class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;

    int[] oneR = new int[m];
    int[] oneC = new int[n];


    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        oneR[i] += grid[i][j];
        oneC[j] += grid[i][j];
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = 2 * oneR[i] + 2 * oneC[j] - n - m;
      }
    }
    return grid;
    }
}
