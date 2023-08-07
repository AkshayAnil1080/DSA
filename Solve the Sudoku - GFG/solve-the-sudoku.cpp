//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
// UNASSIGNED is used for empty cells in sudoku grid 
#define UNASSIGNED 0  

// N is used for the size of Sudoku grid.  
// Size will be NxN  
#define N 9  


// } Driver Code Ends


class Solution 
{
    public:
    //Function to find a solved Sudoku. 
    
    bool isSafe(int i, int j, int x, int grid[9][9])
    {
        for (int k = 0; k < 9; k++)
        { // row and column
            if (grid[k][j] == x || grid[i][k] == x)
                return false;
        }

        int ri = i - i % 3;
        int ci = j - j % 3;
        for (int l = 0; l < 3; l++)
        {
            for (int m = 0; m < 3; m++)
            {
                if (grid[l + ri][m + ci] == x)
                    return false;
            }
        }
        return true;
    }



    bool SolveSudoku(int grid[N][N])  
    { 
         int i = -1, j = -1;
        int isEmpty = 0;
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 9; c++)
            {
                if (grid[r][c] == 0)
                {
                    i = r;
                    j = c;
                    isEmpty = 1; // empty cell found
                    break;
                }
            }
            if (isEmpty == 1)
            {
                break;
            }
        }
        if (isEmpty == 0) // no empty cell
            return true;

        for (int x = 1; x <= 9; x++)
        {
            if (isSafe(i, j, x, grid))
            {
                grid[i][j] = x;

                // fill the next empty cell
                if (SolveSudoku(grid))
                    return true;

                // else need to back track to its parent call
                grid[i][j] = 0;
            }
        }
        return false;
    }
    
    //Function to print grids of the Sudoku.
    void printGrid (int grid[N][N]) 
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                cout << grid[i][j] << " ";
            }
        }
    }
};

//{ Driver Code Starts.

int main() {
	int t;
	cin>>t;
	while(t--)
	{
		int grid[N][N];
		
		for(int i=0;i<9;i++)
		    for(int j=0;j<9;j++)
		        cin>>grid[i][j];
		        
		Solution ob;
		
		if (ob.SolveSudoku(grid) == true)  
            ob.printGrid(grid);  
        else
            cout << "No solution exists";  
        
        cout<<endl;
	}
	
	return 0;
}
// } Driver Code Ends