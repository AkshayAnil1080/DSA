//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char a[] = new char[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next().charAt(0);
            }
            Solution obj = new Solution();
            int ans = obj.leastInterval(n, k, a);
            System.out.println(ans);
        }
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) { in = is; }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char)c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }

        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int leastInterval(int N, int k, char tasks[]) {
        // code here
        
        int[] counter = new int[26];
        int maxF = 0; // max_freq
        int maxFc = 0; // no of ch having max_freq
        for (char task : tasks) {
            counter[task - 'A']++;
        }
        for (int x : counter)
        {
            if(maxF==x)
            {
                 maxFc++;
            }
            if(maxF<x)
            {
                maxF=x;
                maxFc=1;
            }
        }
        
        // System.out.print(maxF+" " + maxFc);  // AAAA BB C - maxF =4, maxFc=1;
        // numnber of gaps req - why?  obv rest of ele counts less that maxF, they can be arranged in the gaps.
        int gaps = maxF-1;
        //number of ch can be fit in partition gaps 
        // we can repeat same task after k time so gaps will be k, 
        //but if multiple ele have same maxF, need to leave space for them in gaps
        int gaps_len = k - (maxFc - 1);
        
        // empty slot = number of gaps * gaps_len
        int avail_slot = gaps * gaps_len;
        
        int avail_task = N - maxF * maxFc;
        
        //place availabe task in total avail slot and rest as idle
        int idles = Math.max(0, avail_slot - avail_task);
        
        return N+idles;
    }
}

