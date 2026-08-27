youtube video explanation by me - https://youtu.be/dyvAwMsqsQE
Solve the problem yourself before watching the solution.

**Problem Link:**
https://www.geeksforgeeks.org/problems/buying-vegetables0016/1
**Source Code:** - 
  

 n,1
class Solution {
    public int minCost(int[][] mat) {
        // code here
        int n = mat.length;
        int p0 = mat[0][0], p1 =mat[0][1], p2 = mat[0][2];

        for(int i=1; i<n; i++){
            int c0 = mat[i][0] + Math.min(p1, p2);
             int c1 = mat[i][1] + Math.min(p0, p2);
              int c2 = mat[i][2] + Math.min(p0, p1);

              p0 = c0;
              p1 = c1;
              p2 = c2;

        }
        return Math.min(p0, Math.min(p1,p2));
    }
}


n,n
class Solution {
    int m[][];
    int dp[][];
    public int minCost(int[][] mat) {
        // code here
        m = mat;
        int n = mat.length;
        dp = new int[n+1][4];
        for(int x[] : dp)
        Arrays.fill(x, -1);
        
        return solve(0, -1);

    }
    int solve(int i, int prev){
        if(i==m.length)
        return 0;
        
        int prevIndex = (prev == -1) ? 3 : prev;
        
        if(dp[i][prevIndex]!=-1){
            return dp[i][prevIndex];
        }
        int ans = Integer.MAX_VALUE;
        for( int j =0; j<3; j++){
            if(j!= prev){
                int currCost = m[i][j];
                
                int futureCost = solve(i+1,j);
                ans  = Math.min(ans,currCost+futureCost );
            
            }
        }
        return dp[i][prevIndex] = ans;
    }
}

// 2^n, n
class Solution {
    int m[][];
    int dp[][];
    public int minCost(int[][] mat) {
        // code here
        m = mat;
        int n = mat.length;
        dp = new int[n+1][4];
        for(int x[] : dp)
        Arrays.fill(x, -1);
        
        return solve(0, -1);

    }
    int solve(int i, int prev){
        if(i==m.length)
        return 0;
        
        int prevIndex = (prev == -1) ? 3 : prev;
        
        if(dp[i][prevIndex]!=-1){
            return dp[i][prevIndex];
        }
        int ans = Integer.MAX_VALUE;
        for( int j =0; j<3; j++){
            if(j!= prev){
                int currCost = m[i][j];
                
                int futureCost = solve(i+1,j);
                ans  = Math.min(ans,currCost+futureCost );
            
            }
        }
        return dp[i][prevIndex] = ans;
    }
}



