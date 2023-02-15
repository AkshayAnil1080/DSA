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
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.goodStones(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    static int dp[];
    public static int goodStones(int n, int[] arr) {
        // code here
        dp = new int[n];
        for(int i=0; i<n; i++) 
        {
            if(dp[i]==0)
            {
                dp[i] = solve(arr, n,  i);
            }
        }
         int ans=0;
        for(int x:  dp)  if(x==2) ans++;
        
        return ans;
    }
    static  int solve(int arr[], int n, int n_i)
    {
        // good stone
        if(n_i<0 || n_i>=n) // going oob -> no cycle -> goos stone(2)//3
        return 2;
        
        // use the def states
         // if(dp[n_i]!=0)

        if(dp[n_i]==1 || dp[n_i]==2)
        return dp[n_i];


        dp[n_i] =1;
        return dp[n_i] = solve(arr, n, n_i+arr[n_i]);
    }
}
        
