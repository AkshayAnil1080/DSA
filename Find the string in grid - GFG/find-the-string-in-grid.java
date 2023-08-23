//{ Driver Code Starts
//Initial Template for Java

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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        int n = grid.length; int m = grid[0].length;
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        
         List<List<Integer>> ans = new ArrayList<>();
        
        //visit each cell and call dfs for all 8 dir
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == word.charAt(0)){
                    // dfs for all eight neihbors
                    for(int k=0; k<8; k++){
                        if(dfs(grid, n,m, word, 0, i,j, dx[k], dy[k])){
                             List<Integer> position = new ArrayList<>();
                            position.add(i);
                            position.add(j);
                            ans.add(position);
                            break;
                        }
                        
                    }
                }
            }
        }
        int res[][] = new int[ans.size()][2];
        int k=0;
        for(List<Integer> x : ans)
        {
            res[k][0]= x.get(0); res[k][1] = x.get(1);
            k++;
        }
        return res;
        
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
}