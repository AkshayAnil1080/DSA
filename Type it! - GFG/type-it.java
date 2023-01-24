//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        
        int n= s.length();
        if(n==1) return 1;
        
        int l=0; int h=n;
        while(l<=h)
        {
            int mid = (l+h)/2 -1;   //o+7/2 -1 =2
            if(s.substring(0,mid+1).equals(s.substring(mid+1, 2*(mid+1))))
            return mid+1 + 1 + (n-2*(mid+1));
            
            h--;
        }
        return n;
    }
}