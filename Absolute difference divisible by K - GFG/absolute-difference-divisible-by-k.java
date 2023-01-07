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
			int n = Integer.parseInt(read.readLine());
			String S[] = read.readLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(S[i]);
			int k = Integer.parseInt(read.readLine());

			Solution ob = new Solution();
			System.out.println(ob.countPairs(n, arr, k));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		long ans=0;
		
		//s1
		long rem[] = new long[k];// for storing the count of rem
		
		//s2
		for(int i=0; i<n; i++)
		{
		    rem[ arr[i]%k ]++;
		}
		//s3
		for(int i=0; i<k; i++)
		{
		    ans+= ((rem[i]-1)*rem[i])/2;
		}
		return ans;
	}
}