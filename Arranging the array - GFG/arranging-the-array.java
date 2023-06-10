//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends





// class Solution {
    
//     public void Rearrange(int a[], int n)
//     {
//         // Your code goes here
//         mergeSort(a, 0, n-1);
//     }
//     void mergeSort(int arr[], int l, int r)
//     {
//         if (l < r) {
//             // Same as (l + r)/2, but avoids overflow for
//             // large l and h
//             int m = l + (r - l) / 2;
     
//             // Sort first and second halves
//           mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);
     
//             merge(arr, l, m, r);
//         }
//     }


//     void merge(int arr[], int l, int m, int r)
// {
//     int i, j, k;
//     int n1 = m - l + 1;
//     int n2 = r - m;
 
   
//       int L[] = new int[n1];
//         int R[] = new int[n2];
//     for (i = 0; i < n1; i++)
//         L[i] = arr[l + i];
//     for (j = 0; j < n2; j++)
//         R[j] = arr[m + 1 + j];
        
 
  
//     i = 0; // Initial index of first subarray
//     j = 0; // Initial index of second subarray
//     k = l; // Initial index of merged subarray
 
    
 
   
//     while (i < n1 && L[i] < 0)
//         arr[k++] = L[i++];
 
//     while (j < n2 && R[j] < 0)
//         arr[k++] = R[j++];
 
//     while (i < n1)
//         arr[k++] = L[i++];
 
//     while (j < n2)
//         arr[k++] = R[j++];
// }
 
// }
class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        mergeSort(a, 0, n-1);
    }
    void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Same as (l + r)/2, but avoids overflow for
            // large l and h
            int m = l + (r - l) / 2;
     
            // Sort first and second halves
           mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
     
            merge(arr, l, m, r);
        }
    }
    void merge(int arr[], int l, int m, int r)
{
    int i = l; // Initial index of 1st subarray
    int j = m + 1; // Initial index of 2nd
 
    while (i <= m && arr[i] < 0)
        i++;
 
    // arr[i..m] is positive
 
    while (j <= r && arr[j] < 0)
        j++;
 
    // arr[j..r] is positive
 
    // reverse positive part of left [i-m]
   
    reverse(arr, i, m);
 
    // reverse negative part of right [m+1..j-1])
    reverse(arr, m + 1, j - 1);
 
    // reverse arr[i..j-1]
    reverse(arr, i, j - 1);
}
  static void reverse(int arr[], int l, int r)
    {
        if (l < r) {
            arr = swap(arr, l, r);
            reverse(arr, ++l, --r);
        }
    }
      static int[] swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
