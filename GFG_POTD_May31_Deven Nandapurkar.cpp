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
