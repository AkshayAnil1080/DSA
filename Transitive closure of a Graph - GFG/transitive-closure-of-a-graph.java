//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            
            for(int i = 0;i < N;i++)
                {String a[] = in.readLine().trim().split("\\s+");
                for(int j=0;j<N;j++)
                graph[i][j] = Integer.parseInt(a[j]);}
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for(int i = 0;i < N;i++)
               { for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
            System.out.println();}
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int n, int graph[][])
    {
       int[][] adj = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1 && i != j) {
                    adj[i][j] = 1;
                }
            }
        }
        
        //  for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(adj[i][j] +" ");
        //      }
        //       System.out.println();
        //  }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>(n));
            for (int j = 0; j < n; j++) {
                ans.get(i).add(0);
            }
        }

        for (int i = 0; i < n; i++) {
            dfs(i, i, adj, ans);
        }
        return ans;
    }

    static void dfs(int i, int j, int[][] adj,  ArrayList<ArrayList<Integer>> ans) {
        ans.get(i).set(j, 1);
        for (int it = 0; it < adj[j].length; it++) {
            if (adj[j][it] == 1 && ans.get(i).get(it) == 0) {
                dfs(i, it, adj, ans);
            }
        }
    }

}