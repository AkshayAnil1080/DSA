//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            boolean ans = obj.isStraightHand(n, k, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isStraightHand(int n, int size, int hand[]) {
        // code here
        // precheck - if grps can be formed or not
         if (n % size != 0) return false;
        // push elewith freq in TM
         TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int x: hand) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        
        //itr in TM and forms grp
         while (!m.isEmpty()) 
         {
            int a = m.firstKey();
            
            m.put(a , m.get(a) - 1);
            if (m.get(a) == 0) m.remove(a);
            
            for (int j = 1; j < size; j++) 
            {
                int b = a + j; // since i want consecutive
                if (m.containsKey(b)) 
                {
                    m.put(b, m.get(b) - 1);
                    if (m.get(b) == 0) m.remove(b);
                } 
                else 
                    return false;
            }
           
        }
        return true;
    
        
    }
}
