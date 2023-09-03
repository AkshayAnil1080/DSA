//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<vector<char>> fill(int n, int m, vector<vector<char>> a)
    {
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 'O') // 1st col
                dfs(a, i, 0, 'O', '-', n, m);

            if (a[i][m - 1] == 'O') // last col
                dfs(a, i, m - 1, 'O', '-', n, m);
        }

        for (int i = 0; i < m; i++) {
            if (a[0][i] == 'O') // 1st row
                dfs(a, 0, i, 'O', '-', n, m);
            if (a[n - 1][i] == 'O') // last row
                dfs(a, n - 1, i, 'O', '-', n, m);
        }

        // change existing 'O' to 'X';
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == 'O')
                    a[i][j] = 'X';

        // change '-' to 'X';
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == '-')
                    a[i][j] = 'O';

        return a;
    }
      void dfs(std::vector<std::vector<char>>& a, int x, int y,
                    char prevC, char newC, int N, int M) {
        // out of bound
        if (x < 0 || x >= N || y < 0 || y >= M)
            return;
        if (a[x][y] != prevC)
            return;

        // mark with newC and iterate in 4 neighbors
        a[x][y] = newC;
        dfs(a, x + 1, y, prevC, newC, N, M);
        dfs(a, x - 1, y, prevC, newC, N, M);
        dfs(a, x, y + 1, prevC, newC, N, M);
        dfs(a, x, y - 1, prevC, newC, N, M);
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, m;
        cin>>n>>m;
        vector<vector<char>> mat(n, vector<char>(m, '.'));
        for(int i = 0;i < n;i++)
            for(int j=0; j<m; j++)
                cin>>mat[i][j];
        
        Solution ob;
        vector<vector<char>> ans = ob.fill(n, m, mat);
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                cout<<ans[i][j]<<" ";
            }
            cout<<"\n";
        }
    }
    return 0;
}
// } Driver Code Ends