//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        if(n==1)
        return arr[0];
        
        //s1 -- pre processing for 1st ele
        int icl = arr[0]; //max sum includinf the 0th ele
        int ecl = 0; // max sum excluding 0th ele
        int new_icl=0;
        
        ////s2 - from 2nd ele onwards
        for(int i=1; i<n; i++)
        {
            new_icl = arr[i] + ecl; // taking ith ele + max sum poss from [0 to (i-2)]
            ecl = Math.max(icl, ecl); // if not considering ith-> u cant take and not take i-1 - and take its max
            
            
            icl = new_icl;
        }
        return Math.max(new_icl,ecl);
    }
}