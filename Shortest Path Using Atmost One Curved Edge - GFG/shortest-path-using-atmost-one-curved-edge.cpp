//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

struct Node {
    int v, w;
    Node(int v, int w) : v(v), w(w) {}
};



class Solution {
  public:
    int shortestPath(int n, int m, int a, int b, vector<vector<int>> &edges) {
        // code her
        // s1
        vector<vector<Node>> adj(n+1);
        vector<vector<int>> curved;
        for (int i = 0; i <= n; i++) {
            adj[i].clear();
        }
        for(auto arr : edges) {
            adj[arr[0]].emplace_back(arr[1], arr[2]);
            adj[arr[1]].emplace_back(arr[0], arr[2]);
            curved.push_back({arr[0], arr[1], arr[3]}); // curved wt
        }

        // s2 - standard dijk
        vector<int> disa = dijkstra(adj, a, n);  // inf 1 0 3 4
        vector<int> disb = dijkstra(adj, b, n);  // inf 3 4 5 0

        int ans = disa[b]; // a -> b = da[b] w/o curved wt

        // s3 - consider all poss curved wt at max 1 -> hence itr in each poss
        for(int i=0; i<m; i++) {
            int u = curved[i][0];
            int v = curved[i][1];
            int cw = curved[i][2];

            ans = min(ans, disa[u] + cw + disb[v]);
            ans = min(ans, disa[v] + cw + disb[u]);
        }
        if(ans >= 1000000001) return -1;
        return ans;
    }

    static vector<int> dijkstra(vector<vector<Node>>& adj, int start, int n) {
        vector<int> dis(n+1, 1000000001);
        priority_queue<Node, vector<Node>, function<bool(Node, Node)>> pq(
            [](Node x, Node y) -> bool { return x.w > y.w; }
        );
        // mark the starting src-src dist as 0
        dis[start] = 0;
        pq.push(Node(start, 0)); // dist of src to other vertex

        while(!pq.empty()) {
            Node curr_node = pq.top(); pq.pop();
            // itr in neigh to relax
            for(auto nei : adj[curr_node.v]) {
                // u -> v if(d[v] > d[u] + w[u,v]) d[v] = d[u] + w[u,v];
                // here d[v] = dis[nei.v]  , d[u] is dis[curr_node.v] , w[u,v] = nei.w
                if(dis[nei.v] > dis[curr_node.v] + nei.w) {
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.push(Node(nei.v, dis[nei.v]));
                }
            }
        }
        return dis;
    }
    
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,m,a,b;
        cin>>n>>m;
        cin>>a>>b;
        
        vector<vector<int>> edges;
        
        for(int i=0; i<m; i++)
        {
            int u,v,x,y;
            cin>>u>>v>>x>>y;
            edges.push_back({u,v,x,y});
        }

        Solution ob;
        cout << ob.shortestPath(n,m,a,b,edges) << endl;
    }
    return 0;
}
// } Driver Code Ends