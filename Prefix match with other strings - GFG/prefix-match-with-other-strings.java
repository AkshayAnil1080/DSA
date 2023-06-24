//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        int cnt=0;
        if(k>str.length()) return 0;
        
       String pre =str.substring(0,k);
       for(int i=0; i<n; i++)
       {
           if(k>arr[i].length()) continue;
           
           String curr = arr[i].substring(0,k);
           if(pre.equals(curr)) // ==
           cnt++;
       }
       return cnt;
       
    }
}