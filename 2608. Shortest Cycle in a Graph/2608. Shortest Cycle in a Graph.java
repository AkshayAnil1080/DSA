Best Video Solution with Live Coding: https://youtu.be/zRRxeOaRfEM
LIKE | SHARE | SUBSCRIBE

Time Complexity: O(V * (V + E))
Auxiliary Space: O(V)

class Solution {
    public int findShortestCycle(int n, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        int shortest = Integer.MAX_VALUE;

        // Step 2: BFS from every vertex
        for (int start = 0; start < n; start++) {
            int[] dist = new int[n];
            int[] parent = new int[n];
            Arrays.fill(dist, -1);
            Arrays.fill(parent, -1);
            Queue<Integer> q = new LinkedList<>();

            q.add(start);
            dist[start] = 0;

            while (!q.isEmpty()) {
                int u = q.poll();

                for (int v : adj.get(u)) {
                    if (dist[v] == -1) {
                        dist[v] = dist[u] + 1;
                        parent[v] = u;
                        q.add(v);
                    } else if (parent[u] != v) {
                        // Found a cycle (not immediate parent)
                        shortest = Math.min(shortest, dist[u] + dist[v] + 1);
                    }
                }
            }
        }

        return (shortest == Integer.MAX_VALUE) ? -1 : shortest;
    }
}
