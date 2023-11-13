
class Solution
{
    public:
    //Function to find length of shortest common supersequence of two strings.
    int shortestCommonSupersequence(string X, string Y, int m, int n)
    {
        return m+n - lcs(m,n, X,Y);
    }
     int lcs(int m, int n, string s1, string s2)
    {
        int dp[m + 1][n + 1];
        

        for( int i =0 ; i<=m ;i++)
        {
            for( int j =0; j<=n;j++)
            {
                 if(i==0 || j==0)
                dp[i][j] =0; 
                
                else if( s1[i-1]==s2[j-1] )
                    dp[i][j] = 1+dp[i-1][j-1];  
                    
                else
                    dp[i][j] = max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        
        return dp[m][n];
    }
};
