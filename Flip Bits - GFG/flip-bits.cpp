//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
    public:
    int kadanes(int arr[], int n) {
    int sum = 0;
    int max_sum = INT_MIN;

    for (int i = 0; i < n; i++) {
        sum += arr[i];
        max_sum = max(max_sum, sum);

        if (sum < 0) {
            sum = 0;
        }
    }

    return max(max_sum, 0);
}

int maxOnes(int a[], int n) {
    int cnt = 0;

    for (int i = 0; i < n; i++) {
        if (a[i] == 1) {
            cnt++;
            a[i] = -1;
        } else {
            a[i] = 1;
        }
    }

    return cnt + kadanes(a, n);
}
};


//{ Driver Code Starts.
int main()
{
    int t; cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n+5];
        for(int i=0;i<n;i++)
            cin>>a[i];
        Solution ob;
        cout<< ob.maxOnes(a, n) <<endl;
    }
    return 0;
}

// } Driver Code Ends