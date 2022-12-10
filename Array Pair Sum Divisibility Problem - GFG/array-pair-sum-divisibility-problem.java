//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n = nums.length;
        if(n%2==1) return false;
        
        //s1
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            int rem = nums[i]%k;
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        
        //s3
        for(int i=0; i<n; i++)
        {
            //2 cases // rem=0 
            int rem =  nums[i]%k;
            if(rem==0)
            {
                if(map.get(rem)%2==1) return false;
            }
            else
            {
                if(map.get(rem)!=map.get(k-rem)) return false;
            }
            
        }
        
        return true;
    }
}