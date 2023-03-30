//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			Solution obj = new Solution();
			int [] b = obj.lexicographicallyLargest(arr, n);
			for(int x: b) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
		//Write your code here
		int i=0;
		while(i<n)
		{
		    int j;
		  for( j=i+1; j<n && arr[j]%2 == arr[j-1]%2; j++)
		  {}
		   
		  //  Arrays.sort(arr,i,j);
		  help_sort_primitive(arr,i,j);
		  i=j; //updae the ith ptr to check next possible swap
		}
		return arr;
		
		
	}
	void help_sort_primitive(int arr[], int i, int j)
		{
		    Arrays.sort(arr,i,j);
		    while(i<j)
		    {
		        j--;
		        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
		        i++; 
		    }
		}
}