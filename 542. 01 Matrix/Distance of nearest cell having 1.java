Best Video Solution with Live Coding: https://youtu.be/EL2EHHyy0m4
LIKE | SHARE | SUBSCRIBE

  n*M, n*M - bfs

class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        int n = grid.length;
        int m =grid[0].length;
        
        boolean vis[][] = new boolean[n][m];
        int dx[]={0,0,1,-1};
        int dy[] ={1,-1,0,0};
        
        Queue<int[]> q  = new LinkedList<>();
        
        //
        int ans[][] = new int[n][m];
        for(int i=0 ;i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    ans[i][j]=0;
                    vis[i][j] = true;
                    q.add(new int[] {i,j});
                }
            }
        }
   
   //bfs
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int curr[] = q.poll();
                int x = curr[0]; int y=curr[1];
                
                for(int k =0; k<4; k++){
                    int new_x = x+dx[k];
                     int new_y = y+dy[k];
                     
                     //
                     if(new_x>=0 && new_x<n && new_y>=0 && new_y<m && !vis[new_x][new_y]){
                         vis[new_x][new_y]=true;
                         ans[new_x][new_y] = ans[x][y]+1;
                         q.add(new int[] {new_x, new_y});
                     }
                }
            }
        }
        //
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0 ;i<n; i++){
            ArrayList<Integer> curr = new ArrayList<>();
            for(int j=0; j<m; j++){
                curr.add(ans[i][j]);
            }
            res.add(curr);
        }
        return res;
        
    }
}
