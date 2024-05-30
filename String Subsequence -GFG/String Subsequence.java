class Solution {
    static int res;
    public static int countWays(String s, String s2) {
        // code here
        res=0;
      subsequences(s, "", 0, s2); 
        return res;
    }
  static void subsequences(String s, String curr,int index, String s2)
    {
        if (index == s.length()) {
            if(curr.equals(s2))
            res++;
            
            return; 
        }
 
      
          subsequences(s, curr , index +1, s2);
        subsequences(s, curr + s.charAt(index) , index +1, s2);
 
    }
}

class Solution {
    
    public static int countWays(String s1, String s2) {
      return fun(s1,s2,s1.length(), s2.length());
    }
    static int fun(String s1, String s2, int n, int m){
        if(m==0) return 1;
        if(n==0) return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1))
          return  fun(s1,s2, n-1, m-1) + fun(s1, s2, n-1,m);
           
        else  
        return fun(s1,s2,n-1,m);
        
    }

   
}

class Solution {
    static int dp[][];
    static int mod = 1000000007;
    public static int countWays(String s1, String s2) {
        
        int n = s1.length(), m=s2.length();
        dp = new int[n+1][m+1];
        for(int x[] : dp)
        Arrays.fill(x,-1);
        
      return fun(s1,s2,n,m);
    }
    static int fun(String s1, String s2, int n, int m){
        if(m==0) return 1;
        if(n==0) return 0;
        
        if(dp[n][m]!=-1)
        return  dp[n][m];
        
        if(s1.charAt(n-1)==s2.charAt(m-1))
          return dp[n][m] =  (fun(s1,s2, n-1, m-1)%mod + fun(s1, s2, n-1,m)%mod)%mod;
           
        else  
        return dp[n][m] = fun(s1,s2,n-1,m);
        
    }

   
}
class Solution {
    static int dp[][];
    static int mod = 1000000007;
    public static int countWays(String s1, String s2) {
        
        int n = s1.length(), m=s2.length();
        dp = new int[n+1][m+1];
      for(int i=1; i<=m; i++){
          dp[0][i]=0;
      }
      for(int i=0; i<=n;i++)
      dp[i][0]=1;
       
      for(int i=1;i<=n; i++){
          for(int j=1; j<=m; j++){
              if(s1.charAt(i-1)==s2.charAt(j-1))
              dp[i][j] = (dp[i-1][j-1]%mod + dp[i-1][j]%mod)%mod;
               
              else
                dp[i][j] =  dp[i-1][j]; 
          }
      }
        
      return  dp[n][m] ;
    }
   
}
