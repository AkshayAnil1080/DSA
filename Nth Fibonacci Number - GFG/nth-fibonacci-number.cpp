//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
  const int m = 1000000007;

void multiply(long long F[2][2], long long M[2][2]) {
    long long x = ((F[0][0] % m * M[0][0] % m) % m + (F[0][1] % m * M[1][0] % m) % m) % m;
    long long y = ((F[0][0] % m * M[0][1] % m) % m + (F[0][1] % m * M[1][1] % m) % m) % m;
    long long z = ((F[1][0] % m * M[0][0] % m) % m + (F[1][1] % m * M[1][0] % m) % m) % m;
    long long w = ((F[1][0] % m * M[0][1] % m) % m + (F[1][1] % m * M[1][1] % m) % m) % m;

    F[0][0] = x;
    F[0][1] = y;
    F[1][0] = z;
    F[1][1] = w;
}

void power(long long F[2][2], long long n) {
    if (n == 0 || n == 1)
        return;

    long long M[2][2] = {{1, 1}, {1, 0}};

    power(F, n / 2);
    multiply(F, F);

    if (n % 2 != 0)
        multiply(F, M);
}

long long fib(long long n) {
    long long F[2][2] = {{1, 1}, {1, 0}};
    if (n == 0)
        return 0;
    power(F, n - 1);

    return F[0][0];
}


    int nthFibonacci(int N){
        return (int)fib(N);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        Solution ob;
        cout << ob.nthFibonacci(n) << endl;
    }
    return 0;
}

// } Driver Code Ends