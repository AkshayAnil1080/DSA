//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
class Solution{
public:
    int maxIndexDiff(int arr[], int n) {
         vector<int> right(n); // max, j
        vector<int> left(n);  // min, i
    left[0] = arr[0];
    right[n - 1] = arr[n - 1];

    for (int i = 1; i < n; i++) {
        left[i] = min(arr[i], left[i - 1]);
    }

    for (int j = n - 2; j >= 0; j--) {
        right[j] = max(arr[j], right[j + 1]);
    }

    int i = 0, j = 0, ans = INT_MIN;
    while (j < n && i < n) {
        if (left[i] <= right[j]) {
            ans = max(ans, j - i);
            j++;
        } else {
            i++;
        }
    }

    return ans;
    }

};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        int a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.maxIndexDiff(a, n);
        cout << ans << "\n";
    }
    return 0;
}
// } Driver Code Ends