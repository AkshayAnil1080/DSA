class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
    String lcs = longestCommonSubsequence(s1,s2);
     System.out.println(lcs);
        StringBuilder ans = new StringBuilder();

        int p1=0, p2=0;
        for(char ch : lcs.toCharArray()){
            while(p1<s1.length() && s1.charAt(p1)!=ch){
                    ans.append(s1.charAt(p1++));
            }
            while(p2<s2.length() && s2.charAt(p2)!=ch){
                    ans.append(s2.charAt(p2++));
            }
            ans.append(ch); p1++; p2++;
        }
       if(p1<s1.length())  ans.append(s1.substring(p1));
        if(p2<s2.length()) ans.append(s2.substring(p2));
        return ans.toString();
    }

    String longestCommonSubsequence(String t1, String t2) {
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
        // print the LCS
        StringBuilder sb = new StringBuilder();
        int i=m, j=n;
       while(i>0 && j>0){
            if(t1.charAt(i-1) == t2.charAt(j-1)){
                sb.append(t1.charAt(i-1));
                i--; j--; //diagonal
            }
            else if(dp[i-1][j] > dp[i][j-1])
            i--;
            else
            j--;
        }
        // System.out.println(sb.reverse().toString());

          return sb.reverse().toString();     
        
    }
}
