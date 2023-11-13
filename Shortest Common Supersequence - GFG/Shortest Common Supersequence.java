
class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        return m+n - lcs(m,n, X,Y);
    }

      static int lcs(int m, int n, String s1, String s2)
    {
      int dp[][] = new int[m+1][n+1];
        

        for( int i =0 ; i<=m ;i++)
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
