//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
         int l = n+m;
        int gap = (l/2) + (l%2);
        while(gap>0)
        {
            int st=0; int end=st+gap;
            while(end<l)
            {
                // st in arr1 and end ina arr2
                if(st<n && end>=n)
                {
                    swap(arr1, arr2, st, end-n);
                }
                // st in arr2 and end in arr2
                else if(st>=n)
                swap(arr2, arr2, st-n, end-n);
                //st in arr1 and end in arr1
                else
                swap(arr1, arr1, st, end);
                
                st++; end++;
            }
            if(gap==1) break;
            gap = (gap/2) + (gap%2);
            
        }
    }
    static void swap( long arr1[], long arr2[], int x1, int x2)
    {
        if(arr1[x1] > arr2[x2])
        {
            long t = arr1[x1]; arr1[x1] = arr2[x2] ; arr2[x2] = t;
        }
    }
    
}
