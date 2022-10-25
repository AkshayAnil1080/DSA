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
        int c1=0, c2=0, c3=0;
        
        for(String curr : a)
        {
            if(curr.equals("R")) 
            c1++;
            if(curr.equals("G")) 
            c2++;
            if(curr.equals("B")) 
            c3++;
            
        } 
            if(c1!=0 && c2==0 && c3==0) return c1;  // RR
            if(c1==0 && c2!=0 && c3==0) return c2; 
            if(c1==0 && c2==0 && c3!=0) return c3; 
            
            //2 all color are present and every color is in ever num or in odd num
            if((c1%2==0 && c2%2==0 && c3%2==0) || (c1%2!=0 && c2%2!=0 && c3%2!=0))
            return 2;
            
            else  // mixture // RGB count  -> eeo ,oee, eoe
            return 1;
    }
}