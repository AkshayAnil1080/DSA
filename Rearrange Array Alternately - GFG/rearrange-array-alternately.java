//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}




// } Driver Code Ends

// Tc: O(n)
// SC:O(1)
class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        long max =arr[0];
        for(int i =0; i<n; i++)
        {
            max = Math.max(max, arr[i]);
        }
        
        long m  = max+1;
        int f=0; int b = n-1;
        //s2
        for(int i=0; i<n; i+=2)
        {
            long v1 = arr[b--]%m;
            arr[i] +=  (m*v1);
            
            if(i+1<n)
            {
                long v2 = arr[f++]%m;
                arr[i+1] += (m*v2);
            }
        }
        //s3
        for(int i=0; i<n; i++)
        {
            arr[i] /=m;
        }
    }
    
}


