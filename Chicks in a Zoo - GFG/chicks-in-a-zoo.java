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
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans = obj.NoOfChicks(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        
        long count =1; // number of chciks poss at day n
        long arr[] = new long[42];
        arr[6] =1;
        for(int i=1; i<N; i++)
        {
            
            
            //1. 
            count -= arr[i]; // ith day - how many chick we have that will become x2
            
            //2.
            arr[i+6] = 2*count;  // update for i day to i+6th day; 
            
            count += 2*count;
        }
        return count;
    }
}