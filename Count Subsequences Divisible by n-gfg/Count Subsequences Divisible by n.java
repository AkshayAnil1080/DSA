youtube video explanation by me - https://youtu.be/dyvAwMsqsQE
Solve the problem yourself before watching the solution.
https://www.geeksforgeeks.org/problems/number-of-subsequences-in-a-string-divisible-by-n5947/1

rec 2^n,n


class Solution {

    String str; int N;
    public int countSubsequences(String s, int n) {
        str=s; N=n;
        return subsets( 0, 0,  false);
    }

    int subsets( int rem, int idx, boolean taken) {

        if (idx == str.length()) {
            if (taken && rem == 0)
                return 1;
            return 0;
        }

        int d = str.charAt(idx) - '0'; // extract curr nume
        // Don't take current digit
        int notTake = subsets(rem, idx + 1, taken);
        // Take current digit
        int newRem = (rem * 10 + d) % N;
        int take = subsets( newRem, idx + 1, true);

        return take + notTake;
    }
}



//memo
n*s*2, n
class Solution {

    String str; int N;
    int mod = 1000000007;
     int[][][] dp; //1
    public int countSubsequences(String s, int n) {
        str=s; N=n;
        dp = new int[str.length()][N][2];

        for(int x[][] : dp){ //2
            for(int y[] : x)
            Arrays.fill(y, -1);
        }
        
        
        return subsets( 0, 0,  false);
    }

    int subsets( int rem, int idx, boolean taken) {

        if (idx == str.length()) {
            if (taken && rem == 0)
                return 1;
            return 0;
        }

        int t = taken ? 1 : 0;
        
        // Already calculated //3
        if (dp[idx][rem][t] != -1)
            return dp[idx][rem][t];
    
        int d = str.charAt(idx) - '0'; // extract curr nume
        // Don't take current digit
        int notTake = subsets(rem, idx + 1, taken);
        // Take current digit
        int newRem = (rem * 10 + d) % N;
        int take = subsets( newRem, idx + 1, true);

        return dp[idx][rem][t] = (take + notTake)%mod;
    }
}

//tab
n*s , n

class Solution {

    static final int MOD = 1_000_000_007;

    public int countSubsequences(String s, int n) {

        long[] dp = new long[n];

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            long[] next = dp.clone();
            // Start new subsequence
            next[d % n]++;

            // Append digit to existing subsequences
            for (int rem = 0; rem < n; rem++) {
                int newRem = (rem * 10 + d) % n;
                next[newRem] =
                    (next[newRem] + dp[rem]) % MOD;
            }
            dp = next;
        }
        return (int) dp[0];
    }
}

