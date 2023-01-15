//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


// User Function Template for JAVA
TC: O(2n)
// Sc
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        
        long ans[] = new long[n];
        int index = n-1;
        ans[index--] = -1;
        
        ArrayDeque<Long> st = new ArrayDeque<>();
        st.push(arr[n-1]);
        
        //s2
        for(int i=n-2; i>=0; i--)
        {
            while(!st.isEmpty() && arr[i] > st.peek()) //
            st.pop();
            
            long res = st.isEmpty() ? -1 : st.peek();
            ans[index--] = res;
            
            st.push(arr[i]);
        }
        return ans;
    } 
}