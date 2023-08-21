//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] mat)
    {
        // code here
        int dx[]= {-1, -1, -1, 0, 0, 0 , 1, 1, 1};
        int dy[]= { -1,0, 1, -1, 0, 1, -1, 0, 1};
        int n = mat.length, m=mat[0].length;
        int ans=0;
        for(int i=0; i<n ;i++)
        {
            for(int j=0; j<m; j++)
            {
                if(mat[i][j]==1){
                int cnt=0;
                  for(int x=0; x<9; x++){
                        int n_x = i+dx[x];
                        int n_y = j+dy[x];
                           if(n_x>=0 && n_x<n && n_y>=0 && n_y<m){
                               if(mat[n_x][n_y]==0)
                               cnt++;
                           }
                    }
                
                if(cnt>0 && cnt%2==0)
                ans++;
                }
            }
        }
        return ans;
    }
}