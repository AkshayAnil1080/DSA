//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
        //code here
    int pos = 0; //the length of current subarray with +ve product
 
    int neg = 0;  //the length of current subarray with -ve product
 
    int res = 0; //the length longest subarray with +ve product
    
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            //reset the pos and neg
            pos=neg=0;
        }
 
        else if (arr[i] > 0)
        {
            pos+=1; //lengthof +ve SA prod increase by 1 // eg -1,2 /3 -> pos1>2
            if(neg!=0)
            neg+=1;  //neg 2>3
            
            res = Math.max(res, pos);
        } 
        
        else
        {
            int t =pos; pos=neg; neg=t;
            neg+=1;
            if(pos!=0)
            {
                pos+=1;
            }
             res = Math.max(res, pos);
        }
        
    }
    
    return res;
    }
   
}