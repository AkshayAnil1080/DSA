
Youtube Link - https://youtu.be/9mg47cG4-wg
  try it yourself - https://www.geeksforgeeks.org/problems/longest-path-in-a-directed-acyclic-graph/1
class Solution {
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        // code here
        //1 build adj
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0; i<V; i++)
        adj.add(new ArrayList<>());
        
        for(ArrayList<Integer> edge: edges){
            int u = edge.get(0), v = edge.get(1), w=edge.get(2);
            adj.get(u).add(new int[]{v,w});
        }
        
        //2 topo sort
        //2a indegree
        int indegree[] = new int [V];
        for(int u=0; u<V; u++){
            for(int edge[] : adj.get(u)){
                 indegree[edge[0]]++;
            }
        }
        //2b push in queue who has indegree==0
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++){
            if(indegree[i]==0)
            q.add(i);
        }
        // 2c proces while q is not empty
        ArrayList<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int u=q.poll();
            topo.add(u);
            
            for(int edge[]: adj.get(u)){
                int v = edge[0];
                indegree[v]--;
                if(indegree[v]==0)
                    q.add(v);
            }
        }
        
        // 3 dist array
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MIN_VALUE);
        dist[src]=0;
        
        //4 relax edges in topo order
        for(int u: topo){
            // u is reachable
            if(dist[u]!=Integer.MIN_VALUE){
                for(int edge[] : adj.get(u)){
                    int v = edge[0], w = edge[1];
                    
                    dist[v]= Math.max(dist[v] , dist[u]+w);
                }
            }
        }
        return dist;
    
    }
}
