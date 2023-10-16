//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
public:
    int largestIsland(vector<vector<int>>& grid) 
    {
        unordered_map<int, int> map;
        map[0] = 0; // for neighboring cells marked as 0

        int n = grid.size();
        int region = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, region);
                    map[region] = area;
                    region--;
                }
            }
        }

        int max = map[-1];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    std::unordered_set<int> set;
                    set.insert(r > 0 ? grid[r - 1][c] : 0);
                    set.insert(c > 0 ? grid[r][c - 1] : 0);
                    set.insert(r < n - 1 ? grid[r + 1][c] : 0);
                    set.insert(c < n - 1 ? grid[r][c + 1] : 0);
                    int area = 1;
                    for (int nei : set) {
                        area += map[nei];
                    }
                    if (area > max) {
                        max = area;
                    }
                }
            }
        }

        return max;
    }

    int dfs(std::vector<std::vector<int>>& grid, int i, int j, int region) {
        int n = grid.size();
        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = region;

        int cnt = 1;
        cnt += dfs(grid, i, j + 1, region);
        cnt += dfs(grid, i + 1, j, region);
        cnt += dfs(grid, i, j - 1, region);
        cnt += dfs(grid, i - 1, j, region);

        return cnt;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin >> t;
    while(t--){

        int n;
        cin>>n;
        vector<vector<int>>grid(n,vector<int>(n));
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cin>>grid[i][j];
        Solution ob;
        cout<<ob.largestIsland(grid)<<endl;
    }
    return 0;
}

// } Driver Code Ends