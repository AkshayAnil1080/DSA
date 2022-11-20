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
    public static int kthSmallest(int[] arr, int low, int high, int k) 
    { 
        //Your code here
        int ans = partition(arr, low, high);
        
        if(ans==k-1)
        return arr[ans];
        
        else  if(ans<k-1)
         return kthSmallest(arr, ans+1, high, k);
         
         else
          return kthSmallest(arr, low, ans-1, k);
  
    } 
    static int partition( int arr[], int low, int high)
    {
        int pivot = arr[high]; int i=low; // i is piv loc;
        
        for(int j=low; j<=high; j++)
        {
            if(arr[j] < pivot)
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
                i++;
            }
        }
            int temp = arr[high];
            arr[high] = arr[i];
            arr[i] = temp;
            
            
        
        return i;
    }
    
}
