//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
  
  vector<vector<long long>> dp;
  
    long long minTime(int n, vector<int> &locations, vector<int> &types) {
        // code here
        
        int mx = types[0];
    for (int i = 1; i < n; i++) {
        mx = max(mx, types[i]);
    }
    
    vector<vector<int>> tmp(mx + 1, vector<int>(2));
    for (int i = 0; i < mx + 1; i++) {
        tmp[i][0] = INT_MAX;
        tmp[i][1] = INT_MIN;
    }
    
    for (int i = 0; i < n; i++) {
        int in = types[i];
        tmp[in][0] = min(tmp[in][0], locations[i]);
        tmp[in][1] = max(tmp[in][1], locations[i]);
    }
    
    vector<vector<int>> arr;
    for (int i = 0; i < mx + 1; i++) {
        if (tmp[i][0] != INT_MAX) {
            vector<int> A;
            A.push_back(tmp[i][0]);
            A.push_back(tmp[i][1]);
            arr.push_back(A);
        }
    }
    
    dp = vector<vector<long long>>(arr.size() + 1, vector<long long>(3, -1));
    
    return fun(0, arr, 2);

    }
    
    
long long fun(int i, vector<vector<int>>& arr, int pos) {
    if (i == arr.size()) {
        return dp[i][pos] = abs(arr[i - 1][pos]);
    }
    
    if (dp[i][pos] != -1) {
        return dp[i][pos];
    }
    
    int x = 0;
    if (pos == 0) {
        x = arr[i - 1][0];
    } else if (pos == 1) {
        x = arr[i - 1][1];
    }
          
    int minVal = arr[i][0], maxVal = arr[i][1];
    
    if (maxVal <= x) {
        return dp[i][pos] = x - minVal + fun(i + 1, arr, 0);
    } else if (minVal >= x) {
        return dp[i][pos] = maxVal - x + fun(i + 1, arr, 1);
    } else {
        long long option1 = 2 * (x - minVal) + (maxVal - x) + fun(i + 1, arr, 1);
        long long option2 = 2 * (maxVal - x) + (x - minVal) + fun(i + 1, arr, 0);
        return dp[i][pos] = min(option1, option2);
    }
}
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        
        int n;
        cin>>n;
        
        
        vector<int> locations(n);
        for(int i=0;i<n;i++){
            cin>>locations[i];
        }
        
        
        vector<int> types(n);
        for(int i=0;i<n;i++){
            cin>>types[i];
        }
        
        Solution obj;
        long long res = obj.minTime(n, locations, types);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends