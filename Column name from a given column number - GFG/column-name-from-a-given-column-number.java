//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java
class Solution
{
    String colName (long n)
    {
        StringBuilder ans = new StringBuilder(); // to store the result
    
    	while (n > 0){
    	    n--;
    		ans.append((char)('A' + n%26));
    		n /= 26;
    	}
    	return ans.reverse().toString();
}
}