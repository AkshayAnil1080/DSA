class Solution {
    public int countComponents(int n, int[][] edges) {
      
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
         for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
       
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
              adj.get(edges[i][1]).add(edges[i][0]);
        }

        boolean vis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (vis[i] == false)
            { 
                count++;
                dfs(adj, i, vis);
            }
        }
        return count;
    }
    void dfs( ArrayList<ArrayList<Integer>> adj, int st, boolean vis[])
    {
        vis[st] =true;
        for(int nei : adj.get(st)){
            if(!vis[nei]){
                   dfs(adj, nei, vis);
                }
        }
    }
}
