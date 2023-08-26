//{ Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{
  public:
    int longestKSubstr(string s, int k) {
    unordered_map<char, int> m;
        int uniq_ch = 0, i = 0, j = 0, ans = 0, n = s.length();

        while (j < n) {
          
            //slide till uniq_ch <=k
            while (j < n) {
                char ch = s[j];
                if (m.find(ch) == m.end() || m[ch] == 0) uniq_ch++;
                m[ch] = m[ch] + 1;
             
                if (uniq_ch > k) break;
                j++;
            }

          //store the poss ans
            if (uniq_ch >= k) ans = max(ans, j - i);
            
            //reached end of string
            if (j == n) break;
        

           //start removing from front to make uniq_ch==k
            while (i < n) {
                char ch = s[i];
                if (m[ch] == 1) uniq_ch--;
                m[ch] = m[ch] - 1;

                if (uniq_ch == k) break;
                i++;
            }
            i++;
            j++;
        }
        if (ans == 0) return -1;
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int k;
        cin >> k;
        Solution ob;
        cout << ob.longestKSubstr(s, k) << endl;
    }
}

// } Driver Code Ends