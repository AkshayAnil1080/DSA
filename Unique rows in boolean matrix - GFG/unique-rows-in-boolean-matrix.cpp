//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
#define MAX 1000

vector<vector<int>> uniqueRow(int M[MAX][MAX],int row,int col);


// } Driver Code Ends



class Solution
{
    public:
    // #define MAX 1000
    vector<vector<int>> uniqueRow(int arr[MAX][MAX],int n,int m)
    {
        //Your code herm
    vector<vector<int>> ans;
   
    set<vector<int>> st;

    for (int i = 0; i < n; i++) {
        vector<int> curr;
        for (int j = 0; j < m; j++) {
            curr.push_back(arr[i][j]);
        }
        if (st.find(curr) == st.end()) {
            st.insert(curr);
            ans.push_back(curr);
        }
    }

    return ans;
    }
};
//{ Driver Code Starts.

int main()
{
    int T;
    cin>>T;
    while(T--)
    {
    	int n,m;
    	cin>>n>>m;
    	int a[MAX][MAX];
    	for(int i=0;i<n;i++)
    	for(int j=0;j<m;j++)
    	cin>>a[i][j];
    	Solution ob;
    	vector<vector<int>> vec = ob.uniqueRow(a,n,m);
    	for(int i = 0;i<vec.size();i++){
    	    for(int x : vec[i]){
    	        cout<<x<<" ";
    	    }
    	    cout<<"$";
    	}
    	cout<<endl;
    }
}

// } Driver Code Ends