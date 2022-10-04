https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1
//User function Template for Java
// TLE : recursive  - O(2^mn)
// class Solution
// {
//     long mod = 1000000007;
//     long numberOfPaths(int m, int n)
//     {
//         // code here
//         return dfs(0,0,m,n);
        
//     }
//     long dfs( int i, int j, int m , int n)
//     {
//         if(i==m-1 || j==n-1) return 1; //here just one path poss 
//         long right =  dfs(i, j+1, m, n);
//         long down = dfs(i+1, j, m, n);
        
//         return (right+down)%mod;
//     }
// }
class Solution
{
     long mod = 1000000007;
    long numberOfPaths(int m, int n)
    {
        // code here
        long dp[][] = new long[101][101]; // since constraint is 1 to 100
        
        return dfs(0,0,m,n,dp);
        
    }
        long dfs( int i, int j, int m , int n, long[][] dp)
    {
        if(i==m-1 || j==n-1) return 1; //here just one path poss 
        if(dp[i][j]!=0) return dp[i][j];
        long right =  dfs(i, j+1, m, n,dp);
        long down = dfs(i+1, j, m, n,dp);
        
        
        return dp[i][j] = (right+down)%mod;
    }
}

// third approach calcualte m+n-2C(n-1) or m+n-2C(m-1)
