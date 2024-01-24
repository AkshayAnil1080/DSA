
//User function Template for Java
//dfs
class Solution {
    int cnt;
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        if(m!= n-1)
        return false;
        
        boolean vis[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
         for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }a
       
        for(int i=0; i<m; i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
              adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        
        cnt=1;
        dfs(adj, vis, 0);
        return cnt==n;
        
    }
    void dfs( ArrayList<ArrayList<Integer>> adj, boolean vis[], int st)
    {
        vis[st] =true;
        for(int nei : adj.get(st)){
            if(!vis[nei]){
                    cnt++;
                  dfs(adj,vis, nei);
                }
        }
    }
}

// //bfs
class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        if(m!= n-1)
        return false;
        
        boolean vis[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
         for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
       
        for(int i=0; i<m; i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
              adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        
        int cnt=1;
        int st=0;
        Queue<Integer> q = new LinkedList<>();
        vis[st]=true;
        q.add(st);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int nei : adj.get(curr)){
                if(!vis[nei]){
                    vis[nei] = true;
                    cnt++;
                    q.add(nei);
                }
            }
        }
        return cnt==n ? true: false;
    }
}
