//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
         // Complete the function
        PriorityQueue<Long>  max_h = new PriorityQueue<Long>(Collections.reverseOrder());
        PriorityQueue<Long>  min_h = new PriorityQueue<Long>();
        
        for(int i=0; i<n; i++)
        {
            max_h.add(arr[i]); min_h.add(arr[i]);
        }
        
        long m1  = max_h.remove();
          long m2  = max_h.remove();
            long m3  = max_h.remove();
            
        long min1 = min_h.remove();
         long min2 = min_h.remove();
         
         long ans = Math.max(m1*m2*m3, min1*min2*m1);
         return ans;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    Long[] arr = new Long[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Long.parseLong(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    Long res = obj.maxTripletProduct(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


// } Driver Code Ends