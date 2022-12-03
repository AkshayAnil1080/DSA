//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);
        //s2
        int l =1; int h=stalls[n-1]-stalls[0];
        while(l<=h)  // 
        {
            int possans = (l+h)/2;
            if(isPoss(stalls, k, possans))
            {
                l=possans+1;
            }
            else
            h=possans-1;
        }
        return h;
    }
    static boolean isPoss(int stalls[] , int k, int dist)
    {
        int cowsPlaced =1;
        int prevcow = stalls[0];
        for(int i=0; i<stalls.length; i++)
        {
            if(stalls[i] - prevcow >= dist)
            {
                cowsPlaced++;
                prevcow = stalls[i];
            }
        }
        boolean flag = cowsPlaced>=k ? true: false;
        return flag;
    }
}