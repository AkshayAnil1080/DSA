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
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            
            String S1[] = read.readLine().split(" ");
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// m1- knlogn, 1
// class Solution {
//     static long maxDiamonds(int[] A, int n, int k) {
//         // code here
//         long ans=0;
//         for(int i=0; i<k; i++)
//         {
//             Arrays.sort(A);
//             ans+= A[n-1];
//             A[n-1]= A[n-1]/2;
//         }
//         return ans;
//     }
// };

// m2- k*N, 1
// class Solution {
//     static long maxDiamonds(int[] A, int n, int k) {
//         // code here
//         long ans=0;
//         for(int i=0; i<k; i++)
//         {
//             int max=A[0]; int ind=0;
//             for(int j=1; j<n; j++)
//             if(max < A[j])
//             {
//                 max= A[j]; ind=j;
//             }
//             ans+= max;
//             A[ind]/=2;
//         }
//         return ans;
//     }
// };
// m2 - nlogn , n
class Solution {
    static long maxDiamonds(int[] A, int N, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : A)
        pq.add(x);
        long ans=0;
        for(int i=0; i<k ; i++)
        {
            int curr =  pq.remove();
            ans+=curr;
            pq.add(curr/2);
        }
        return ans;
    }
};

