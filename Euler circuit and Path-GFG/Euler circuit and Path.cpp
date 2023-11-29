
class Solution {
public:
  vector<int> vis;
	int isEulerCircuit(int V, vector<int>adj[]){
	   // 1
        vis = vector<int>(V + 1, 0);
        // checking connected or not
        dfs(0, adj);

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0 && adj[i].size() > 0)
                return 0; // not connected
        }

        // 2
        int cnt = 0;
        for (int i = 0; i < V; i++) {
            if ((adj[i].size() % 2) == 1)
                cnt++;
        }
        // violates the condition for exactly once
        if (cnt > 2)
            return 0;

        // making sure exactly once and different start and end
        else if (cnt == 2)
            return 1; // EP
        else
            return 2; // EC - forming one whole cycle
    }

    void dfs(int u, vector<int> adj[]) {
        vis[u] = 1;
        for (int v : adj[u]) {
            if (vis[v] == 0)
                dfs(v, adj);
        }
    }
};
