

// class Solution
// {
//     long mod = 1000000007;
//     public int TotalWays(int N)
//     {
//       long fib[] = new long[N+1];
        
//         //s2
//         fib[0]=2; fib[1]=3;
        
//         for(int i =2; i<=N-1; i++)
//         {
//             fib[i] = (fib[i-1]%mod + fib[i-2]%mod)%mod;
//         }
//         return (int) ((fib[N-1] * fib[N-1])%mod);
//     }
// }

class Solution
{
    long mod = 1000000007;
    public int TotalWays(int N)
    {
      long a =1;long b=1; long c =0;
      for(int i =1; i<=N; i++)
      {
          c=(a%mod+b%mod)%mod;
          a=b%mod;
          b=c%mod;
      }
      return (int)((c*c)%mod);
    }
}


//cpp
class Solution{
	public:
	const long long mod = 1000000007;

    int TotalWays(int N) {
        long long a = 1, b = 1, c = 0;
        for (int i = 1; i <= N; i++) {
            c = (a % mod + b % mod) % mod;
            a = b % mod;
            b = c % mod;
        }
        return static_cast<int>((c * c) % mod);
    }
};

class Solution{
	public:
	const long long mod = 1000000007;

    int TotalWays(int N) {
        vector<long long> fib(N + 1, 0);

        // Initialize the first two elements
        fib[0] = 2;
        fib[1] = 3;

        // Calculate Fibonacci series
        for (int i = 2; i <= N - 1; i++) {
            fib[i] = (fib[i - 1] % mod + fib[i - 2] % mod) % mod;
        }

        return static_cast<int>((fib[N - 1] * fib[N - 1]) % mod);
    }
};

