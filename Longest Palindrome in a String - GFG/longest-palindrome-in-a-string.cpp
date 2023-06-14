//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    string longestPalin (string s) {
        int n = s.length();
        int len = 0;
        string ans = "";

        for (int i = 0; i < n; i++) {
            string curr = help(s, i, i); // odd
            if (curr.length() > len) {
                ans = curr;
                len = curr.length();
            }

            curr = help(s, i, i + 1); // even
            if (curr.length() > len) {
                ans = curr;
                len = curr.length();
            }
        }

        return ans;
    }

    static string help(string s, int st, int end) {
        int n = s.length();
        while (st >= 0 && end < n) {
            if (s[st] == s[end]) {
                st--;
                end++;
            } else {
                break;
            }
        }
        return s.substr(st + 1, end - st - 1);
    }
};
//{ Driver Code Starts.

int main()
{
    int t; cin >> t;
    while (t--)
    {
        string S; cin >> S;
        
        Solution ob;
        cout << ob.longestPalin (S) << endl;
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends