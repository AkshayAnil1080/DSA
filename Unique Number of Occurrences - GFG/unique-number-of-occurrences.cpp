//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
    public:
    bool isFrequencyUnique(int n, int arr[])
    {
       unordered_map<int, int> map;
    for (int i=0; i<n; i++)
        map[arr[i]] = map[arr[i]] + 1;

   unordered_set<int> set;
    for (const auto& pair : map) {
        int x = pair.second;
        if (set.count(x) > 0)
            return false;

        set.insert(x);
    }
    return true; 
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
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        Solution ob;
        bool ans=ob.isFrequencyUnique(n,arr);
        if(ans)
            cout<<1<<endl;
        else
            cout<<0<<endl;
    }
}
// } Driver Code Ends