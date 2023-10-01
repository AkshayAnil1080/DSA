//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
         HashMap<Character, Integer> map = new HashMap<>();
        int mod = 1000000007;
        int n = S.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1])%mod;
            
            char curr = S.charAt(i - 1);

            if (map.containsKey(curr)) 
                dp[i] = (dp[i] - dp[map.get(curr)-1] + mod) % mod;
 
            map.put(curr, i);
        }

        return dp[n];
    }
}

