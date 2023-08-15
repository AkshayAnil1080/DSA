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
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        
        int cnt=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==1)
                {
                    cnt++;
                    a[i]=-1;
                }
            else
            a[i]=1;

        }
        return (cnt+kadanes(a,n)) ;
    }
    static int kadanes(int arr[], int n)
    {
        int sum =0; int max = Integer.MIN_VALUE;
        for(int i =0; i <n; i++)
        {
            sum+= arr[i];
            
            max = Math.max(max, sum);
            
            if(sum<0)
            sum=0;
        }
        return Math.max(max,0);
    }
}
