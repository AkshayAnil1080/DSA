//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
         ArrayList<Integer> ans = new  ArrayList<Integer>();
         
         int curr_sum=0; int max_sum=0;
         int curr_start=0; int max_start=0; int max_end=0;
         
         for(int i =0; i<n; i++)
        {
            if(a[i]<0)
            {
                curr_sum =0; 
                curr_start =i +1;
            }
            
            else
            curr_sum += a[i];
            
            if(curr_sum > max_sum)
            {
                max_sum = curr_sum;
                // update the max_ win lend
                max_start= curr_start;
                max_end = i+1;
            }
            else if(curr_sum==max_sum)
            {
                int curr_win_len = i - curr_start +1;
                int max_win_len =  max_end - max_start;
                
                if(curr_win_len > max_win_len)
                {
                    max_start = curr_start;
                    max_end = i+1;
                }
            }
        }
        for(int i = max_start; i<max_end; i++)
        {
            ans.add(a[i]);
        }
        if(ans.isEmpty())
        ans.add(-1);
        
        return ans;
             
         
        
    }
}