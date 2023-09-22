//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


// class Solution {

    
//     // a: input array
//     // n: size of array
//     // Function to find equilibrium point in the array.
//     public static int equilibriumPoint(long arr[], int n) {
    
//      if(n==1)return 1;
//       int lsum=0,rsum=0;
//       for(int i=0; i<n;i++)
//       {
//           lsum=0;
//           for(int k=0; k<i; k++)
//           lsum+=arr[k];
           
//           rsum=0;
//           for(int j =i+1; j<n; j++)
//           rsum+=arr[j];
           
//           if(lsum==rsum)
//           return i+1;
//       }
//       return -1;
//     }
// }

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
    
     if(n==1)
        return 1;
        
        long sum = 0 ;
        for( int i = 0 ; i<n ;i++)
        {
            sum+=arr[i];
        }
        
        long lsum=0;
        for( int i = 0; i<n ;i++)
         {
             if(lsum == sum-arr[i])
             return i+1;
             
             lsum +=arr[i];
             sum -= arr[i];
         }
     return -1;
    }
}
