class Solution {
    int res=0;
    public int totalNQueens(int n) {
         char board[][] = new char[n][n];
        for(char cs[] : board)
        {
            Arrays.fill(cs, '.');
        }
        
        dfs(0, board );
        return res;
    }
    
     // main logic
   void dfs(int col, char[][] board )
   {
       if(col==board.length) 
       {
           res++; return;
       }
        for( int i=0; i<board.length; i++)
        {
            if(isSafe(board, i, col))
               {
                     board[i][col] ='Q';
                    dfs(col+1, board);

                    board[i][col]='.'; // BT,  i == row
               }
        }          
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