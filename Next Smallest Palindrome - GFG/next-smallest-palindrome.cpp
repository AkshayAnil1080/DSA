//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:
	vector<int> generateNextPalindrome(int a[], int n) {
	    // code a
	    vector<int> ans;
	    int i,j, carry, solved=0;
	    for( i=(n)/2; i<n ;i++)
	    {
	        if(a[i] < a[n-i-1])
	        {
	            a[i] = a[n-i-1];
	            for(j=i+1; j<n ;j++)
	            {
	                a[j] = a[n-j-1];
	            }
	            
	            solved=1;
	            break;
	        }
	        else if(a[i] > a[n-i-1])
	        break;
	    }
	    if(solved==1)
	    {
    	    for(i=0; i<n; i++)
    	    {
    	        ans.push_back(a[i]);
    	    }
    	    
    	    return ans;
	    }
	    
	    // decremental case
	    else{
	    carry=1;
	    for(i=(n-1)/2; i>=0 ;i--)
	    {
	        if(a[i] + carry ==10)
	        {
	            a[i] =0; carry=1;
	        }
	        else
	        {
	            a[i]++; carry=0; break;
	        }
	    }
	    //
	    if(carry==1)
	    ans.push_back(1);
	    
	    for(i=0; i<n; i++)
	    ans.push_back(a[i]);
	    
	    if(carry==1) n++;
	    
	    for(i=(n+1)/2 ;i<n; i++)
	    ans[i] = ans[n-i-1];
	    
	    return ans;
	    }
	}
};
//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int num[n];
        for (int i = 0; i < n; i++) {
            cin >> num[i];
        }
        Solution ob;
        auto ans = ob.generateNextPalindrome(num, n);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends