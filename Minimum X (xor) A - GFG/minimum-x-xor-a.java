//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java
// Max( loga, logb)

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int sB1 = setBit(a);
        int sB =  setBit(b);
        if(sB1==sB)
        return a;
        
        int ans=0;
        for(int i=0; i<=31 ;i++)
        {
            int mask = 1<<i;
            int set = a & mask;
            
            if(set==0 && sB1 < sB)
            {
                ans |= mask; // ans = ans|mask // include the mask in ans -y ? i flipped 0->1/ // to amake the number of 1 in x equla to b
                sB--;
            }
            else if(set!=0 && sB1 > sB)
            {
                sB1--;
            }
            else
            {
                ans |= set ; // including the same ithe bit of A in ans(x);
            }
        }
        return ans;
        
    }
    static int setBit(int n)  // 
    {
        int count=0;
        while(n>0)
        {
            if((n&1)!=0)
            count++;
            
            n=n/2;
        }
        return count;
    }
}