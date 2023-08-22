//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
    public:
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    int findMinOpeartion(vector<vector<int> > mat, int n)
    {
     int r[n] = {0};
    int c[n] = {0};
    int maxVal = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            r[i] += mat[i][j];
            maxVal = max(maxVal, r[i]);

            c[j] += mat[i][j];
            maxVal = max(maxVal, c[j]);
        }
    }

    int res = 0;
    for (int i = 0; i < n; i++) {
        r[i] = maxVal - r[i];
        res += r[i];
    }

    return res;
    } 
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<vector<int> > matrix (n,vector<int>(n));
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cin>>matrix[i][j];
        Solution ob;
        cout << ob.findMinOpeartion(matrix, n) << endl;
    }
    return 0;
}


// } Driver Code Ends