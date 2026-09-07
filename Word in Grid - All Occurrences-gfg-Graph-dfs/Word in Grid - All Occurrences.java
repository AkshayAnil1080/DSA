
Explanation of all approaches by me on Utube - https://youtu.be/x9yTvXtSJJg
try before watching the vide  https://www.geeksforgeeks.org/problems/find-the-string-in-grid0111/1\


class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] grid, String word) {
        // code here
         int n = grid.length; int m = grid[0].length;
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();

        //visit each cell and call dfs for all 8 dir
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == word.charAt(0)){
                    // dfs for all eight neihbors
                    for(int k=0; k<8; k++){
                        if(dfs(grid, n,m, word, 0, i,j, dx[k], dy[k])){
                             ArrayList<Integer> position = new ArrayList<>();
                            position.add(i);
                            position.add(j);
                            ans.add(position);
                            break;
                        }

                    }
                }
            }
        }
        
        return ans;
    }
    boolean dfs(char[][] grid, int n, int m,  String word, int idx, int x, int y, int nei_x, int nei_y)
    {
        if (idx == word.length())
        return true; // we find the entire word
    
        //check in bound
        if(x>=0 && x<n && y>=0 && y<m && word.charAt(idx) == grid[x][y]){
            return dfs(grid, n, m, word, idx+1, x+nei_x, y+nei_y,nei_x, nei_y);
        }
        return false;
    }
};



