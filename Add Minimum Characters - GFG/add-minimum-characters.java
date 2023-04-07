//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
	public static int addMinChar(String str){
		//code here
    	StringBuilder orig =new StringBuilder(str);
		StringBuilder temp=new StringBuilder(str);
	    
	    //we can usea append and reverse on SB not on string
	    String s = orig.append('#').append(temp.reverse()).toString();
	    
// 			System.out.println(s);
        int n=s.length();
		int[]lps= LPS(s);
// 		for(int x : lps)
// 		System.out.println(x+" ");
		return str.length()-lps[n-1];
	}
	
	public static int[] LPS(String str)
{
    int n = str.length();
    int lps[] = new int[n];
    int i = 1, len = 0;
    lps[0] = 0; // lps[0] is always 0
     
    while (i < n)
    {
        if (str.charAt(i) == str.charAt(len))
        {
            len++;
            lps[i] = len;
            i++;
        }
        else
        {
           
            if (len == 0)
            {
                lps[i] = 0;
                i++;
 
            }
            else
            {
                len = lps[len - 1];
            }
        }
    }
    return lps;
}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends