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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
         String s1 = str;
        String s2= str;
        int n = str.length()+1;
        int lcs[][]= new int[n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0) lcs[i][j]=0;
                
                else if (s1.charAt(i-1)==s2.charAt(j-1) && i-1!=j-1)
                lcs[i][j] = 1+ lcs[i-1][j-1];
                
                else
                lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
            }
        }
        return lcs[n-1][n-1];
    }
}