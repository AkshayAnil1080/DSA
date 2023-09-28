//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String[] element = br.readLine().split(" ");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		    int arr [] = new int[N];
		    int brr [] = new int[M];
		    String[] elements = br.readLine().split(" ");
		    for(int i=0; i<N; i++)
		        arr[i] = Integer.parseInt(elements[i]);
		        
		    String[] ele = br.readLine().split(" ");
		    for(int i=0; i<M; i++)
		        brr[i] = Integer.parseInt(ele[i]);
		    
		    int X = Integer.parseInt(br.readLine());
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> ans;
		    ans = obj.printClosest(arr, brr, N, M, X);
		    System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
		}
	}
}


// } Driver Code Ends


//User function Template for Java

// class Solution{
//     // Function for finding maximum and value pair
//     public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
//         // code here
//         ArrayList<Integer> al = new ArrayList<Integer>();

//         int a=0; int b=0;
//         int ans = Integer.MAX_VALUE;
//         for(int i=0; i<n; i++)
//         {
//             for(int j=0; j<m; j++)
//             {
//                 if(Math.abs(arr[i]+brr[j]-x) < ans)
//                 {
//                     ans = Math.abs(arr[i]+brr[j]-x);
//                     a=arr[i]; b=brr[j];
//                 }
//             }
//         }
//         al.add(a);
//         al.add(b);
//         return al;
//     }
// }


class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int diff = Integer.MAX_VALUE;
        int a = 0, b = 0;

        int l = 0, r = m-1;
        while (l<n && r>=0)
        {
            if (Math.abs(arr[l] + brr[r] - x) < diff)
            {
              a = arr[l];
              b = brr[r];
              diff = Math.abs(arr[l] + brr[r] - x);
            }
            
            if (arr[l] + brr[r] > x)
              r--;
            else // move to the greater side
              l++;
        }
        
        ArrayList<Integer> v = new ArrayList<>();
        
        v.add(a);
        v.add(b);
        return v;
    }
}