//{ Driver Code Starts
//Initial Template for Java

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
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    
		    Solution obj = new Solution();
		    long res = obj.sumXOR(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

// class Solution{
   
//     // Function for finding maximum and value pair
//     public long sumXOR (int arr[], int n) {
//          long ans=0;
//         for(int i=0; i<n; i++)
//         {
//             for(int j=i; j<n; j++)
//             {
//                 ans+= (arr[i]^arr[j]);
//             }
//         }
//         return ans;
//     }
    
    
// }
class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
      long sum=0;
        for(int i=0; i<32; i++)
        {
            long one_cnt=0, zero_cnt=0;
            for(int j=0; j<n ;j++)
            {
                if(arr[j]%2==0)
                zero_cnt++;
                else
                one_cnt++;
                
                arr[j]/=2;
            }
            sum+= (zero_cnt*one_cnt) * (1<<i);
        }
        return sum;
    }
    
    
}



