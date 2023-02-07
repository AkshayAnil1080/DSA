//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine().trim());
        while(T>0)
        {
            String s[]=in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int[][] a = new int[k][2];
            for(int i=0; i<k; i++){
                s=in.readLine().trim().split(" ");
                a[i][0] = Integer.parseInt(s[0]);
                a[i][1] = Integer.parseInt(s[1]);
            }
            Solution g = new Solution();
            long[] res = g.countZero(n,k,a);
            
            for(int i=0; i<res.length; i++){
                out.print(res[i]+" ");
            }
            out.println();
            T--;
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    long[] countZero(int N, int K, int[][] arr){
        // code here
        //1 
        Set<Integer> row = new HashSet<>(); //O(k)
        Set<Integer> col = new HashSet<>();
        
        int r=N; int c=N;
        long ans[] = new long[K];
        long curr_res =N*N;
        //s3
        for(int i=0; i<K; i++) //O(k)
        {
            int x = arr[i][0]; int y= arr[i][1];
            if(!row.contains(x) && !col.contains(y))
            {
                curr_res = curr_res - r -c +1;
                c--; r--;
            }
            if(row.contains(x) && !col.contains(y))
            {
                curr_res = curr_res -r; c--;
            }
            if(!row.contains(x) && col.contains(y))
            {
                 curr_res = curr_res -c; r--;
            }
            row.add(x); col.add(y);
             ans[i] = curr_res;
        }
        return ans;
    }
 }