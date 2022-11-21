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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        int arr[] = new int[n];
        for(int i=1; i<=n; i++)
        {
            arr[i-1] =i;
        }
        int j =n-1 ; // y  n-1 ; descendig req
        
        ArrayList<Integer> s_ans = new ArrayList<>();
        solve(s_ans, j, n ,arr );
        
        return ans;
    }
    void solve(ArrayList<Integer> s_ans, int j, int sum, int arr[])
    {
        if(j<0 || sum<0)
        return;
        
        s_ans.add(arr[j]);
        
        if(sum-arr[j]==0)
        {
            ans.add(new ArrayList<>(s_ans));
        }
        //take
        solve(s_ans, j, sum-arr[j], arr);
        
        // remove the considered ele in take rec call
        s_ans.remove(s_ans.size()-1);
        
        //not take
        solve(s_ans, j-1, sum, arr);
    }
}