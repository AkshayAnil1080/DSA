class Node {
        int v, w;
        
        Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    
class Solution {
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
         List<List<Node>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Constructing adjacency list
        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Node(edge[1], edge[2]));
            adj.get(edge[1]).add(new Node(edge[0], edge[2])); // Considering bidirectional edges
        }
        
        int minCities = Integer.MAX_VALUE;
        int result = -1;
        
        //running dijkstras for reach city
        for (int i = 0; i < n; i++) {
            int[] dis = new int[n];
            Arrays.fill(dis, Integer.MAX_VALUE);
            dijkstra(adj, i, dis);
            
            int reachableCities = 0;
            for (int j = 0; j < n; j++) {
                if (dis[j] <= distanceThreshold) {
                    reachableCities++;
                }
            }
            
           //tracking min
            if (reachableCities <= minCities) {
                minCities = reachableCities;
                result = i;
            }
        }
        
        return result;
      }
      
      // Dijkstra's Algorithm
    void dijkstra(List<List<Node>> adj, int start, int[] dis) {
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.w - y.w);
        dis[start] = 0;
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currNode = pq.poll();
            for (Node nei : adj.get(currNode.v)) {
                if (dis[nei.v] > dis[currNode.v] + nei.w) {
                    dis[nei.v] = dis[currNode.v] + nei.w;
                    pq.add(new Node(nei.v, dis[nei.v]));
                }
            }
        }
    }
}
