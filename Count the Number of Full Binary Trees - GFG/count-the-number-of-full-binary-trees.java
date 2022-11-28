//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.numoffbt(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static int numoffbt(int arr[], int n)
    {
         // Your code goes here
         //s1 
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i =0; i<n; i++)
         {
             max= Math.max(max, arr[i]);
             min = Math.min(min, arr[i]);
         }
         
         //s2
         int mark[]  = new int[max+1];
         int value[] = new int[max+1];
         
         for(int i=0; i<n; i++)
         {
             mark[arr[i]]=1; // marking that these ele ar per in given arr
             value[arr[i]] =1; // bcoz inti ans will be 1 for each node
         }
         
         //s3
         int ans=0;
         int mod = 1000000007;
         for(int i=min; i<=max; i++)
         {
             if(mark[i]!=0)
             {
                 //have to find the multiple of i
                 for(int j=i+i; j<=max && j/i<=i; j=j+i)
                 {
                     if(mark[j]!=0)
                     {
                     // 2cases
                         if(i==j/i)
                         value[j] = (value[j] + (value[i]*value[j/i])%mod)%mod;
                         
                         if(i!=j/i)
                             value[j] = (value[j] + 2*(value[i]*value[j/i])%mod)%mod;
                     }
                 }
             }
             ans = (ans + value[i])%mod;
         }
         return ans;
    }
}