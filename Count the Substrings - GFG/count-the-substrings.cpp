//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution
{
    public:
    int countSubstring(string S)
    {
        // code here
        int cnt=0;int ans=0;
        for(int i=0; i<S.length(); i++)
        {
            cnt=0;
            for(int j=i ; j<S.length(); j++)
            {
                if(S[j]>='a' && S[j]<='z')
                cnt++;
                
                else cnt--;
                
                if(cnt==0)
                ans++;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{

    int t;
    cin>>t;
    while(t--)
    {
        string S;
        cin>>S;
        Solution obj;
        cout<<obj.countSubstring(S)<<endl;
    }
}  
// } Driver Code Ends