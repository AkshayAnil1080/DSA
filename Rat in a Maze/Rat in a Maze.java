BEST VIDEO SOLUTION EVER : https://youtu.be/zDphKeWOOsw
LInk  - https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution {
    int dx [] = {-1,0,1,0};
    int dy[] ={0,1,0,-1};
    char dirChar[] = {'U','R','D', 'L'};
    int vis[][]= new int[5][5];
    ArrayList<String> res;
    public ArrayList<String> ratInMaze(int[][] mat) {
        // code here
        int n = mat.length;
        res = new ArrayList<>();
        if(mat[0][0]==0 || mat[n-1][n-1]==0){
            return res;
        }
        path(mat, 0, 0, "", n);
        Collections.sort(res);
        return res;
        
    }
    void path( int[][] m, int x, int y, String dir, int n){
        //
        if(x==n-1 && y==n-1){
        res.add(dir);
        return;
        }
        if(m[x][y]==0 || vis[x][y]==1){
            return;
        }
        
        vis[x][y]=1;
        for(int i=0; i<4; i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            
            if(newX>=0 && newX<n && newY>=0 && newY<n){
                path(m, newX, newY, dir+dirChar[i], n);
            }
        }
        //backtrack
        vis[x][y]=0;
        
    }
}












