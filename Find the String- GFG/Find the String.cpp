class Solution
{
public:
    void dfs(string &curr, string & ans, unordered_map<string,int> &mp, int k)
    {
        string temp; int i;
        for(int i=k-1; i>=0; i--)
        {
          temp=curr. substr (1); 
          temp+=char(i+48);
        if(mp.find(temp)==mp.end()){
            mp[temp]=1;
            ans+=char(i+48);
            dfs (temp, ans, mp, k); 
            return;
            }
        }   
    }
    string findString(int n, int k) {
    
    string ans="" , temp="";
    unordered_map<string, int> mp;
    for(int i=0; i<n; i++)
    {
    ans+='0';
    }
    temp=ans; mp[temp]=1;
    dfs (temp, ans, mp, k);
    return ans;
    }
    
};
