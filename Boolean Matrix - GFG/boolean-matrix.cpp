//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends

// O(R*C), O(R+C)
class Solution
{   
    public:
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(vector<vector<int> > &mat)
    {
      int n = mat.size();
        int m = mat[0].size();
        
      vector<int> r(n, 0);
        vector<int> c(m, 0);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
    }
};


////O(R*C), O(1)
// class Solution
// {   
//     public:
//     //Function to modify the matrix such that if a matrix cell matrix[i][j]
//     //is 1 then all the cells in its ith row and jth column will become 1.
//     void booleanMatrix(vector<vector<int> > &matrix)
//     {
//       int n = matrix.size();
//         int m = matrix[0].size();

//         // To check the 1st row and column
//         bool isRow = false;
//         bool isCol = false;

//         // Check if at least one 1 is present in the 1st row and column
//         for (int j = 0; j < m; j++) {
//             if (matrix[0][j] == 1) {
//                 isRow = true;
//                 break;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if (matrix[i][0] == 1) {
//                 isCol = true;
//                 break;
//             }
//         }

//         // Update 1st row and column if 1 is present inside the matrix as well
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j < m; j++) {
//                 if (matrix[i][j] == 1) {
//                     matrix[i][0] = matrix[0][j] = 1;
//                 }
//             }
//         }

//         // Change the output based on the 1st row and column
//         for (int i = 1; i < n; i++) {
//             for (int j = 1; j < m; j++) {
//                 if (matrix[i][0] == 1 || matrix[0][j] == 1) {
//                     matrix[i][j] = 1;
//                 }
//             }
//         }

//         // Change the 1st row and column
//         if (isRow) {
//             for (int i = 0; i < m; i++) {
//                 matrix[0][i] = 1;
//             }
//         }

//         if (isCol) {
//             for (int i = 0; i < n; i++) {
//                 matrix[i][0] = 1;
//             }
//         }
//     }
// };


//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    while(t--) 
    {
        int row, col;
        cin>> row>> col;
        vector<vector<int> > matrix(row); 
        for(int i=0; i<row; i++)
        {
            matrix[i].assign(col, 0);
            for( int j=0; j<col; j++)
            {
                cin>>matrix[i][j];
            }
        }
        
        Solution ob;
        ob.booleanMatrix(matrix);


        for (int i = 0; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                cout<<matrix[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    return 0;
}



// } Driver Code Ends