//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
     static int[][] memo; //since i and j are changing -that's y 2d
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n =S.length();
         memo = new int[n][n];
        for (int i = 0; i < n; i++) 
            Arrays.fill(memo[i], -1); // Initialize with -1 to indicate uncalculated values

        return fun(S, 0, n- 1);
    }
      static int fun(String S, int i, int j) {
        if (i >= j) {
            return 0;
        }
         if (memo[i][j] != -1) 
            return memo[i][j]; 
        
        // int ans;
        if (S.charAt(i) == S.charAt(j)) {
            return memo[i][j] = fun(S, i + 1, j - 1);
        }

        return memo[i][j] = 1 + Math.min(fun(S, i + 1, j), fun(S, i, j - 1));
    }

}