class Solution{
    public static void main(String[] args) {
    // Run the tests
    int grid[][]= {{0,0,1,1,0}, { 1,0,1,1,0}, {0,1,0,0,0},{0,0,0,0,1}};
    System.out.println(totalIslands(grid));
    
  }

static int totalIslands(int grid[][]){
  int n = grid.length; int m = grid[0].length;
  int dx[] = { -1, -1, -1, 0, 0, 0, 1, 1, 1};
  int dy[] = { -1, 0, 1, -1, 0 ,1, -1, 0 ,1};
  int cnt=0;
  for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
      if(grid[i][j]==1){
      cnt++;
      dfs(grid, i, j ,n, m, dx, dy);
      }
    }
  }
  return cnt;
}
  static void dfs(int grid[][], int i, int j , int n, int m, int dx[], int dy[]){
    //mark the cell vis
    grid[i][j]=0;
    for(int k=0; k<8 ;k++){
      int n_x = i + dx[k];
      int n_y = j +  dy[k];
      if(isSafe(n_x, n_y, n, m) && grid[n_x][n_y]==1)
      dfs(grid, n_x, n_y, n, m, dx, dy);
    }
  }

    static boolean isSafe(int i, int j, int n, int m){
      if(i>=0 && i<n && j>=0 && j<m)
      return true;

      return false;
    }
}
