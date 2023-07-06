//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 


// } Driver Code Ends
class Solution{
    public:
        //Function to merge the arrays.
        void merge(long long arr1[], long long arr2[], int n, int m) 
        { 
           int l = n + m;
        int gap = (l / 2) + (l % 2);

        while (gap > 0)
        {
            int st = 0;
            int end = st + gap;
    
            while (end < l)
            {
                // st in arr1 and end in arr2
                if (st < n && end >= n)
                {
                    if(arr1[st]> arr2[end - n])
                    swap(arr1[st], arr2[end - n]);
                }
                // st in arr2 and end in arr2
                else if (st >= n)
                {
                    if(arr2[st-n] > arr2[end-n])
                    swap(arr2[st - n], arr2[end - n]);
                }
                // st in arr1 and end in arr1
                else
                {
                    if(arr1[st] >  arr1[end])
                    swap(arr1[st], arr1[end]);
                }
    
                st++;
                end++;
            }
    
            if (gap == 1)
            {
                break;
            }
    
            gap = (gap / 2) + (gap % 2);
            } 
        } 
};

//{ Driver Code Starts.

int main() 
{ 
	
	int T;
	cin >> T;
	
	while(T--){
	    int n, m;
	    cin >> n >> m;
	    
	    long long arr1[n], arr2[m];
	    
	    for(int i = 0;i<n;i++){
	        cin >> arr1[i];
	    }
	    
	    for(int i = 0;i<m;i++){
	        cin >> arr2[i];
	    }
	    Solution ob;
	    ob.merge(arr1, arr2, n, m); 

        for (int i = 0; i < n; i++) 
            cout<<arr1[i]<<" "; 
        
       
	    for (int i = 0; i < m; i++) 
		    cout<<arr2[i]<<" "; 
	    
	    cout<<endl;
	}

	return 0; 
} 

// } Driver Code Ends