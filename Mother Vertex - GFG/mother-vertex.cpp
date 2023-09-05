//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// V*(V+E) -TC
// O(V) - SC
// class Solution 
// {
//     public:
//     //Function to find a Mother Vertex in the Graph.
// 	int findMotherVertex(int V, vector<int>adj[])
// 	{
// 	   int ans = -1;
//         for (int i = 0; i < V; i++) {
//             vector<bool> vis(V, false);
//             vis[i] = true;

//             queue<int> q;
//             q.push(i);
//             int count = 1;
//             while (!q.empty()) {
//                 int curr = q.front();
//                 q.pop();

//                 for (int nei : adj[curr]) {
//                     if (!vis[nei]) {
//                         count++;
//                         vis[nei] = true;
//                         q.push(nei);
//                     }
//                 }
//             }
//             if (count == V) {
//                 ans = i;
//                 break;
//             }
//         }
//         return ans;
// 	}

// };

// (V+E) -TC
// O(V) - SC
class Solution 
{
    public:
    //Function to find a Mother Vertex in the Graph.
	int findMotherVertex(int V, vector<int>adj[])
	{
	    vector<bool> visited(V, false);

        int ans = -1;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited);
                ans = i;
            }
        }

        // Check again
        vector<bool> visited2(V, false);
        dfs(ans, adj, visited2);
        for (bool x : visited2) {
            if (!x) return -1;
        }

        return ans;
	}
	
	 void dfs(int node, vector<int> adj[], vector<bool>& visited) {
        visited[node] = true;
        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int V, E;
		cin >> V >> E;
		vector<int>adj[V];
		for(int i = 0; i < E; i++){
			int u, v;
			cin >> u >> v;
			adj[u].push_back(v);
		}
		Solution obj;
		int ans = obj.findMotherVertex(V, adj);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends