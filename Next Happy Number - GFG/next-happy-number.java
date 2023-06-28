//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.nextHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int N) { 
        if (N == 1 || N == 7) 
            return 1; 
        int sum = N, curr = N; 
  
        // make the sum of square of digits equals a sngle digit num
        while(sum > 9) { 
            sum = 0;  // reset sum for every itr
  
            // this loop finds the sum of square of digits 
            while (curr > 0) { 
                int d = curr%10; // last digit 
                sum += d*d; 
                curr/=10; 
            } 
            
            if (sum == 1) 
                return 1;
            //else make the new number are curr numnber and proceed ahead.
            curr = sum; 
        } 
        if(sum == 7) 
            return 1; 
        return 0; 
    } 
    
    static int nextHappy(int N)
    {   
        int next=N+1;
        int res=next;
        // check for every num
        while(true)
        {
            if(isHappy(next)==1)
                return next;
            next++;
            res=next;
        }
    }
}