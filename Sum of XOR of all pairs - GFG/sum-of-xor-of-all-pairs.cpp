//{ Driver Code Starts
// An efficient C++ program to compute 
// sum of bitwise OR of all pairs
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution{
    public:
    // Returns sum of bitwise OR
    // of all pairs
    long long int sumXOR(int arr[], int n)
    {
    	 long long sum = 0;
        for (int i = 0; i < 32; i++) {
            long long oneCnt = 0, zeroCnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % 2 == 0)
                    zeroCnt++;
                else
                    oneCnt++;
                
                arr[j] /= 2;
            }
            sum += (zeroCnt * oneCnt) * (1 << i);
        }
        return sum;
    }
};

//{ Driver Code Starts.


int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	 int n ;
	 cin>>n;
	 int arr[n+1];
	 for( int i=0;i<n;i++)
	    cin>>arr[i];
	 Solution ob;
	 cout<<ob.sumXOR(arr, n)<<endl;
	}	
	return 0;
}

// } Driver Code Ends