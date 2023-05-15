//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            
            System.out.println(ob.cuts(s));
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int cuts(String s)
    {
        // code here
          char ch[]=s.toCharArray(); int n = s.length();
          int dp[] = new int[n+1];
          dp[0]=0;//rep ""
          
          for(int i=1; i<=n; i++)
          {
              int j=i-1;
              if(ch[j]=='0') dp[i]=-1; //not poss
              else{
                  dp[i]=-1;
                  int curr_ans=Integer.MAX_VALUE;
                  int to_dec=0;
                  for(int k=0; k<i; k++)
                  {
                      if(ch[j-k]=='1')//then only weightage counts
                      {
                          to_dec += 1<<k;
                          if(pow_of_5(to_dec) && dp[j-k]!=-1)
                          {
                               curr_ans = Math.min(1 + dp[j-k] , curr_ans);
                          }
                      }
                  }
                   if(curr_ans!=Integer.MAX_VALUE)
                    dp[i]=curr_ans;
                 } 
          }
          return dp[n];
        
    }
     static boolean pow_of_5(long n)
    {
        if(n==0)return false;
        if(n==1)return true;
        if(n%5!=0)return false;
        else return pow_of_5(n/5);
    }
}
