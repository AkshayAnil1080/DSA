class Solution {
    public int longestPalindromeSubseq(String S) {
         StringBuilder str = new StringBuilder(S);
        String s1 = S;
        String s2 = str.reverse().toString();
        int n = S.length();
        int dp[][] = new int[n+1][n+1];
        
        
        for( int i =0 ; i<=n ;i++)
        {
            for( int j =0; j<=n;j++)
            {
                if(i==0 || j==0)
                dp[i][j] =0; 
                
               else if( s1.charAt(i-1)==s2.charAt(j-1) )
                    dp[i][j] = 1+dp[i-1][j-1];  
                    
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        
        return dp[n][n];
    }
}


//sapce opt

class Solution {
    public int longestPalindromeSubseq(String S) {
         StringBuilder str = new StringBuilder(S);
        String s1 = S;
        String s2 = str.reverse().toString();
        int n = S.length();
        //  int n = t1.length(); int m = t2.length();

        int[] prev = new int[n + 1];
        int[] cur = new int[n + 1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    cur[j] = 1 + prev[j-1];
                }
                else
                cur[j] = Math.max(cur[j-1], prev[j]);
            }
             prev = Arrays.copyOf(cur, n + 1);
        }
        return cur[n];       
    }
}
