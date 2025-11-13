97. Interleaving String

  Full Video Solution :
https://youtu.be/R9kNDhCIT5U

try it yourself - https://leetcode.com/problems/interleaving-string/description/ - leetcode

/*you are required to complete this method */
class Solution {
	public boolean isInterleave(String A,String B,String C)
	{
           
            int m = A.length(); int n =B.length();
            int t = C.length();
             if (m + n != t) return false;
            boolean dp[][] = new boolean[m+1][n+1];
            // approach , dp . bottom up
            // base conditon . if m+n!=t , return false;
            //3 if ch of a match with c and b does not to c , a+1, b, c+1
            //4 if ch of b match with c and a does not to a, a, b+1, c+1
            //5 if matches in both a ,b,c , dp[i+1][j] || dp[i][j+1]
            //1 if a empty and b matches with c, a,b+1,c+1;
            //2 if b empty and a mathces with c, a+1,b,c+1;
            // a th is i and bth is j

            for( int i =0; i<=m ;i++)
            {
                for(int j=0; j<=n;j++)
                {
                    if(i==0 && j==0)
                    dp[i][j]=true;
                    
                //1
                else if(i==0)
                {
                    if(B.charAt(j-1)==C.charAt(j-1))
                    dp[i][j] = dp[i][j-1];
                }
                //2
                else if(j==0)
                {
                    if(A.charAt(i-1)==C.charAt(i-1))
                    dp[i][j] = dp[i-1][j];
                }
                //3
                else if(A.charAt(i-1)==C.charAt(i+j-1) && B.charAt(j-1)!=C.charAt(i+j-1))
                {
                    dp[i][j] = dp[i-1][j];
                }
                //4
                else if(A.charAt(i-1)!=C.charAt(i+j-1) && B.charAt(j-1)==C.charAt(i+j-1))
                {
                    dp[i][j] = dp[i][j-1];
                }
                //5
                else if(A.charAt(i-1)==C.charAt(i+j-1) && B.charAt(j-1)==C.charAt(i+j-1))
                {
                    dp[i][j] = (dp[i-1][j] || dp[i][j-1]);
                }
            }
            }
            return dp[m][n];
            
	}
}
