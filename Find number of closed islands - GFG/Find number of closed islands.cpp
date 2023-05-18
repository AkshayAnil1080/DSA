
class Solution {
    public:
    int closedIslands(vector<vector<int>>& mat, int N, int M) {
        vector<vector<bool>> vis(N, vector<bool>(M, false));
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!vis[i][j] && mat[i][j] == 1 && !c_c(i, j, N, M)) {
                    vector<bool> hasCorner(1, false);
                    dfs(mat, vis, i, j, N, M, hasCorner);
                    
                    if (!hasCorner[0])
                        cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    void dfs(vector<vector<int>>& mat, vector<vector<bool>>& vis, int x, int y, int n, int m, vector<bool>& hasCorner) {
        //stopping cond - out of bound - vis and cell==0
        if (x < 0 || y < 0 || x >= n || y >= m || vis[x][y] == true || mat[x][y] == 0)
            return;
        
        //if has corner cell and cell==1 - mark hascorner as true;
        if (c_c(x, y, n, m) && (mat[x][y] == 1))
            hasCorner[0] = true;
        
        //mark curr cell vis and recur for all 4 neighbors
        vis[x][y] = true;
        dfs(mat, vis, x + 1, y, n, m, hasCorner);
        dfs(mat, vis, x, y + 1, n, m, hasCorner);
        dfs(mat, vis, x - 1, y, n, m, hasCorner);
        dfs(mat, vis, x, y - 1, n, m, hasCorner);
    }
    
    bool c_c(int i, int j, int n, int m) { //check_corner
        return i == 0 || j == 0 || i == n - 1 || j == m - 1;
    }
};
