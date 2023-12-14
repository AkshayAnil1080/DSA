class Solution {
public:
    vector<vector<int>> onesMinusZeros(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();

        std::vector<int> oneR(m, 0);
        std::vector<int> oneC(n, 0);

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                oneR[i] += grid[i][j];
                oneC[j] += grid[i][j];
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                grid[i][j] = 2 * oneR[i] + 2 * oneC[j] - n - m;
            }
        }

        return grid; 
    }
};
