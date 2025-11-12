

2^(n+m), (n+m)
  
class Solution {
    public boolean wildCard(String txt, String pat) {
        int n = pat.length();
        int m = txt.length();
        return helper(n, m, pat, txt);
    }

    // f(i, j): whether pat[0...i-1] matches txt[0...j-1]
    boolean helper(int i, int j, String pat, String txt) {
        // Base Case 1: Both strings empty
        if (i == 0 && j == 0) return true;

        // Base Case 2: pattern empty but text not
        if (i == 0 && j > 0) return false;

        // Base Case 3: text empty but pattern left
        if (j == 0) {
            for (int k = 1; k <= i; k++) {
                if (pat.charAt(k-1) != '*') return false;
            }
            return true;
        }

        char p = pat.charAt(i-1);
        char t = txt.charAt(j-1);

        if (p == t || p == '?')
            return helper(i-1, j-1, pat, txt);
        else if (p == '*')
            return helper(i-1, j, pat, txt) || helper(i, j-1, pat, txt);
        else
            return false;
    }
}




.memo
  (n+m), (n+m)


  
class Solution {
     int[][] dp;
    public boolean wildCard(String txt, String pat) {
        int n = pat.length();
        int m = txt.length();
        dp = new int[n+1][m+1];
        for(int [] x: dp){
            Arrays.fill(x,-1);
        }
        return helper(n, m, pat, txt);
    }

    // f(i, j): whether pat[0...i-1] matches txt[0...j-1]
    boolean helper(int i, int j, String pat, String txt) {
        // Base Case 1: Both strings empty
        if (i == 0 && j == 0) return true;

        // Base Case 2: pattern empty but text not
        if (i == 0 && j > 0) return false;

        // Base Case 3: text empty but pattern left
        if (j == 0) {
            for (int k = 1; k <= i; k++) {
                if (pat.charAt(k-1) != '*') return false;
            }
            return true;
        }
        if (dp[i][j] != -1) return dp[i][j]==1 ? true: false ;

        char p = pat.charAt(i-1);
        char t = txt.charAt(j-1);

        boolean res;
        if (p == t || p == '?')
            res =  helper(i-1, j-1, pat, txt);
        else if (p == '*')
            res =  helper(i-1, j, pat, txt) || helper(i, j-1, pat, txt);
        else
            res = false;
            
       dp[i][j] = (res==true) ?1:0;
       return res;
    }
}		



tab

  class Solution {
    public boolean isMatch(String pat, String txt) {
        int n = pat.length();
        int m = txt.length();

        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;

        // if text empty, check if pattern all '*'
        for (int i = 1; i <= n; i++) {
            if (pat.charAt(i-1) == '*')
                dp[i][0] = dp[i-1][0];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char p = pat.charAt(i-1);
                char t = txt.charAt(j-1);

                if (p == t || p == '?')
                    dp[i][j] = dp[i-1][j-1];
                else if (p == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                else
                    dp[i][j] = false;
            }
        }

        return dp[n][m];
    }
}
