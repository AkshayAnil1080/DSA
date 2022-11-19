//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.lcmTriplets(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
TC : O(1 ,)
class Solution {
    long lcmTriplets(long N) {
        // code here
        if(N==1 || N==2)
        {
            return N;
        }
        if(N==3)
        return 6;
        
        long ans =0;
        if(N%2!=0) //odd
        ans= N*(N-1)*(N-2);
        
        if(N%2==0)
        {
            // if muliple of 3
            if(N%3==0)
            ans = (N-1)*(N-2)*(N-3);
            
            
            else
            {
                ans = N*(N-1)*(N-3);
            }
             
        }
        return ans;
        
    }
   
}