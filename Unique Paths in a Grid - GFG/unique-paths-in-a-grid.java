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
    static int mod = 1000000007;
    static int path[][];
    static int uniquePaths(int r, int c, int[][] grid) {
        // code here
        path = new int[r][c]; // all 0
        
      
        path[0][0] = grid[0][0]==1 ? 1:0;
        
          //first col
        for(int i=1; i<r ;i++)
        {
            if(grid[i][0]==1)
            path[i][0] = path[i-1][0];
        }
        
        //first row
        for(int i=1; i<c ;i++)
        {
            if(grid[0][i]==1)
            path[0][i] = path[0][i-1];
        }
        //rest 
        for(int i=1; i<r; i++)
        {
            for(int j=1; j<c; j++)
            {
                if(grid[i][j]==1)
                path[i][j] = (path[i-1][j] %mod + path[i][j-1] %mod)%mod;
            }
        }
       return path[r-1][c-1];
        
    }
};