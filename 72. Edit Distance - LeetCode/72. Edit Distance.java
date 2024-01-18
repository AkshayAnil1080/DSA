// class Solution {
//     public int minDistance(String word1, String word2) {
//         return ed(word1, word2, word1.length(), word2.length());
//     }
//     int ed(String s1, String s2, int m , int n){
//         if(n==0) return m;
//         if(m==0) return n;

//         if(s1.charAt(m-1) == s2.charAt(n-1))
//         return ed(s1,s2,m-1,n-1);

//         else
//         return 1 + Math.min( Math.min(ed(s1,s2,m,n-1),ed(s1,s2,m-1,n)) , ed(s1,s2,m-1,n-1) );
//     }
    
// }

// class Solution {
//     int memo[][];
//     public int minDistance(String word1, String word2) {
//         int m = word1.length(), n = word2.length();
//         memo= new int[m+1][n+1];
//         for(int r[] : memo)
//         Arrays.fill(r,Integer.MIN_VALUE);
//         return ed(word1, word2, m , n);
//     }
//      int ed(String s1, String s2, int m , int n){

//           if (memo[m][n] != Integer.MIN_VALUE) {
//             return memo[m][n];
//         }

//         if (n == 0) {
//             return memo[m][n] = m;
            
//         }

//         if (m == 0) {
//            return memo[m][n] = n;
             
//         }
//         if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
//             return memo[m][n] = ed(s1,s2,m-1,n-1);
    
//         } 
//         else {
//         return memo[m][n] =  1 + Math.min( Math.min(ed(s1,s2,m,n-1),ed(s1,s2,m-1,n)) , ed(s1,s2,m-1,n-1) );
//         }
        
//     }
// }

//tab

class Solution {
  
    public int minDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        // if(n==0) return m;
        // if(m==0) return n;
        int dp[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++)
        dp[i][0] =i;
        for(int i=0; i<=n; i++)
        dp[0][i]=i;

          for(int i=1; i<=m; i++){
                for(int j=1; j<=n; j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else
                     dp[i][j] = 1 + Math.min( Math.min(dp[i][j-1],dp[i-1][j]) , dp[i-1][j-1] );
                }
          }
          return dp[m][n];
    
    }
}
