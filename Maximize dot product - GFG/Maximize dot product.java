//recusrion
class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
		// Your code goes here
		return fun(0,0,n-m, A, B);
		
	} 
	int fun(int i, int j, int cntZero, int A[], int B[]){
	    if(i>= A.length)
	    return 0;
	    
	    int ans = Integer.MIN_VALUE;
	    //2 calls
	    //1st call - taking 0 from B
	    if(cntZero>0)
	    ans = Math.max(ans, A[i]*0 + fun(i+1, j, cntZero-1, A, B));
	    
	    //2nd call - taking the ele from B
	    if(j<B.length)
	   ans = Math.max(ans,  A[i]*B[j] + fun(i+1, j+1, cntZero, A, B));
	    
	    return ans;
	}
}
//memo
class Solution
{
	public int maxDotProduct(int n, int m, int A[], int B[]) 
	{ 
		// Your code goes here
		int memo[][][] = new int[n+1][m+1][n+1];
		for(int [][] x : memo){
		    for(int [] y:x)
		    Arrays.fill(y, Integer.MIN_VALUE);
		}
		return fun(0,0,n-m, A, B, memo);
		
	} 
	int fun(int i, int j, int cntZero, int A[], int B[], int memo[][][]){
	    if(i>= A.length)
	    return 0;
	    
	    if(memo[i][j][cntZero]!=Integer.MIN_VALUE) return memo[i][j][cntZero];
	    
	    int ans = Integer.MIN_VALUE;
	    //2 calls
	    //1st call - taking 0 from B
	    if(cntZero>0)
	    ans = Math.max(ans, A[i]*0 + fun(i+1, j, cntZero-1, A, B, memo));
	    
	    //2nd call - taking the ele from B
	    if(j<B.length)
	   ans = Math.max(ans,  A[i]*B[j] + fun(i+1, j+1, cntZero, A, B, memo));
	   
	    memo[i][j][cntZero] = ans;
	    return ans;
	}
}
//tab
class Solution {
    public int maxDotProduct(int n, int m, int[] A, int[] B) {
        
        int[][] dp = new int[m + 1][n + 1];
     //B
        for (int i = 1; i <= m; i++) {
            //A 
            for (int j = i; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + (A[j - 1] * B[i - 1]), dp[i][j-1]);
            }
        }
       
        return dp[m][n];
    }
}
