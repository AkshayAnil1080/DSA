//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        int i = -1, j = -1;
        int isEmpty=0;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (grid[r][c] == 0) {
                    i=r;
                    j=c;
                    isEmpty=1;  //empty cell found
                    break;
                }
            }
            if (isEmpty==1) {
                break;
            }
        }
        if(isEmpty==0) // no empty cell
         return true;
    
    for(int x=1; x<=9; x++)
    {
        if(isSafe(i,j,x,grid))
        {
            grid[i][j]=x;
        
            //fill the next empty cell
            if(SolveSudoku(grid)) return true;
            
            // else need to back track to its parent call
            grid[i][j]=0;
        }
    }
    return false;
    }
    
   static boolean isSafe(int i, int j, int x, int grid[][])
    {
        
    
        for(int k=0; k<9; k++)
        {//row and colm
            if(grid[k][j]==x || grid[i][k]==x)
            return false;
        }
        
        int ri =i-i%3;
        int ci = j-j%3;
        for(int l=0; l<3; l++)
        {
            for(int m=0; m<3; m++)
            {
                if(grid[l+ri][m+ci]==x)
                return false;
            }
        }
        return true;
    }
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
       for(int i=0; i<9 ; i++)
        {
            for(int j=0; j<9; j++)
            {
                System.out.print(grid[i][j]+ " ");
            }
            // System.out.println();
        }
    }
}