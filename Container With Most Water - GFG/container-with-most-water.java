//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java
//TC :O(n)

class Solve{
    
    long maxArea(int arr[], int n){
        // Code Here
        long ans=0;
        int f =0; int h=n-1;
        
        while(f<h)
        {
            ans =Math.max( ans, (h-f) * Math.min(arr[h], arr[f])); // b*h
        
            
            if(arr[f] > arr[h]) // move from lower pillar len to higher
            h=h-1;
            
            else
            f=f+1;
        }
        return ans;
    }
    
}