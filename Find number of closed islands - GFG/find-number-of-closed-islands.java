//{ Driver Code Starts
//Initial Template for Java

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
            String[] str = br.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] matrix = new int[N][M];
            for(int i=0; i<N; i++)
            {
                String[] s = br.readLine().trim().split(" ");
                for(int j=0; j<M; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.closedIslands(matrix, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     public int closedIslands(int[][] mat, int N, int M)
//     {
//         // Code here
//         // traverse for each cell and if not vis call dfs - cnt++
//         //standard dfs for disconnected graphs 
//         boolean vis[][] = new boolean[N][M];
//       int cnt=0;
//         for(int i=0; i<N; i++)
//         {
//             for(int j=0; j<M; j++)
//             {
                
//                 if(!vis[i][j] &&  mat[i][j]==1 &&  !c_c(i,j,N,M) )
//                 {
                     
//                      boolean hasCorner[] = new boolean[1];
                     
//                     dfs(mat, vis, i,j,N, M,hasCorner);
//                     if (!hasCorner[0])
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
//     void dfs(int[][] mat, boolean[][] vis, int x, int y,  int n, int m, boolean[] hasCorner)
//     {
//         //stopping cond - out of bound - vis and cell==0
//         if(x<0 || y<0 || x>=n || y>=m || vis[x][y]==true || mat[x][y]==0)
//         return;
        
//           //if has corner cell and cell==1 - mark hascorner as true;
//           if (c_c(x,y,n,m) && (mat[x][y] == 1))
//               hasCorner[0] = true;
        
//         //mark curr cell vis and recur for all 4 neigbors
//         vis[x][y] = true;
//          dfs(mat, vis, x + 1, y, n, m, hasCorner);
//         dfs(mat, vis, x, y + 1, n, m, hasCorner);
//         dfs(mat, vis, x - 1, y, n, m, hasCorner);
//         dfs(mat, vis, x, y - 1, n, m, hasCorner);
        
          
//     }
//     boolean c_c (int i, int j, int n, int m) //check_corner
//     {
//         return i == 0 || j == 0 || i == n-1 || j == m-1;
//     }
// }
class Solution
{
    public int closedIslands(int[][] mat, int N, int M)
    {
        boolean[][] vis = new boolean[N][M];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!vis[i][j] && !c_c(i,j,N,M) && mat[i][j]==1) {
                    boolean[] hasCorner = new boolean[1];
                    bfs(mat, vis, i, j, N, M, hasCorner);
                    if (!hasCorner[0]) cnt++;
                }
            }
        }
        return cnt;
    }
    
    void bfs(int[][] mat, boolean[][] vis, int x, int y, int n, int m, boolean[] hasCorner) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        vis[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0], cy = curr[1];
            if (c_c(cx, cy, n, m) && mat[cx][cy] == 1) hasCorner[0] = true;
            
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : dirs) {
                int nx = cx + dir[0], ny = cy + dir[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny] && mat[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    vis[nx][ny] = true;
                }
            }
        }
    }
    
    boolean c_c(int i, int j, int n, int m) {
        return i == 0 || j == 0 || i == n-1 || j == m-1;
    }
}

