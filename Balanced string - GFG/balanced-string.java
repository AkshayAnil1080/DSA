//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int N) {
        // code here
        StringBuilder ans = new StringBuilder();
        StringBuilder allCh = new StringBuilder();
        
        for(int i=0; i<26;i++)
        {
            allCh.append((char)('a'+i));
        }
        
        int allChTimes = N/26;
        int r = N%26;
        
        //s2
        while(allChTimes-->0)
        {
            ans.append(allCh);
        }
        
        //s3
        if(N%2==0)
        {
            for(int i=0; i<r/2; i++) 
            ans.append((char)('a'+i));
            
            for(int i=26-r/2 ;i<26; i++)
             ans.append((char)('a'+i));
        }
        
        //s4
        else
        {
            //sod
            int sod =0; int t=N;
            while(t>0)
            {
                sod += t%10; t/=10;
            }
            if(sod%2==0)
            {
                for(int i=0; i<(r+1)/2; i++) 
                ans.append((char)('a'+i));
            
                for(int i=26-(r-1)/2 ;i<26; i++)
                 ans.append((char)('a'+i));
            }
            else //sod is odd
            {
                for(int i=0; i<(r-1)/2; i++) 
                ans.append((char)('a'+i));
            
                for(int i=26-(r+1)/2 ;i<26; i++)
                 ans.append((char)('a'+i));
                
            }
        }
        return ans.toString();
    }
}