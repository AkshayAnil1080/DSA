
Best Video Solution with Live Coding: https://youtu.be/EL2EHHyy0m4
LIKE | SHARE | SUBSCRIBE

  n*M, n*M - bfs
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;

        boolean vis[][] = new boolean[n][m];
        int ans[][] = new int[n][m];

        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};

        Queue<int[]> q = new LinkedList<>();

        // Initialize queue with all 0’s
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    vis[i][j] = true;
                    ans[i][j] = 0;
                    q.add(new int[]{i, j});
                }
            }
        }

        // BFS
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];

            for(int k = 0; k < 4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny]){
                    vis[nx][ny] = true;
                    ans[nx][ny] = ans[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }

        return ans;
    }
}
