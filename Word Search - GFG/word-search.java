//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0) && help(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
     boolean help(char[][] b, String w, int i, int j, int len)
    {
        if(len == w.length())  //if reached the word end
            return true;
            
        if(i < 0 || j < 0 || i >= b.length || j >= b[0].length) //if went oob
            return false;
            
        if(b[i][j] != w.charAt(len)) //the dir in which we moved does not have matching ch.
            return false;
            //character mactches, mark it and recur for all 4 dir for next ch.
            
        b[i][j] = '*';  //mark it vis so that it cannot take the same ch again in path.
       return
            help(b, w, i-1, j, len+1) || //up
           help(b, w, i+1, j, len+1) || //down
            help(b, w, i, j-1, len+1) || //left
            help(b, w, i, j+1, len+1);   // right
   
    }
    
}