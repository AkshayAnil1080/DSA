//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
    public:
    void update(int a[], int n, int update[], int k)
    {
          //   N*K
        //  for(int i=0; i<k; i++)
        //  {
        //      for(int j= update[i]-1 ;j<n ;j++)
        //      a[j]++;
        //  }
         
         // O(k+N)
        for(int i=0; i<k; i++)
        a[update[i]-1]++;
        
          for(int i=1; i<n; i++)
            a[i]+=a[i-1];
    }
};

//{ Driver Code Starts.
int main()
{
	int t; cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
		int a[n]={0}, updates[k]={0};
		for(int i = 0; i < k; i++)
		cin>>updates[i];
		Solution ob;
		ob.update(a, n, updates, k);
		
		for(int i = 0; i < n; i++)
		cout<<a[i]<<" ";
		
		cout<<endl;
	}
	
	return 0;
}
// } Driver Code Ends