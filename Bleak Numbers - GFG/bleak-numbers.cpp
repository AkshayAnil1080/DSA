//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
	int is_bleak(int n)
	{
	     for(int i=n-30; i<=n; i++)
        {
            if(i+count_set_bits(i)==n)
            return 0;
        }
        return 1;
	}
	int count_set_bits(int n)
    {
        int cnt=0;
        while(n>0)
        {
            cnt += (n&1);
            n=n/2; // n=n>>2;
        }
        return cnt;
    }
};


//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	Solution ob;
    	int ans = ob.is_bleak(n);
    	cout << ans << "\n";
    }
	return 0;
}

// } Driver Code Ends