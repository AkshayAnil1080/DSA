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
        long m1=Integer.MIN_VALUE , m2=Integer.MIN_VALUE ,m3=Integer.MIN_VALUE;
        
        long min1 =Long.MAX_VALUE, min2 = Integer.MAX_VALUE;
       
        for(int i = 0; i < n; i++)
        {
              
            if (arr[i] > m1)
            {
               m3=m2; m2=m1; m1=arr[i];
            }
       
            else if (arr[i] > m2)
            {
                m3=m2; m2=arr[i];
            }
       
            else if (arr[i] > m3)
                m3=arr[i];
       
           
            if (arr[i] < min1)
            {
               min2 = min1;  min1 =arr[i];
            }
            else if(arr[i] < min2)
                min2 = arr[i];
        }
        
        long ans = (long)Math.max(min1 * min2 * m1, m1*m2*m3);
        
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