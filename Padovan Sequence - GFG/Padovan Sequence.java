// class Solution
// {
//     int m = 1000000007;
//   public int padovanSequence(int n)
//     {
//         //code here.
//         if(n<=2)
//         return 1;
        
//         int dp[] = new int[n+1];
//         dp[0] = dp[1] = dp[2] =1;
        
        
//         for(int i=3; i<=n ;i++){
//             dp[i] = (dp[i-2]%m + dp[i-3]%m)%m;
//         } 
//         return dp[n];
//     }
    
// }

class Solution
{
    int m = 1000000007;
  public int padovanSequence(int n)
    {
        //code here.
        if(n<=2)
        return 1;
        int a=1,b=1,c=1,d=0;
        
        
        for(int i=3; i<=n ;i++){
            d=(a%m + b%m)%m;
            a=b; b=c; c=d;
        } 
        return d;
    }
    
}
