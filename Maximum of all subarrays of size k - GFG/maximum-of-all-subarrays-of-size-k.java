//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])
    {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        
        
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();
            
            //taking size of subArrays 
            int k = sc.nextInt();
            
            //Declaring and Intializing an array of size n
            int arr[] = new int[n];
            
            //adding all the elements to the array 
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }
            
            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new Solution().max_of_subarrays(arr, n, k);
            
            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function template for JAVA
//NAIVE -  slidging window
// TC: O(nxk)
// Aux space: O(n-k+1)  
// 2nd menthod = using max heap.
// Approach  - from max heap for every window  of k elements, add the root of it ArrayList and return al.
class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // will use to create max heap
      
      
      for( int i=0; i<k ;i++)
      pq.add(arr[i]);
      
      al.add(pq.peek());
      // remove the first element of arr form pq=> as want to compare for next k elements
      pq.remove(arr[0]);
      
      for( int i=k ; i<n;i++)
      {
          pq.add(arr[i]);   // add the current element
          al.add(pq.peek());  ///store the max 
          pq.remove(arr[i-k+1]);   // remove the 2nd element in 1st iteratiion i.e the first elemet of every window.
      }
      
      return al;
      
    }
}