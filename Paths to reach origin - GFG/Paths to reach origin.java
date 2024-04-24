class Solution
{   static  int MOD = 1000000007;
    public static int ways(int x, int y)
    {
        // complete the function
        int memo[][] = new int[x+1][y+1];
        for(int row[] : memo)
        Arrays.fill(row,-1);
        
        return dfs(x,y,memo);
    }
    static int dfs(int x, int y, int memo[][]){
        if(x==0 && y==0) return 1;
        
        if(memo[x][y]!=-1) return memo[x][y];
        
        int cnt=0;
        if(x>0)
        cnt = (cnt + dfs(x-1,y,memo))%MOD;
        
        if(y>0)
        cnt = (cnt + dfs(x,y-1,memo))%MOD;
        
        return memo[x][y] = cnt;
    }
}

// tab
class Solution
{ 
    static int MOD = 1000000007;
    public static int ways(int x, int y) {
    int dp[][] = new int [501][501];
   
       for(int i=0; i<501; i++){
       dp[i][0]=1;
       dp[0][i]=1;
       }
       for(int i=1; i<501; i++){
           for(int j=1; j<501; j++){
              dp[i][j] = (dp[i-1][j]%MOD + dp[i][j-1]%MOD) % MOD;
           }
       }
        return dp[x][y];
    }
}
