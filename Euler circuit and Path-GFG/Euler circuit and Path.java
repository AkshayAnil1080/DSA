
class Solution{
     int[] vis;
    public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        //1
        vis = new int[V+1];
        //checking conencted or not
        dfs(0, vis, adj);
        
        for (int i = 0; i < V; i++) 
        {
            if (vis[i]==0 && adj[i].size()>0)
                return 0; // not connected
        }
            
        //2
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if ((adj[i].size() % 2) == 1)
                cnt++;
        }
       //violates the condition for exaclty once 
        if (cnt > 2)
             return 0; 

    //making, sure exaclty once and diff start and end
       else if(cnt==2) return 1; //EP
        // if(cnt==0)
       else  return 2; //EC - forming one whole cycle
       
    }
    
    void dfs(int u, int[] vis, List<Integer>[] adj) {
        vis[u] = 1;
        for (int v : adj[u]) {
            if (vis[v]==0)
                dfs(v, vis, adj);
        }
    }
}
