class Solution
{   
    public:
    //Function to return list of integers visited in snake pattern in matrix.
    vector<int> snakePattern(vector<vector<int> > mat)
    {   
         int n = mat.size();
        int m = mat[0].size();
        vector<int> result;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    result.push_back(mat[i][j]);
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    result.push_back(mat[i][j]);
                }
            }
        }
        
        return result;
    }
};
