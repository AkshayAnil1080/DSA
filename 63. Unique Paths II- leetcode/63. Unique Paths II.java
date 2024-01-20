// class Solution {
//     public int uniquePathsWithObstacles(int[][] grid) {
//         int r =grid.length;
//         int c = grid[0].length;
//         return dfs(0,0,r,c,grid);
        
//     }
//     static int dfs(int i, int j, int r, int c,int grid[][] )
//     {
//         if(i>=r || j>=c || i<0 || j<0) return 0;
//         if(grid[i][j]==1) return 0;
        
//         //bc
//         if(i==r-1 && j==c-1) return 1;
        
//         return dfs(i,j+1, r,c, grid) + dfs(i+1, j, r, c, grid);
        
//     }
// }

// class Solution {
//     int path[][];
//     public int uniquePathsWithObstacles(int[][] grid) {
//         int r =grid.length;
//         int c = grid[0].length;
//          path = new int[r][c];
//         for(int x[] : path)
//         Arrays.fill(x, -1);
//         return dfs(0,0,r,c,grid);
        
//     }
//      int dfs(int i, int j, int r, int c,int grid[][] )
//     {
//         if(i>=r || j>=c || i<0 || j<0) return 0;
//         if(grid[i][j]==1) return 0;
        
//         //bc
//         if(i==r-1 && j==c-1) return 1;

//          if(path[i][j]!=-1) return path[i][j];
        
//         return path[i][j] = dfs(i,j+1, r,c, grid) + dfs(i+1, j, r, c, grid);
        
//     }
// }

class Solution {
    
    public int uniquePathsWithObstacles(int[][] g) {

        
        int r =g.length;
        int c = g[0].length;
        int path[][] = new int[r][c];
        int grid[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                grid[i][j] =  (g[i][j] == 1)? 0:1;
            }
        }

         path[0][0] = grid[0][0]==1 ? 1:0;
        // return dfs(0,0,r,c,grid);

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
                path[i][j] = (path[i-1][j] + path[i][j-1] );
            }
        }
       return path[r-1][c-1];
        
    }
}
