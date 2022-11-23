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
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java
//  n^2 + n + N^2 + n + n= O(N^2) 
// SC:O(n)
class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {

        int n = nums.length;
        // Code here
        int  x[] = new  int[n] ; //lis
        int  y[]  = new int[n] ; // lds
        
        x = lis_fun(nums);
        
        //s2 reverse ths nums and y= lis_fun - reverse
        reverse(nums);
        
        y = lis_fun(nums);
        reverse(y);
        
        int ans=0;
        for(int i=0; i<n; i++)
        {
            ans = Math.max(ans, x[i]+y[i]-1);
        }
        return ans;
    }
    
    int[] lis_fun(int arr[])
    {
        int n = arr.length;
       int  lis[] = new int[n];
        lis[0]=1;
        for(int i=1; i<n; i++)
        {
            lis[i]=1;
           for(int j =0; j<i; j++)
           {
               if(arr[j] < arr[i])
               {
                   lis[i] = Math.max(lis[i], lis[j]+1);
               }
           }
        }
        return lis;
    }
    void reverse(int arr[])
    {
        int n = arr.length;
        for(int i =0; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
}