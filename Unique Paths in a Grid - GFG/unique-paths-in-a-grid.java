//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int path[][];
    static int mod = 1000000007;
    static int uniquePaths(int r, int c, int[][] grid) {
        // code here
        path = new int[r][c];
        for(int x[] : path)
        Arrays.fill(x, -1);
        
        
         return dfs(0,0,r,c,grid);
        
    }
    static int dfs(int i, int j, int r, int c,int grid[][])
    {
        if(i>=r || j>=c || i<0 || j<0) return 0;
        if(grid[i][j]==0) return 0;
        
        //bc
        if(i==r-1 && j==c-1) return 1;
        
        //
        if(path[i][j]!=-1) return path[i][j];
        
        return  path[i][j] = ( dfs(i,j+1, r,c, grid)%mod + dfs(i+1, j, r, c, grid)%mod )%mod;
        
    }
    
};