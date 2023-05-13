//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.findMaxSubsetSum(N, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {

    public static long findMaxSubsetSum(int N, int[] A) {
        // code here
    long[][] dp = new long[N + 1][2];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        
      return help(A,0,0,dp);
        
    }
   static long help (int A[], int notTaken, int i,  long dp[][])
    {
        if(i==A.length) return 0;
        // if(notTaken==1)
        // return help(A, 0, i+1) + A[i];  // since taken mark it 0
        
        // // retun max
        // return Math.max(help(A, 1, i+1), help(A, 0, i+1) + A[i] );
        
        if(dp[i][notTaken] !=-1) 
        return dp[i][notTaken]; // since taken mark it 0
        
        
         if(notTaken ==1) 
         return dp[i][notTaken] = help(A,0, i+1 ,dp)+A[i];
        // retun max
        return dp[i][notTaken] = Math.max(help(A, 1, i+1, dp), help(A, 0, i+1, dp) + A[i] );
    }
}

        
