//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

struct Pair {
    int x, y, d;
    Pair(int x, int y, int d) : x(x), y(y), d(d) {}
};
class Solution {
  public:
    int shortestDistance(int N, int M, vector<vector<int>> A, int X, int Y) {
       int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};
        queue<Pair> q;
        vector<vector<bool>> vis(N, vector<bool>(M, false));
        
        q.push(Pair(0, 0, 0));  // adding the first node
        vis[0][0] = true;  // mark it visited.
        
        while (!q.empty()) {
            Pair curr = q.front();  // dequeueing 
            q.pop();

            if (curr.x == X && curr.y == Y)
                return curr.d;
            
            for (int i = 0; i < 4; i++) {
                int n_x = dx[i] + curr.x;
                int n_y = dy[i] + curr.y;
                if (n_x >= 0 && n_x < N && n_y >= 0 && n_y < M && A[n_x][n_y] == 1 && !vis[n_x][n_y]) {
                    vis[n_x][n_y] = true;
                    q.push(Pair(n_x, n_y, curr.d + 1));
                }
            }
        }
        return -1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, M, x, y;
        cin >> N >> M;
        vector<vector<int>> v(N, vector<int>(M));
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) cin >> v[i][j];
        cin >> x >> y;
        Solution ob;
        cout << ob.shortestDistance(N, M, v, x, y) << "\n";
    }
}
// } Driver Code Ends