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
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int n, int S){
        // code here
        
      StringBuilder ans = new StringBuilder();
        if(S==0 && n>1)
        return "-1";
        for(int i=0 ;i<n; i++)
        {
            if(S>=9){
            ans.append('9');
            S-=9;
            }
            
            else{
                ans.append((char)(S+48));
                S=0;
            }
        }
        if(S>0) // eg N=2, S=20
        return "-1";
        
        return ans.toString();
        
    }
}