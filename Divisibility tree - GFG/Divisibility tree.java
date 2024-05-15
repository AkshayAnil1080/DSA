class Solution {
       List<List<Integer>> adj ;
       int ans;
    public int minimumEdgeRemove(int n, int[][] edges) {
        // code here
      adj = new ArrayList<>();
           for (int i = 0; i <=n; i++) {
            adj.add(new ArrayList<>());
        }
        ans=0;
        boolean vis[] = new boolean[n+1];
         
        for(int x[] : edges){
            addEdge(x[0], x[1]);
        }
        
        dfs(1, vis);
        return ans;
        
    }
     void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
      int dfs(int node, boolean[] vis) {
      
      int cnt=0; vis[node] = true;
      
        int cntTillYet=0;
        
      for(int u : adj.get(node)){
          if(!vis[u]){
              cntTillYet = dfs(u, vis);
              if(cntTillYet%2==0){
                //   System.out.println(u+ " ");
              ans++;
              }
              else
              cnt+= cntTillYet;
          }
      }
      return cnt+1;
    }
}
