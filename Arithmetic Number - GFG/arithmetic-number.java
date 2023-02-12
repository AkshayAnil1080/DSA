//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String arr[] = in.readLine().trim().split("\\s+");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            out.println(ob.inSequence(A, B, C));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
// O(1)
class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        // int x=A;
        // while(Math.abs(x)<=Math.abs(B))
        // {
        //     if(x==B) return 1;
        //     x+=C;
        // }
        // return 0;
        if(A==B) return 1;
        if((B>A && C>0) || (A>B && C<0)) //- vailid AP
        {
            //diff of two  num in AP = multiple of  common diff
            if((B-A)%C==0) return 1;
        }
        return 0;
    }
}