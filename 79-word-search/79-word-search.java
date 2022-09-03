class Solution {
    boolean vis[][];
    public boolean exist(char[][] board, String word) {
        
        //1. staring of given word may be the character in anywhrer in 2d borad
        int n = board.length; int m = board[0].length;
        vis =new boolean[n][m];
        
        for( int i =0; i<n; i++){
            for( int j =0; j<m; j++){
                if(word.charAt(0)==board[i][j] &&
                  searchWord(i, j, 0, word, board)){
                    return true;
                }
            }
        }
        return false;
    }
    
    // O(4*word.length())
    
    boolean searchWord(int i, int j, int index, String word, char board[][]){
        // bc
        //1. searching the word through index++; => if index== word length - apna kaam ho gya
        if(index==word.length()) return true;
        
        // check oob cond and vis check and if ch at index not matcch boar[i][j] - false
        if(i<0 || i>=board.length || j<0 || j>=board[i].length ||
          word.charAt(index) != board[i][j] || vis[i][j]){
            return false;
        }
            
            //mark vis - recur in all four dir and mark false once vis(backtrack)
            vis[i][j]=true;
            if(searchWord(i+1, j ,index+1, word, board) || 
               searchWord(i-1, j ,index+1, word, board) || 
               searchWord(i, j+1 ,index+1, word, board) || 
               searchWord(i, j-1 ,index+1, word, board)){
                return true;
            }
                
            vis[i][j]=false;
            return false;    
    }
}

// TC: O(3^(MN))
// SC: O(n*m) +O(word.length) -  vis array and rec stack