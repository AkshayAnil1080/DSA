// You are given an integer n, there is a n × n chessboard with a Knight starting at the top-left corner (0, 0). Your task is to determine a valid Knight's Tour, where the Knight visits every square exactly once, following the standard movement rules of a chess Knight (two steps in one direction and one step perpendicular), for example if a Knight is placed at cell (2, 2), in one move it can move to any of the following cells: (4, 3), (4, 1), (0, 3), (0, 1), (3, 4), (3, 0), (1, 4) and (1, 0).

// You have to return the order in which each cell is visited. If a solution exists, return the sequence of numbers (starting from 0) representing the order of visited squares. If no solution is possible, return an empty list.

// Note: You can return any valid ordering, if it is correct the driver code will print true else it will print false.

// Examples:

// Input: n = 5
// Output: true
// Explanation: A possible Knight's Tour in a 5x5 chessboard is given below where Each number represents the step at which the Knight visits that cell, starting from (0, 0) as step 0.
// [[0, 11, 2, 17, 20],
//  [3, 16, 19, 12, 7],
//  [10, 1, 6, 21, 18],
//  [15, 4, 23, 8, 13], 
 // [24, 9, 14, 5, 22]]

Best video solution - https://www.youtube.com/watch?v=2-_gngqTGio&t=28s

  

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
        if (!solved) {
            return new ArrayList<>(); // updated: return empty list if no solution
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
