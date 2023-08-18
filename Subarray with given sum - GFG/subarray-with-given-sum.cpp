//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(vector<int>arr, int n, long long s)
    {
         vector<int> result;
    bool found = false;
    int st = 0, end = 0;
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        sum += arr[i];
        
        if (sum >= s) {
            end = i;
            while (s < sum && st < end) {
                sum -= arr[st++];
            }
        }
        
        if (sum == s) {
            result.push_back(st + 1);
            result.push_back(end + 1);
            found = true;
            break;
        }
    }
    
    if (!found)
        result.push_back(-1);
    
    return result;
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
        long long s;
        cin>>n>>s;
        vector<int>arr(n);
        // int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends