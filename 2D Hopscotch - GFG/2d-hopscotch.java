//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int mat[][] = new int[n][m];
            for(int i = 0;i < n;i++){
                String a[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < m;j++)
                    mat[i][j] = Integer.parseInt(a[j]);
            }
            String a1[] = in.readLine().trim().split("\\s+");
            int ty = Integer.parseInt(a1[0]);
            int i = Integer.parseInt(a1[1]);
            int j = Integer.parseInt(a1[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.hopscotch(n, m, mat, ty, i, j));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int hopscotch(int n, int m, int mat[][], int ty, int j, int k) 
    {
        // code here
        int sum =0;
         int dx0e[] ={-1,-1,-1,0,1,0 };
        int dy0e[] ={0,-1,1,-1,0,1};
        
        int dx0o[] ={ -1, 0,0,1,1,1};
        int dy0o[] ={0,-1,1,-1,0,1};
        
        //ty==1
        int dx1o[] = { -1,-1,-2,-1,-1,0,0,1,1,2,2,2}; // y  odd
        int dy1o[] = { -2,-1,0,1,2,-2,2,-2,2,-1,0,1};
        
        int dx1e[] = {-2,-2,-2,-1,-1,0,0,1,1,1,1,2}; // y  even
        int dy1e[] = {-1,0,1,-2,2,-2,2,-2,-1,1,2,0};
        
        
        if(ty==0)
        {
            if(k%2!=0)
            for(int i=0; i<dx0o.length; i++)
            {
                int n_x = dx0o[i]+j;
                int n_y = dy0o[i]+k;
                
                if(n_x>=0 && n_x<n && n_y>=0 && n_y<m)
                sum+= mat[n_x][n_y];
            }
            
            else
            {
                for(int i=0; i<dx0e.length; i++)
                {
                    int n_x = dx0e[i]+j;
                    int n_y = dy0e[i]+k;
                    
                    if(n_x>=0 && n_x<n && n_y>=0 && n_y<m)
                    sum+= mat[n_x][n_y];
                }
            }
        }
        
        //ty==1
        else
        {
            if(k%2!=0)
            for(int i=0; i<dx1o.length; i++)
            {
                int n_x = dx1o[i]+j;
                int n_y = dy1o[i]+k;
                
                if(n_x>=0 && n_x<n && n_y>=0 && n_y<m)
                sum+= mat[n_x][n_y];
            }
            
            else
            {
                for(int i=0; i<dx1e.length; i++)
                {
                    int n_x = dx1e[i]+j;
                    int n_y = dy1e[i]+k;
                    
                    if(n_x>=0 && n_x<n && n_y>=0 && n_y<m)
                    sum+= mat[n_x][n_y];
                }
            }
        }
        return sum;

    }
}