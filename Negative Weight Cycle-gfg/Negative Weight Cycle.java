problem link - https://www.geeksforgeeks.org/problems/negative-weight-cycle3504/1
video explanation here - https://youtu.be/x7IWgA7EJcE


class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        int[] dist = new int[V];

            // Initialize all vertices with 0
            // This helps detect a negative cycle anywhere in the graph
            Arrays.fill(dist, 0);

            // Relax all edges V-1 times
            for (int i = 1; i <= V; i++) {
                for (int[] edge : edges) {
                    int u = edge[0];
                    int v = edge[1];
                    int w = edge[2];

                    if (dist[v] > dist[u] + w) {
                        dist[v] = dist[u] + w;
                        // Vth relaxation
                        // If distance still decreases, negative cycle exists
                        if(i==V)
                        return true;
                    }
                }
            }
            return false;
        }
}
