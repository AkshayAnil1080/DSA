//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++


class Solution {
  public:
    vector<int> eventualSafeNodes(int V, vector<int> adj[]) {
      vector<vector<int>> revadj(V);
        for (int i = 0; i < V; ++i) {
            revadj[i] = vector<int>();
        }

        // Reverse the graph
        for (int i = 0; i < V; ++i) {
            for (int nei : adj[i]) {
                revadj[nei].push_back(i);
            }
        }

        vector<int> ans;
        vector<int> indegree(V, 0);
        queue<int> q;

        // Mark the indegree
        for (int i = 0; i < V; ++i) {
            for (int x : revadj[i]) {
                indegree[x]++;
            }
        }

        // Find nodes with indegree 0
        for (int i = 0; i < V; ++i) {
            if (indegree[i] == 0) {
                q.push(i);
            }
        }

        // Perform topological sort
        while (!q.empty()) {
            int u = q.front();
            q.pop();
            ans.push_back(u);

            for (int v : revadj[u]) {
                if (--indegree[v] == 0) {
                    q.push(v);
                }
            }
        }

        sort(ans.begin(), ans.end());
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {

        int V, E;
        cin >> V >> E;
        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
        }

        Solution obj;
        vector<int> safeNodes = obj.eventualSafeNodes(V, adj);
        for (auto i : safeNodes) {
            cout << i << " ";
        }
        cout << endl;
    }
}

// } Driver Code Ends