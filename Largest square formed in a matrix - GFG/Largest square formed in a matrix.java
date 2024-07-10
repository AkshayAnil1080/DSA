class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        int ans = Integer.MIN_VALUE;

        int dp[][] = new int[n][m];
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                
                if(i==n-1 || j==m-1 || mat[i][j]==0 )
                dp[i][j] = mat[i][j];
                
                else{
                    dp[i][j] = 1 +  Math.min(dp[i + 1][j+1], Math.min(dp[i+1][j], dp[i][j+1]));
                }
            ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}


class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && i > 0 && j > 0) {
                    mat[i][j] = Math.min(mat[i - 1][j], Math.min(mat[i - 1][j - 1], mat[i][j - 1])) + 1;
                }
                ans = Math.max(mat[i][j], ans);
            }
        }
        return ans;
   
