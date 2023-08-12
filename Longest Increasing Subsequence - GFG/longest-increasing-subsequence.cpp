//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution
{
    public:
    //Function to find length of longest increasing subsequence.
    int ceilIndex(int ans[], int l, int r, int x) {
    while (l < r) {
        int m = (l + r) / 2;
        if (ans[m] >= x) {
            r = m;
        } else {
            l = m + 1;
        }
    }
    return r;
}

int longestSubsequence(int n, int arr[]) {
    int ans[n];
    int len = 1;
    ans[0] = arr[0];

    for (int i = 0; i < n; i++) {
        if (arr[i] > ans[len - 1]) {
            ans[len] = arr[i];
            len++;
        } else {
            int c = ceilIndex(ans, 0, len - 1, arr[i]);
            ans[c] = arr[i];
        }
    }
    return len;
}
};

//{ Driver Code Starts.
int main()
{
    //taking total testcases
    int t,n;
    cin>>t;
    while(t--)
    {
        //taking size of array
        cin>>n;
        int a[n];
        
        //inserting elements to the array
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        //calling method longestSubsequence()
        cout << ob.longestSubsequence(n, a) << endl;
    }
}

// } Driver Code Ends