//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        PriorityQueue<Integer> min_H = new PriorityQueue<>(); // min heap
         PriorityQueue<Integer> max_H = new PriorityQueue<>(Collections.reverseOrder());
         
         int ans=0;
         for(int i =0,j=0; i<N;i++)
         {
             min_H.add(arr[i]);
             max_H.add(arr[i]);
             
             while(j<N && max_H.peek() - min_H.peek() >1) // pt of violation of cond
             {
                  min_H.remove(arr[j]);
                max_H.remove(arr[j]);
                j++;
             }
             ans= Math.max(ans, max_H.size());
         }
         return ans;
    }
};