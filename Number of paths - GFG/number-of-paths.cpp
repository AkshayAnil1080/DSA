//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
 

// } Driver Code Ends
class Solution
{
    public:
      long long pow(long long x, int y, long long mod) {
        long long res = 1;
        while (y > 0) {
            if (y % 2 != 0)
                res = (res * x) % mod;

            y = y / 2;
            x = (x * x) % mod;
        }
        return res;
    }

    long long modInv(long long n, long long mod) {
        return pow(n, static_cast<int>(mod - 2), mod);
    }
    
    
    long long  numberOfPaths(int m, int n)
    {
        long long ans = 1;
        long long mod = 1000000007LL; // Use 'LL' to indicate a long long literal
        for (long long i = n; i <= (n + m - 2); i++) {
            ans = (ans * i) % mod;
            long long invert = modInv(i - n + 1, mod);
            ans = (ans * invert) % mod;
        }
        return ans;
    }
};


//{ Driver Code Starts.

 
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int N, M;
		cin>>M>>N;
		Solution ob;
	    cout << ob.numberOfPaths(M, N)<<endl;
	}
    return 0;
}
// } Driver Code Ends