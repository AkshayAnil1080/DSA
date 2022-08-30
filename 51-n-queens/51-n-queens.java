class Solution {
    public List<List<String>> solveNQueens(int n) {
        
       
       char board[][] = new char[n][n];
        for(char cs[] : board)
        {
            Arrays.fill(cs, '.');
        }
        
        List<List<String>>  res = new ArrayList<>();

    
        dfs(0, board ,res);
        return res;
    }
    
   void dfs(int col, char[][] board, List < List < String >> res )
   {
       if(col==board.length) 
       {
           res.add(construct(board)); return;
       }
        for( int i=0; i<board.length; i++)
        {
            if(isSafe(board, i, col))
               {
                     board[i][col] ='Q';
                    dfs(col+1, board, res);

                    board[i][col]='.'; // BT,  i == row
               }
        }          
    }
               
    List<String> construct(char board[][]){
        List<String> res = new ArrayList<>();
        for( int i =0; i<board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
               
    boolean isSafe(char board[][], int row, int col){
        int duprow = row;
        int dupcol =col;
        // diag left top
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            
            row--; col--;
        }
    // left
        row = duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            
            col--;
        }
               
    // dia, left down
    row = duprow;
    col=dupcol;
    while(col>=0 && row<board.length){
            if(board[row][col]=='Q') return false;
            
            col--; row++;
        }
         
    return true;
}
      
}