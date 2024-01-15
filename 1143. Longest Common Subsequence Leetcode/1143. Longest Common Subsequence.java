class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int m = t1.length(); int n = t2.length();
        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0){
                dp[i][j]=0;
                continue;
                }

                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
            
        }
print the LCS
        StringBuilder sb = new StringBuilder();
        int i=m, j=n;
       while(i>0 && j>0){
            if(t1.charAt(i-1) == t2.charAt(j-1)){
                sb.append(t1.charAt(i-1));
                i--; j--; //diagonal
            }
            else if(dp[i-1][j] > dp[i][j-1] )
            i--;
            else
            j--;
        }
        System.out.println(sb.reverse().toString());

          return dp[m][n];
        
        
    }
}

//space optimized
class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length(); int m = t2.length();
        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){

                if(t1.charAt(i-1) == t2.charAt(j-1)){
                    cur[j] = 1 + prev[j-1];
                }
                else
                cur[j] = Math.max(cur[j-1], prev[j]);
            }
             prev = Arrays.copyOf(cur, m + 1);
        }
        return cur[m];       
        
    }
}
