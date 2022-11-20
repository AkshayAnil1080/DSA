//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // s1
        for(int i =0; i<k; i++)
        {
            pq.add(arr[i]);
        }
        //s2
        for(int i=k; i<arr.length; i++)
        {
            if(arr[i] < pq.peek())
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
        
    } 
}
// Tc:O(nlogk)
// SC:O(k)