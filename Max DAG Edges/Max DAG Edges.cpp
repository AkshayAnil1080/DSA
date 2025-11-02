Best Video Solution with Live Coding: https://youtu.be/OJMUTSzwd2s
Practive Link - https://www.geeksforgeeks.org/problems/max-dag-edges/1

Time Complexity: O(V2), where V is number of Vertices
Auxiliary Space: O(V2)
class Solution {
  public:
    int maxEdgesToAdd(int V, vector<vector<int>>& edges) {
        // Step 1: Build adjacency list
        vector<vector<int>> adj(V);
        vector<vector<bool>> isEdgeExist(V, vector<bool>(V, false));

        for (auto &pre : edges) {
            int u = pre[0];
            int v = pre[1];
            // assuming input is 0-based
            if (u >= 0 && v >= 0 && u < V && v < V) {
                adj[u].push_back(v);
                isEdgeExist[u][v] = true;
            }
        }

        // Step 2: Calculate indegree of each node
        vector<int> indegree(V, 0);
        for (int i = 0; i < V; i++) {
            for (int nei : adj[i]) indegree[nei]++;
        }

        // Step 3: Add nodes with indegree 0 to queue
        queue<int> q;
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.push(i);
        }

        // Step 4: BFS / Topological Sort
        vector<int> order;
        while (!q.empty()) {
            int node = q.front();
            q.pop();
            order.push_back(node);
            for (int nei : adj[node]) {
                indegree[nei]--;
                if (indegree[nei] == 0)
                    q.push(nei);
            }
        }

        // Step 5: Count how many edges can be added without creating a cycle
        int ans = 0;
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                int u = order[i], v = order[j];
                if (!isEdgeExist[u][v])
                    ans++;
            }
        }

        return ans;
    }
};



class Solution {
    public int maxEdgesToAdd(int V, int[][] edges) {
        // Code here
        int totalPossible = V * (V - 1) / 2;
        
        // Current edges in the DAG
        int currentEdges = edges.length;
        
        // Maximum edges that can still be added
        return totalPossible - currentEdges;
    }
}


