//{ Driver Code Starts
// Initial Template for Java
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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to return Breadth First Traversal of given graph.
    static int time;
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        //s1
        boolean vis[] = new boolean[V];
        int disc[] = new int[V]; // dfs order
        int low[] = new int[V]; // lowest disc time reachable vertex
        boolean ap [] = new boolean[V];
        int parent[] = new int[V];
        
        Arrays.fill(parent, -1);
        time=0;
        //s2
        for(int i=0; i<V; i++)
        {
            if(vis[i]==false)
            {
                dfs(adj, i, vis, disc, low, parent, ap);
            }
        }
         ArrayList<Integer> ans = new  ArrayList<Integer>();
         for(int i =0; i<V;i ++)
         {
             if(ap[i]) ans.add(i);
         }
         if(ans.isEmpty())
         ans.add(-1);
         
         return ans;
        
     }
     
     //s3
     void dfs(ArrayList<ArrayList<Integer>> adj, int u, boolean vis[], int disc[], int low[], int parent[], boolean ap[])
     {
        vis[u] = true;
        disc[u]=low[u] = ++time; int children =0;
        
        //b
        // traverse in neigh
        for(Integer v : adj.get(u))
        {
            if(!vis[v])
            {
                children++;
                parent[v] = u;
                dfs(adj, v, vis, disc, low, parent, ap); // recur for neigh
                
                
                // u can reach v -> update u -> lowest disc time
                low[u] = Math.min(low[u], low[v]);
                
                //root node
                if(parent[u]==-1 && children>1)
                ap[u] = true;
                
                if(parent[u]!=-1 && low[v] >= disc[u]) //non root
                ap[u] = true;
                
                
            }
            else if(v!=parent[u]) // handling if v is vis before u and loop.
            low[u] = Math.min (low[u], disc[v]);
        }
        
     }
     
     
}