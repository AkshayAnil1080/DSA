//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int n = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[n];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    Solution obj = new Solution();
		    int ans = obj.maxDistance(arr, n);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        //s1
        int max1= Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        
        int max2= Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        //s2
        for(int i=0 ;i<n ;i++)
        {
            max1= Math.max(max1, arr[i]-i);
            min1 = Math.min(min1, arr[i]-i);
            
            max2 = Math.max(max2, arr[i]+i);
            min2 = Math.min(min2, arr[i]+i);
        }
        return Math.max(max1-min1, max2 - min2 );
    }
    
    
}


