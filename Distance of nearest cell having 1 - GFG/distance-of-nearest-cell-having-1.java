//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends

class Pair
{
     int x; int y;
    Pair(int x, int y)
    {
        this.x=x; this.y=y;
    }
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        //s1
        int dx[]= { 1, -1, 0 , 0};
        int dy[] = { 0,0,1,-1};
        
        int m = grid.length; int n= grid[0].length;
        //s2
        int ans[][] = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            ans[i][j] = Integer.MAX_VALUE;
        }
       
       //s3
       Queue<Pair> q = new LinkedList<>();
       for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]==1)
                {
                    ans[i][j] =0;
                    q.add(new Pair(i,j));
                }
            }
        }
        //s4 std BFS
        while(!q.isEmpty())
        {
            Pair t = q.remove();
            for(int i=0; i<4; i++)
            {
                int new_x = t.x + dx[i];
                int new_y = t.y + dy[i];
                
                if((new_x>=0 && new_x<m && new_y>=0 && new_y<n)&& 
                ans[new_x][new_y] > ans[t.x][t.y])
                {
                    ans[new_x][new_y] = ans[t.x][t.y] +1;
                    q.add(new Pair(new_x, new_y));
                }
                
            }
        }
        return ans;
        
    }
}