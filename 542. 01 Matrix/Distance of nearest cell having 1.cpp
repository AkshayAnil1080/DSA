Best Video Solution with Live Coding: https://youtu.be/EL2EHHyy0m4
LIKE | SHARE | SUBSCRIBE

  n*M, n*M - bfs


  class Solution {
public:
    vector<vector<int>> nearest(vector<vector<int>> &grid) {
        int n = grid.size();
        int m = grid[0].size();
        
        vector<vector<int>> ans(n, vector<int>(m, 0));
        vector<vector<bool>> vis(n, vector<bool>(m, false));
        
        int dx[4] = {0, 0, 1, -1};
        int dy[4] = {1, -1, 0, 0};
        
        queue<pair<int, int>> q;
        
        // Put all 1s in queue
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    ans[i][j] = 0;
                    vis[i][j] = true;
                    q.push({i, j});
                }
            }
        }
        
        // BFS
        while(!q.empty()){
            auto curr = q.front();
            q.pop();
            int x = curr.first;
            int y = curr.second;
            
            for(int k = 0; k < 4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !vis[nx][ny]){
                    vis[nx][ny] = true;
                    ans[nx][ny] = ans[x][y] + 1;
                    q.push({nx, ny});
                }
            }
        }
        
        return ans;
    }
};
