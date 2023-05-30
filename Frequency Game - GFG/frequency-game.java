//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        // Iterating over testcases
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];

            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int min_val=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
       for (Map.Entry<Integer,Integer> e : map.entrySet()) {
           
           int x = e.getKey(); int y=e.getValue();
           if(y<=min_val)
           {
               ans = Math.max(ans, x);
               min_val=y;
           }
       }
       return ans;
      
    }
}
