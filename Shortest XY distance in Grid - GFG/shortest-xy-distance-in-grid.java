//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            ArrayList<ArrayList<Character>> grid = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                ArrayList<Character> col = new ArrayList<>();
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    col.add(S1[j].charAt(0));
                }
                grid.add(col);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestXYDist(grid, N, M));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        int[][] dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dist[i][j] = Integer.MAX_VALUE-1;
            }
        }

       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid.get(i).get(j) == 'X')
                    dist[i][j] = 0;
                else {
                    if (i-1 >= 0)  //top
                        dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    // if(j+1<M) //right --
                    //      dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
                    // if(i+1<N)//bottom --
                        //  dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    if (j-1>=0) //left
                        dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                      
                }
            }
        }
        
        for (int i = N - 1; i >= 0; i--) {
            for (int j = M - 1; j >= 0; j--) {
                if (grid.get(i).get(j) == 'X')
                    dist[i][j] = 0;
                else {
                    // if (i-1 >= 0)  //top
                    //     dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    if(j+1<M) //right --
                         dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
                    if(i+1<N)//bottom --
                         dist[i][j] = Math.min(dist[i][j], dist[i+1][j] + 1);
                    // if (j-1>=0) //left
                    //     dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                      
                }
            }
        }
        
        
        int ans = Integer.MAX_VALUE-1;
             for (int i = 0; i < N; i++) 
             {
                for (int j = 0; j < M; j++) 
                {
                    if (grid.get(i).get(j) == 'Y') ans = Math.min(ans, dist[i][j]);
                }
            }

        return ans;
    }
};


// User function Template for Java
// class Pair{
//     int a; int b;
//     Pair(int a, int b)
//     {
//         this.a=a; this.b=b;
//     }
// }

// class Solution {
//     static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N, int M) {
//         // code here
//          ArrayList<Pair> x = new ArrayList<>();
//          ArrayList<Pair> y = new ArrayList<>();
//         for(int i=0; i<N; i++)
//         {
//             for(int j=0; j<M; j++)
//             {
//                 if(grid.get(i).get(j)=='X')
//                 x.add(new Pair(i,j));
                
//                 if(grid.get(i).get(j)=='Y')
//                 y.add(new Pair(i,j));
//             }
//         }
//         int ans=Integer.MAX_VALUE;
//         for(int i=0; i<x.size(); i++)
//         {
//             for(int j=0; j<y.size();j++)
//             {
//                 ans = Math.min(ans , Math.abs(x.get(i).a - y.get(j).a) + Math.abs(x.get(i).b - y.get(j).b)); ;
//             }
//         }
//         return ans;
        
        
//     }
// };

