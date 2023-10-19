//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
	public:
	//Function to find the level of node X.
	int nodeLevel(int V, vector<int> adj[], int X) 
	{
	      vector<int> vis(V, 0);
        queue<int> q;
        q.push(0); // Start from the first node

        int level = 0; // Initialize the level to 0

        while (!q.empty()) {
            int size = q.size(); // Number of nodes at the current level

            for (int i = 0; i < size; i++) {
                int curr = q.front();
                q.pop();

                // Check if the current node is the target node X
                if (curr == X) {
                    return level; // Return the level when X is found
                }

                for (int neighbor : adj[curr]) {
                    if (vis[neighbor] == 0) {
                        q.push(neighbor);
                        vis[neighbor] = 1;
                    }
                }
            }

            level++; // Move to the next level
        }

        return -1; // If X is not found in the graph
	}
};

//{ Driver Code Starts.


int main()
{
    
    int t;
    cin >> t;
    while(t--)
    {
    	int V, E, X;
    	cin >> V >> E;

    	vector<int> adj[V];

    	for(int i = 0; i < E; i++)
    	{
    		int u, v;
    		cin >> u >> v;
    		adj[u].push_back(v);
    		adj[v].push_back(u);
    	}
    	cin>>X;

    	Solution obj;
    	cout << obj.nodeLevel(V, adj, X) << "\n";
    }

    return 0;
}


// } Driver Code Ends