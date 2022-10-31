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
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    int median(int matrix[][], int R, int C) {
        // code here        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // karna padega else error in eg column mat 18 6 2
        for (int i = 0; i < R; i++)
        {
            if (matrix[i][0] < min) // minalways presetn in 1st col
                min = matrix[i][0];
     
            if (matrix[i][C-1] > max) // max alwayss in last col
                max = matrix[i][C-1];
        }
        
     
        int count = (R * C + 1) / 2;  // count of ele <= median
        while (min < max)
        {
            int mid = min + (max - min) / 2;
            int curr_count = 0;
            for (int i = 0; i < R; ++i)
            {
                int l=0,r=C-1;
                while(l<r){
                    int m=(l+r)/2;
                    if(matrix[i][m]<=mid){
                        l=m+1;
                    }else{
                        r=m;
                    }
                }
                if(matrix[i][l]<=mid){
                    curr_count++;
                }
                curr_count+=l;  // its not +=1 
            }
            if (curr_count < count)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
}