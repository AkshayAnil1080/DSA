Best Video Solution with Live Coding: https://youtu.be/zRRxeOaRfEM
LIKE | SHARE | SUBSCRIBE

  
bfs for every node
Time Complexity: O(V * (V + E))
Auxiliary Space: O(V)
class Solution {
    public int shortCycle(int V, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        int shortest = Integer.MAX_VALUE;

        // Step 2: BFS from every vertex
        for (int start = 0; start < V; start++) {
            int[] dist = new int[V];
            Arrays.fill(dist, -1);
            Queue<Integer> q = new LinkedList<>();

            q.add(start);
            dist[start] = 0;

            while (!q.isEmpty()) {
                int u = q.poll(); //curr vert
                for (int v : adj.get(u)) { //neigh
                    if (dist[v] == -1) {  
                        // First time visiting v
                        dist[v] = dist[u] + 1;
                        q.add(v);
                    } else if (dist[v] >= dist[u]) {
                        // Already visited and not parent => cycle found
                        shortest = Math.min(shortest, dist[v] + dist[u] + 1);
                    }
                }
            }
        }

        return (shortest == Integer.MAX_VALUE) ? -1 : shortest;
    }
}
