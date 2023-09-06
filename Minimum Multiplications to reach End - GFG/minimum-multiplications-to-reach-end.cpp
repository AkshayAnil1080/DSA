//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int minimumMultiplications(vector<int>& arr, int start, int end) {
         int n = arr.size();
        std::vector<int> ans(100001, -1);
        int mod = 100000;

        std::queue<int> q;
        q.push(start % mod);
        ans[start] = 0;

        while (!q.empty()) {
            int temp = q.front();
            q.pop();

            if (temp == end)
                return ans[end];

            for (int i = 0; i < n; i++) {
                int toPush = ((temp % mod) * (arr[i] % mod)) % mod;

                if (ans[toPush] == -1) {
                    ans[toPush] = ans[temp] + 1;
                    q.push(toPush);
                }
            }
        }

        return -1;
    }
};




//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        int start, end;
        cin >> start >> end;
        Solution obj;
        cout << obj.minimumMultiplications(arr, start, end) << endl;
    }
}

// } Driver Code Ends