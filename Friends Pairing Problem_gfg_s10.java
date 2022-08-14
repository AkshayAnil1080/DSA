//https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1
//https://auth.geeksforgeeks.org/user/akshayanil/practice


class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       if(n==1 || n==2)
       return n;
       
       int mod = 1000000007;
       
       long first=1;
        long second=2;
       long curr=0;
       for(int i =0; i<=n; i++)
       {
           curr = ( second + ((i-1)%mod * (first%mod))%mod )%mod;
           first = second;
           second = curr;
       }
       return curr;
       // TC :O(n)
      // SC :O(1)
    
    //   long dp[] = new long [n+1];
    //   dp[1]=1;
    //   dp[2]=2;
    //   for( int i =3; i<=n; i++)
    //   {
    //       dp[i] = dp[i-1] + (i-1)*dp[i-2];   // since we just want count, no need to call for every comb.
    //   }
    //   return dp[n];
    }
}    
 
 
 //TCO:O(n)
 //SC: o(n)
