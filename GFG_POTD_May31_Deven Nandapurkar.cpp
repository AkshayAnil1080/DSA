// GFG POTD 
// may 31
// easy. 

// Problem:- Frequency Game
// Given an array A of size N. The elements of the array consist of positive integers. You have to find the largest element with minimum frequency.

// this problem was previously asked in Google. 

class Solution{
public:
    int LargButMinFreq(int arr[], int n) {
        // code here
        
        unordered_map<int,int> mp;
        int f=INT_MAX;
        int ans=INT_MIN;
        for(int i=0;i<n;i++) 
            mp[arr[i]]++;
        
        for(auto it:mp)
            f=min(f,it.second);
            
        for(auto it:mp){
            if(it.second == f){
                ans=max(ans, it.first);
            }
        }
        
        return ans;
        
    }
};

// time complexity :- O(N)
// space complexity:- O(1)
