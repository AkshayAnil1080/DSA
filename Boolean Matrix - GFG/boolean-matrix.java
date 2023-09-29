//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     //Function to modify the matrix such that if a matrix cell matrix[i][j]
//     //is 1 then all the cells in its ith row and jth column will become 1.
//     void booleanMatrix(int mat[][])
//     {
//         // code here 
//         int n = mat.length, m = mat[0].length;
//         int r[] = new int[n]; int c[] = new int[m];
//         //step1 
//         for(int i=0; i<n; i++)
//         {
//             for(int j=0; j<m; j++)
//             {
//                 if(mat[i][j]==1)
//                 {
//                     r[i]=1; c[j]=1;
//                 }
//             }
//         }
//         //step 2
//         for(int i=0; i<n; i++)
//         {
//             for(int j=0; j<m; j++)
//             {
//                 if(r[i]==1 || c[j]==1)
//                 mat[i][j]=1;
//             }
//         }
//     }
// }

//m3
class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
       int n = matrix.length, m =matrix[0].length;

     //to check 1st row and col
        boolean isrow = false;
        boolean iscol = false;
        //s1
        // to check is atleast one 1 is presnt in 1st row and col
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 1) {
                isrow = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 1) {
                iscol = true;
                break;
            }
        }
        //extension of s1
        // update 1st row and col if 1 is presnt inside the matrix as well.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][0] =matrix[0][j] =  1;
                }
            }
        }
    //s2
    // change the o/p based in 1st row and col
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 1 || matrix[0][j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    //s3
       //chnage 1st row and col
        if (isrow) {
             for (int i = 0; i < m; i++) {
                matrix[0][i]=1;
        }
        }

        if (iscol) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 1;
            }
        }
    }
}
