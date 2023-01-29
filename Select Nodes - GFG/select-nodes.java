//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            int[][]edge=new int[N-1][2];
            for(int i=0;i<N-1;i++)
            {
                String input[] = read.readLine().trim().split("\\s+");
                edge[i][0]=Integer.parseInt(input[0]);
                edge[i][1]=Integer.parseInt(input[1]);
            }
            Solution ob = new Solution();
            out.println(ob.countVertex(N, edge));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java

class Solution{
    public int countVertex(int N, int[][] edges){
        // code here
        
        ArrayList<Integer> adj[]=new ArrayList[N+1];
        for(int i=0;i<=N;i++)
        adj[i]=new ArrayList<>();
        for(int i=0;i<N-1;i++)
        {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        //s2
        int[][]val=new int[N+1][2];
        for(int i=1;i<=N;i++)
            val[i][1]=1;
            
        //s3
        dfs(adj, 1,1, val);
        return Math.min(val[1][0], val[1][1]);
    }
    // we do not process the leaf node
    public void dfs(ArrayList<Integer> adj[] , int src, int par, int val[][])
    {
        for(Integer v: adj[src])
       { if(v!=par)  //do not process the leaf node
        {
         dfs(adj, v, src, val);   
        }
       }
        for(Integer v: adj[src])
        {
            if(v!=par)
            {
                val[src][0]  += val[v][1];  // camera++;
                val[src][1] += Math.min(val[v][1], val[v][0]);
            }
        }
    }
    
}

//{ Driver Code Starts.

// } Driver Code Ends