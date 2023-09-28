//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++
//bfs
// class Solution {
//   public:
//     int numberOfEnclaves(vector<vector<int>> &a) {
//         int n = a.size();
//         int m = a[0].size();

//         // Create a queue for BFS
//         queue<pair<int, int>> queue;

//         // Add the boundary cells to the queue
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if ((i == 0 || j == 0 || i == n - 1 || j == m - 1) && a[i][j] == 1) {
//                     queue.push(make_pair(i, j));
//                 }
//             }
//         }

//         // Perform BFS
//         while (!queue.empty()) {
//             pair<int, int> cell = queue.front();
//             queue.pop();
//             int x = cell.first;
//             int y = cell.second;

//             // Mark the cell as visited
//             a[x][y] = 0;

//             // Explore the neighboring cells
//             vector<pair<int, int>> directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//             for (const auto& dir : directions) {
//                 int newX = x + dir.first;
//                 int newY = y + dir.second;

//                 // Check if the neighbor is within bounds and unvisited
//                 if (newX >= 0 && newX < n && newY >= 0 && newY < m && a[newX][newY] == 1) {
//                     queue.push(std::make_pair(newX, newY));
//                 }
//             }
//         }

//         // Count the remaining '1's in the grid
//         int cnt = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 cnt += a[i][j];
//             }
//         }

//         return cnt;
//     }
// };
//dfs
class Solution {
  public:
    int numberOfEnclaves(vector<vector<int>> &a) {
       int n = a.size();
        int m = a[0].size();

        // Perform DFS on boundary cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    dfs(a, i, j, n, m);
                }
            }
        }

        int cnt = 0;

        // Count remaining '1's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt += a[i][j];
            }
        }

        return cnt;
    }


    void dfs(vector<vector<int>>& a, int x, int y, int N, int M) {
        // Out of bounds or already visited
        if (x < 0 || x >= N || y < 0 || y >= M || a[x][y] == 0) {
            return;
        }

        // Mark the cell as visited
        a[x][y] = 0;

        // Explore the 4 neighboring cells
        dfs(a, x + 1, y, N, M);
        dfs(a, x - 1, y, N, M);
        dfs(a, x, y + 1, N, M);
        dfs(a, x, y - 1, N, M);
    }
};



//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        cout << obj.numberOfEnclaves(grid) << endl;
    }
}
// } Driver Code Ends