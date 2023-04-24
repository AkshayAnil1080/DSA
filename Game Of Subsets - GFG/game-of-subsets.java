//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.goodSubsets(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    static int mod = (int)1e9 + 7;
    static int[] map = new int[31];
    static {
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 2; i <= 30; ++i) {
            // If num is a multiple of 4/9/25, adding it to any subset will make
            // it bad
            if (0 == i % 4 || 0 == i % 9 || 25 == i) continue;
            int mask = 0;
            for (int j = 0; j < 10; ++j) {
                if (0 == i % prime[j]) mask |= 1 << j;
            }
            map[i] = mask;
        }
    }

    public int goodSubsets(int[] arr, int n) {

        int one = 0;
        // dp[set_of_primes] represents the number of times set_of_primes can be
        // formed (set_of_primes === mask)
        // Since there are 10 possible prime numbers, there are 2^10 possible
        // set_of_primes
        int[] dp = new int[1024], cnt = new int[31];
        dp[0] = 1;
        for (int i : arr) {
            if (i == 1)
                one++;
            else if (map[i] != 0)
                cnt[i]++;
        }
        for (int i = 0; i < 31; ++i) {
            if (cnt[i] == 0) continue;
            for (int j = 0; j < 1024; ++j) {
                if (0 != (j & map[i])) continue;
                dp[j | map[i]] =
                    (int)((dp[j | map[i]] + dp[j] * (long)cnt[i]) % mod);
            }
        }
        long res = 0;
        for (int i : dp) res = (res + i) % mod;
        res--;
        if (one != 0) res = res * pow(one) % mod;
        return (int)res;
    }

    public long pow(int n) {
        long res = 1, m = 2;
        while (n != 0) {
            if (1 == (n & 1)) res = (res * m) % mod;
            m = m * m % mod;
            n >>= 1;
        }
        return res;
    }
}