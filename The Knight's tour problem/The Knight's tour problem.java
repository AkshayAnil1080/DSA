Best Solution video ever : https://youtu.be/2-_gngqTGio

class Solution {
    int dx[] = {-2,-1,1,2,2,1,-1,-2}; // possible knight moves in x
    int dy[]  = {1,2,2,1,-1,-2,-2,-1}; // possible knight moves in y
    int[][] ans; // to store the order of visit
    boolean solved = false; // flag to indicate a solution is found
    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        ans = new int[n][n];
        
        // Initialize answer matrix with -1 indicating not visited
        for (int[] row : ans)
            Arrays.fill(row, -1);
            
        backtrack(0,0,0,n);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(!solved){
            ArrayList<Integer> noSolution = new ArrayList<>();
            noSolution.add(-1);
            result.add(noSolution);
            return result;
        }
         // Convert the ans 2D array into ArrayList format for returning
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(ans[i][j]);
            }
            result.add(row);
        }
        
        return result;

        
    }
    void backtrack(int x, int y, int step, int n){
        if(solved) return;
        
        ans[x][y] = step;
        if(step==n*n-1){
            solved = true;
            return;
        }
        
        for(int i=0; i<8; i++){
            int newX= x+dx[i];
            int newY = y + dy[i];
            if(isValid(newX, newY, n)){
                backtrack(newX, newY, step+1, n);
                if(solved)return;
            }
        }
        //backtrack
        ans[x][y]=-1;
        
    }
    boolean isValid(int x, int y, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n && ans[x][y] == -1);
    }

}
