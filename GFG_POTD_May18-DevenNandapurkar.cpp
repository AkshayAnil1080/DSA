/* 
Author:- Deven Nandapurkar 

Date;- 18th may. 

Problem:- Find number of closed islands. 
Problem Link:- https://practice.geeksforgeeks.org/problems/find-number-of-closed-islands/1 

Difficulty:- hard. 

Problem was previosuly asked in Google. 

Cpp Solution below. 
*/

class Solution {
    public:
    
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
    
    //check_corner
    
    bool c_c(int i, int j, int n, int m) { 
        return i == 0 || j == 0 || i == n - 1 || j == m - 1;
    }
    
    int closedIslands(vector<vector<int>>& matrix, int N, int M) {
        // Code here
        
        // 1 = land 
        // 0 = water; 
        // closed island = group of 1s surrounded by only 0s. -> i.e water locked islands. 
        
        // topic of graphs -> similar to the no. of disconnected islands. 
        
        // method:- Traverse for each cell and if the cell is not visited then call DFS -> cnt++. 
        // std as disconnected islands. 
        
        
        vector<vector<bool>> vis(N, vector<bool>(M, false)) ;
        int cnt = 0;
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(!vis[i][j] && matrix[i][j] == 1 && !c_c(i, j, N, M)) {
                    vector<bool> hasCorner(1, false);
                    dfs(matrix, vis, i, j, N, M, hasCorner);
                    
                    if(!hasCorner[0])
                        cnt++;
                }
            }
        }
        return cnt++;
    }
};

// time complexity:- O(n*m); 
// space complexity:- O(n*m); 

// the auxilary complexities of the problem are same as that of the std DFS algo. 
