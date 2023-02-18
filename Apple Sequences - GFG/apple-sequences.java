//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
         int start = 0;
        int count =0;
        int max =0;
        char c[]=arr.toCharArray();
        for(int i=0 ; i<n; i++)
        {
            if(c[i] =='A')
            {
                max = Math.max(max, i-start+1);
            }
            if(c[i]=='O')
            { // increment count of O
                count++;
                
                // handle the case when count becomes more than spell avaialble
                if(count>m)
                {
                    //seacrh in range of [st-i) count of A and move st ahead bt this count;
                    while(start<i && c[start]=='A')
                    start++;
                    
                    start++;
                }
            max = Math.max(max, i-start+1);
            }    
            
        }
        return max;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends