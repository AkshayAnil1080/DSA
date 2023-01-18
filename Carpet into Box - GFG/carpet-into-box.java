//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int len =A; int wid = B; //box
        int steps=0;
        while(len > C || wid >D)
        {
            if(len>C)
            {
                steps ++; len/=2;
            }
            if(wid>D)
            {
                steps++;
                wid/=2;
            }
        }
        //
        int prev_ans = steps;
        steps =0;
        // rotate the box or carpet;
        len =B; wid=A;
         while(len > C || wid >D)
        {
            if(len>C)
            {
                steps ++; len/=2;
            }
            if(wid>D)
            {
                steps++;
                wid/=2;
            }
        }
        return Math.min(prev_ans, steps);
    }
   
}
