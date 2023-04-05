//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int countSpecialNumbers(int N, vector<int> arr) {
        // Code here
         map<int, int> freq;
        unordered_set<int> uniq;
        int max = 0;

        for (int i = 0; i < N; i++) 
        {
            freq[arr[i]] = freq.find(arr[i]) == freq.end() ? 1 : freq[arr[i]] + 1;
            uniq.insert(arr[i]);
            max = max > arr[i] ? max : arr[i];
        }
        
        unordered_set<int> special;
        for(int z : uniq)
        {
            for (int i = 2 * z; i <= max;  i+= z)  //sieve
                if (uniq.find(i) != uniq.end()) 
                    special.insert(i);

        }
        int ans=0;
        for (auto x : freq) 
        {
            if (x.second > 1) 
                ans += x.second;
            
            else if (special.find(x.first) != special.end())
                ans++;
        }
         
        return ans; 
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        vector<int> arr(N);
        for (int i = 0; i < N; i++) {
            cin >> arr[i];
        }

        Solution ob;
        cout << ob.countSpecialNumbers(N, arr) << endl;
    }
    return 0;
}
// } Driver Code Ends