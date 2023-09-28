//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java


// class Solution {

//     int numberOfEnclaves(int[][] a) {

//       int n = a.length; int m= a[0].length;
//         	for(int i = 0;i < n;i++){
// 			for(int j = 0;j < m;j++){
// 			    if(i==0 || j==0 || i==n-1 || j==m-1)
// 			    dfs(a, i,j,n,m);
// 			}
//     	}
	
			    
// 			 int cnt =0;
// 		for(int i = 0;i < n;i++)
// 			for(int j = 0;j < m;j++)
// 				cnt+=a[i][j];
				    

// 		return cnt;

//     }
//      static void dfs(int a[][], int x, int y, 
//                         int N, int M)
//     {
//         // out of bound
//         if (x < 0 || x >= N || y < 0 || y >= M)
//             return;
//         if(a[x][y]==0)
//         return;
//         // mark with newC and itr in 4 neighbours
//         a[x][y] = 0;
//         dfs(a, x+1, y,  N, M);
//         dfs(a, x-1, y,  N, M);
//         dfs(a, x, y+1,  N, M);
//         dfs(a, x, y-1,  N, M);
//     }
// }

class Solution {

    int numberOfEnclaves(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        // Create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();

        // Add the boundary cells to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == m - 1) && a[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];
            
            // Mark the cell as visited
            a[x][y] = 0;

            // Explore the neighboring cells
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                // Check if the neighbor is within bounds and unvisited
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && a[newX][newY] == 1) {
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        // Count the remaining '1's in the grid
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt += a[i][j];
            }
        }

        return cnt;
    }
}
    