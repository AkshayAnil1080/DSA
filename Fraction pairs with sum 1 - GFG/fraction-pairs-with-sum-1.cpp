//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution
{
    public:
    int countFractions(int n, int num[], int denom[])
    {
         int ans = 0;
        unordered_map<int, map<int, int>> mp;
        for (int i = 0; i < n; i++) {
            int x = num[i], y = denom[i];
            int g = gcd(x, y);
            x /= g; y /= g;
            
            int n_x = y - x, n_y = y;
            
            if (mp.find(n_x) != mp.end() && mp[n_x].find(y) != mp[n_x].end()) {
                ans += mp[n_x][y];
            }
            
            if (mp.find(x) != mp.end()) {
                map<int, int>& hm = mp[x];
                hm[y] = hm.find(y) != hm.end() ? hm[y] + 1 : 1;
            } else {
                map<int, int> hm;
                hm[y] = 1;
                mp[x] = hm;
            }
        }
        return ans;
    }

     int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    } 
    
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int numerator[n],denominator[n];
        for(int i=0;i<n;i++)
            cin>>numerator[i];
        for(int i=0;i<n;i++)
            cin>>denominator[i];
        Solution ob;
        int ans=ob.countFractions(n,numerator,denominator);
        cout<<ans<<endl;
    }
}
// } Driver Code Ends