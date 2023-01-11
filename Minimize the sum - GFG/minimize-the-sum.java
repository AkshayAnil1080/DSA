//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //s1 - to add all ele in heap min
        for(int i=0; i<N; i++)
        {
            pq.add(arr[i]);
        }
        //s2
        long ans=0;
        while(pq.size()!=1)
        
        {
            // we have the two lowest poss ele -> we will get the lowest sum poss
            int a = pq.poll();
            int b = pq.poll();
            
            int sum = a+b;
            pq.add(sum);
            
            ans+=sum;
        }
        return ans;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends