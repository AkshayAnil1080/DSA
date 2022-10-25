//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
        // find count of each color
        int c1=0, c2=0, c3=0;
        for(String x : a)
        {
            if(x.equals("R"))
            c1++;
             if(x.equals("G"))
            c2++;
            if(x.equals("B"))
            c3++;
        }
        // System.out.println(c1+ "" + c2 + " " +c3);
        
        // 4 cases//
        // all of same color - return cpunt of that color
        if(c1!=0 && c2==0 && c3==0)
        return c1;
         if(c1==0 && c2!=0 && c3==0)
        return c2;
         if(c1==0 && c2==0 && c3!=0)
        return c3;
        
        // of each color isall even , return 2;
        if((c1%2==0 && c2%2==0 && c3%2==0) || (c1%2!=0 && c2%2!=0 && c3%2!=0))
        return 2;
        
        else return 1;
    }
}