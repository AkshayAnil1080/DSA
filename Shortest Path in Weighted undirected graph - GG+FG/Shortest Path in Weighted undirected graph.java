
class Node {
    int v;
    int w;
    Node(int v, int w) {
        this.v = v;
        this.w = w;
    }
}

class Solution {
    
      int[] dis;
    int[] parent; // To track the path
    
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        
        List<List<Node>> adj = new ArrayList<>();
        
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] arr : edges) {
            adj.get(arr[0]).add(new Node(arr[1], arr[2]));
            adj.get(arr[1]).add(new Node(arr[0], arr[2])); // For undirected graph
        }

        dis = new int[n + 1];
       
        parent = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        // Run Dijkstra's algorithm
        dijkstra(adj, 1);
         /*for(int i=0; i<=n; i++){
            System.out.print(i+ " "+ dis[i]);
            System.out.println();
        }*/
        // If no path to node n, return [-1]
        if (dis[n] == Integer.MAX_VALUE) {
            return Arrays.asList(-1);
        }

        // Reconstruct the path from 1 to n
        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = parent[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        // Create the result list with the weight and the path
        List<Integer> result = new ArrayList<>();
        result.add(dis[n]);
        result.addAll(path);

        return result;
    }
    
     void dijkstra(List<List<Node>> adj, int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.w - y.w);
        
        dis[start] = 0;
        pq.add(new Node(start, 0)); // Start node and its distance

        while (!pq.isEmpty()) {
            Node curr_node = pq.poll();
            for (Node nei : adj.get(curr_node.v)) {
                // u -> v: if (d[v] > d[u] + w[u, v]) then d[v] = d[u] + w[u, v]
                if (dis[nei.v] > dis[curr_node.v] + nei.w) {
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    parent[nei.v] = curr_node.v; // Track the path
                    pq.add(new Node(nei.v, dis[nei.v]));
                }
            }
        }
    }
}
