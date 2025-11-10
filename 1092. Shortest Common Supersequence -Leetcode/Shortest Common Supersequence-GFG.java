class Solution {
    public static int minSuperSeq(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        // Find LCS length
        int lcs = longestCommonSubsequence(s1, s2);
        
        // SCS length = m + n - lcs
        return m + n - lcs;
    }

    private static int longestCommonSubsequence(String t1, String t2) {
        int m = t1.length(), n = t2.length();
        int[][] dp = new int[m + 1][n + 1];

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
