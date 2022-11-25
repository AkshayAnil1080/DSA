//{ Driver Code Starts
//Initial Template for Java

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
            String input_line[] = read.readLine().trim().split("\\s+");
            long  N = Long.parseLong(input_line[0]);
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    long arr[][];
    long count(long n)
    {
        // Code Here
        arr= new long[40][40];
        for(int i=0;i<40; i++)
        Arrays.fill(arr[i],-1);
        
        int one =0;//count of 1;
        int bor = 0; // bits on right;
        
        long ans=0;
        while(n>0)
        {
            if((n&1L)!=0)
            {
                one++;
                ans+= ncr(bor, one); //query - get in O(1)
            }
            n/=2;
            bor++;
        }
        return ans;
    }
    long ncr(int n, int r)
    {
        if(r>n) return 0;
        if(r==0 || n==r) return 1;
        
        if(arr[n][r]!=-1)
        {
            return arr[n][r];
        }
        return arr[n][r] =  ncr(n-1,r-1) + ncr(n-1,r);
    }
}