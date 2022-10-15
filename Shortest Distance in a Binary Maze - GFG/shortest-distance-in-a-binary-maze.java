//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair
{
    int x; int y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] src, int[] des) {

        // Your code here
        Queue<Pair> q  = new LinkedList<>();
        
        q.add(new Pair(src[0], src[1]));
        grid[src[0]][src[1]]=0; // mark that node unvis
        
        int ans=0;
        // bfs -leverl order
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-->0)
            {
                Pair curr = q.remove();
                int i =curr.x; int j=curr.y;
                if(i==des[0] &&j==des[1]) return ans; /// src reached dest
                
                // else traveserse in 4 dir -
                if(i>0 && grid[i-1][j]==1)
                {
                    grid[i-1][j]=0;
                    q.add(new Pair(i-1,j));
                }
                if(j>0 && grid[i][j-1]==1)
                {
                    grid[i][j-1]=0;
                    q.add(new Pair(i,j-1));
                }
                if(i<grid.length-1 && grid[i+1][j]==1)
                {
                    grid[i+1][j]=0;
                    q.add(new Pair(i+1,j));
                }if(j<grid[0].length-1 && grid[i][j+1]==1)
                {
                    grid[i][j+1]=0;
                    q.add(new Pair(i,j+1));
                }
            }
            ans++;
        }
        return -1;
    }
}
