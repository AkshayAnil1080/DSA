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

            int arr[] = new int[(int)(N)];
int i=0;
            String inputLine2[] = read.readLine().trim().split(" ");
            for (i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }
            int graph[][] = new int[M][2];
            for (i = 0; i < M; i++) {
                String S1[] = read.readLine().trim().split(" ");
                graph[i][0] = Integer.parseInt(S1[0]);
                graph[i][1] = Integer.parseInt(S1[1]);
            }

            Solution ob = new Solution();
            System.out.println(ob.luckyPermutations(N, M, arr, graph));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {

    long luckyPermutations(int N, int M, int arr[], int[][] graph) {

        long dp[][] = new long[N][1 << N];
        int adj[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            dp[i][1 << i] = 1;
        }

        for (int i = 0; i < M; i++) {
            adj[graph[i][0] - 1][graph[i][1] - 1] = 1;
            adj[graph[i][1] - 1][graph[i][0] - 1] = 1;
        }
        for (int bitmask = 1; bitmask < (1 << N); bitmask++) {
            for (int i = 0; i < N; i++) {
                if ((1 & (bitmask >> i)) > 0) {
                    for (int j = 0; j < N; j++) {
                        if (j != i && arr[j] != arr[i] &&
                            ((1 & (bitmask >> j)) > 0) && adj[arr[i]-1][arr[j] - 1]==1) {
                            dp[i][bitmask] += dp[j][bitmask ^ (1 << i)];
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += dp[i][(1 << N) - 1];
        }
        return ans;
    }
}