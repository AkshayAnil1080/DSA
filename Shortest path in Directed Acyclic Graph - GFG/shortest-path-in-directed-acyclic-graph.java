//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Node{
    int v; int w;
    Node(int v, int w)
    {
        this.v =v; this.w = w;
    }
}

class Solution {

	public int[] shortestPath(int V,int M, int[][] edges) {
	    
	    List<List<Node>> adj = new ArrayList<>();
        
        for(int i =0; i<=V; i++)
        {
            adj.add(new ArrayList<Node>());
        }
        
        for(int arr[] : edges)
        {
            adj.get(arr[0]).add(new Node(arr[1], arr[2]));
        }
       
	
    /// topo sort
	    boolean vis[] = new boolean[V];
	    
	    Stack<Integer> st = new Stack<>();
	    for(int u=0; u<V; u++)
	    {
	        if(!vis[u])
	        dfs(adj, u, st, vis);
	    }
	    int dist[] = new int[V];
	    //1
	      for (int i = 0; i < V; i++)
            dist[i] =  Integer.MAX_VALUE;
        //2
        dist[0]=0;
        
	    while(!st.isEmpty())
	    {
	        int u = st.pop();
	        
            if (dist[u] != Integer.MAX_VALUE)
            {
              for( Node curr : adj.get(u))
              {
                  if(dist[curr.v] >= dist[u] + curr.w)
                  dist[curr.v] = dist[u] + curr.w;
              }
            }
	    }
	     for (int i = 0; i < V; i++)
            if( dist[i] ==  Integer.MAX_VALUE ) dist[i]=-1;
            
	    return dist;
	}
	
	void dfs(List<List<Node>> adj, int u, Stack st, boolean vis[])
	{
	   vis[u] = true;
	   for(Node nei : adj.get(u))
	   {
	       if(!vis[nei.v])
	       dfs(adj, nei.v, st, vis);
	   }
	   st.push(u);
	}

}