class Solution {
    public int uniquePaths(int a, int b) {

        int n = a+b-2; int r =b-1;
         int dp[] = new int [r+1];
        dp[0]  =1;
     
         if(r>n)
         return 0;
        if( r== 0 || r==n)
         return 1;
     
        if( r > n-r)
        r = n-r;
       
        for( int i = 0 ; i <= n; i++)
        for(int  j = Math.min(i ,r) ; j>0 ; j--)
        dp[j] =  (dp[j]  + dp[j-1] ) ;
        
        return dp[r];
    }

}
