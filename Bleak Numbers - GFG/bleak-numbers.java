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
            int ans = ob.is_bleak(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int is_bleak(int n)
    {
        // Code here
        for(int i=n-30; i<=n; i++)
        {
            if(i+count_set_bits(i)==n)
            return 0;
        }
        return 1;
    }
    int count_set_bits(int n)
    {
        int cnt=0;
        while(n>0)
        {
            cnt += (n&1);
            n=n/2; // n=n>>2;
        }
        return cnt;
    }
}