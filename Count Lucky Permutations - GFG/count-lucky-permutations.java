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
    int adj[][] = new int[16][16];
    long dp[][] = new long[1<<16][16];
    long luckyPermutations(int N, int M, int arr[], int[][] graph) {
        // Code here
        
        //S1
        for(int i=0; i<M ;i++)
        {
            int u = graph[i][0]; int v= graph[i][1];
            adj[u][v]=1; adj[v][u]=1;
        }
        for(long x[]: dp)
        Arrays.fill(x,-1);
        //s2
        int mask=(1<<N)-1;
        return solve(arr, mask, -1);
        
    }
    long solve(int arr[], int mask, int prev)
    {
        if(prev!=-1 && dp[mask][prev]!=-1)
        return dp[mask][prev];
        
        
        if(mask==0) return 1;
        
        long count=0;
        for(int i=0; i<arr.length; i++)
        {
            // 
            if(( mask&(1<<i) )>0) // ith index is taken - checking ith bit is set
            {
                int curr = arr[i];
                // so i can take it now - either it should be a st point
                // or connections exists of curr with prev
                if( (prev==-1) || (adj[prev][curr]==1))
                count+= solve(arr, mask^(1<<i), curr);
                
            }
            
        }
        //store the ans
         if(prev>0) dp[mask][prev] = count;
        return count;
    }
}
