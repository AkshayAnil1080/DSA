//cpp
class Solution {
  public:
    vector<int> antiDiagonalPattern(vector<vector<int>> mat) 
    {
        int n = mat.size();
        vector<int> ans(n * n);
        int idx = 0;
        
        for (int c = 0; c < n; c++) {
            int i = 0, j = c;
            while (j >= 0) {
                ans[idx++] = mat[i++][j--];
            }
        }
        
        for (int r = 1; r < n; r++) {
            int i = r, j = n - 1;
            while (i < n) {
                ans[idx++] = mat[i++][j--];
            }
        }
        
        return ans;
    }
};

// java

class Solution
{
    public int[] antiDiagonalPattern(int[][] mat)
    {
        // Code here
        int n = mat.length;
        int ans[] = new int[n*n]; int idx=0;
        for(int c =0; c<n; c++)
        {
            // int r =i; int j=
             int i=0; int j=c;
             while(j>=0)
             {
                 ans[idx++] = mat[i++][j--];
             }
        }
        for(int r=1; r<n; r++)
        {
            int i=r; int j=n-1;
            while(i<n){
                 ans[idx++] = mat[i++][j--];
            }
        }
        return ans;
    }
}
