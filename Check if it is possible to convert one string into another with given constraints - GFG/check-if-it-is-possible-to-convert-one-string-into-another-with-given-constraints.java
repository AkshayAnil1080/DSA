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
            String S[] = read.readLine().split(" ");
            Solution ob = new Solution();
            System.out.println(
                ob.isItPossible(S[0], S[1], S[0].length(), S[1].length()));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isItPossible(String S, String T, int M, int N) {
        // code here
     //s1
     if(M!=N)
      return 0;
     // s2 traveres in botj string
     int i=0; int j=0;
     while(i<M)
     {
         //
         while(i<M && S.charAt(i)=='#') i++;
         while(j<N && T.charAt(j)=='#') j++;
         
         // i oof and j IN and vv
         if(i>=M && j<N) return 0;
         if(j>=N && i<M) return 0;
         
         // == !=
         if(i<M && j<N && (S.charAt(i) == T.charAt(j)))
         {
             if(S.charAt(i)=='A' && j>i) return 0;
              if(S.charAt(i)=='B' && j<i) return 0;
         }
         if(i<M && j<N && (S.charAt(i) != T.charAt(j)))
         return 0;
         
         i++; j++;
     }
     return 1;
    }
};