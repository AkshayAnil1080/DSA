https://drive.google.com/file/d/116-gQsWE9TfF0BRzFHkuWYQ6oczuY1VJ/view?usp=sharing  - DRY RUN LINK
https://practice.geeksforgeeks.org/problems/queries-on-a-matrix0443/1

// idea-  for ato c the row - make b column value++ & d+1 col value --; O(n^2)
// 2nd step - to make the value + value-1 (colm wise op) -O(n^2)

// User function Template for Java

class Solution {
    public int[][] solveQueries(int n, int[][] Queries) {
        // Code here
        
        int mat[][]= new int[n][n];
        for(int i =0; i<Queries.length; i++)
        {
            int a = Queries[i][0];
             int b = Queries[i][1];
              int c = Queries[i][2];
               int d = Queries[i][3];
               
               for(int row=a; row<=c; row++)
               {
                  mat[row][b]++;
                  if(d+1<n)
                  mat[row][d+1]--;
               }
        }
        for(int col=1; col<n; col++)
        {
            for(int row=0; row<n; row++)
            {
                mat[row][col] += mat[row][col-1];
            }
        }
        //O(n^2 + n^2
        //SC:O(n^2)
        return mat;
    }
}
