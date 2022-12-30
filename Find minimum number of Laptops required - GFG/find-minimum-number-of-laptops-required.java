//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>(); // why tm - we wanted the sorted sec
        //key -  second ,value - all/deall of lappy
        
        //s2 itr in start - allocation lappy -> +1
        for(int x : start)
        map.put(x, map.getOrDefault(x, 0)+1);  // logn
        
        
        //s3 itr in end - de allocation  lappy ->  -1
         for(int x : end)
        map.put(x, map.getOrDefault(x, 0)-1);
        
        //s4 itr in treemap- why
        int ans =0; int sum=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            // max sum SA in value range
            sum += entry.getValue();
            ans= Math.max(ans, sum); // at a prt moment - max allocation of laptop
        }
        return ans;
    }
}