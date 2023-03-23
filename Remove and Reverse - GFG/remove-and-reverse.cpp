//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution {
  public:
    string removeReverse(string S) {
        // code here
            string s = S;
        int freq[26] = {0};
        int flag = 0;
        int st=0; int end=s.length()-1; 
        
        // Count frequency of each character
        for(int i=0; i<s.length(); i++){
            char ch = s[i];
            freq[ch-'a']++;
        }
        
        while(st<=end) {
            //checking from start
            if(flag==0) {
                if(freq[s[st]-'a']==1) { // no repeating character, check for others
                    st++;
                } else {
                    freq[s[st]-'a']--;
                    s[st] = '#';
                    st++;
                    flag = 1; // string is reversed, traverse from 'end' ptr for flag=1
                }
            } else {
                if(freq[s[end]-'a']==1) { // no repeating character, check for others
                    end--;
                } else {
                    freq[s[end]-'a']--;
                    s[end] = '#';
                    end--;
                    flag = 0; // string is reversed, traverse from start
                }
            }
        }
        
        //after processing for flag==0, it passes to flag==1 (but here i cannot find any character freq >1)
        //but still, I have to reverse it
        if(flag==1) {
            reverse(s.begin(), s.end());
        }
        
        string ans="";
        for(int i=0; i<s.length(); i++) {
            if(s[i]!='#') {
                ans+=s[i];
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
        string S;
        cin>>S;
        Solution obj;
        auto ans = obj.removeReverse(S);
        cout<<ans<<endl;
    }
}
// } Driver Code Ends