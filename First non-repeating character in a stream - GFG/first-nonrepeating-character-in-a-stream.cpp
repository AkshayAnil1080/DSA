//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// class Solution {
// 	public:
// 		string FirstNonRepeating(string A){
// 		   string ans = "";
//         int n = A.length();
//         int arr[26] = {0};
//         queue<char> q;
//         for (int i = 0; i < n; i++)
//         {
//             char ch = A[i];
//             arr[ch - 'a']++;
//             q.push(ch);

//             while (!q.empty())
//             {
//                 if (arr[q.front() - 'a'] == 1)
//                 {
//                     ans += q.front();
//                     break;
//                 }
//                 else
//                     q.pop();
//             }
//             if (q.empty())
//                 ans += '#';
//         }
//         return ans;
// 		}

// };

class Solution {
	public:
		string FirstNonRepeating(string A){
		    string ans = "";
        int n = A.length();
        
        vector<vector<int>> freq(26, vector<int>(2)); // store freq and idx
        
        for (int i = 0; i < n; i++)
        {
            char ch = A[i];
            freq[ch - 'a'][0]++; // increase frequency
            freq[ch - 'a'][1] = i; // store the idx
            
            int res_ch = -1;
            int min_idx = INT_MAX;
            
            // Get the character with freq 1 and lowest idx (first non-repeating)
            for (int j = 0; j < 26; j++) {
                if (freq[j][0] == 1 && freq[j][1] < min_idx) {
                    min_idx = freq[j][1];
                    res_ch = j; // Store its corresponding character
                }
            }
            
            if (res_ch == -1) {
                ans += '#';
            } else {
                ans += (char)(res_ch + 'a');
            }
        }
        
        return ans;
		}

};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string A;
		cin >> A;
		Solution obj;
		string ans = obj.FirstNonRepeating(A);
		cout << ans << "\n";
	}
	return 0;
}
// } Driver Code Ends