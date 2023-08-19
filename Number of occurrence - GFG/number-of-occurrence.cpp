//{ Driver Code Starts
#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
// class Solution{
// public:	
// 	/* if x is present in arr[] then returns the count
// 		of occurrences of x, otherwise returns 0. */
// 	int h_idx(int arr[], int n, int x) {
//         int idx = -1;
//         int low = 0;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] > x)
//                 high = mid - 1;
//             else if (arr[mid] == x) {
//                 idx = mid;
//                 low = mid + 1;
                
//             } else
//                 low = mid + 1;
//         }
//         return idx;
//     }
    
//     int l_idx(int arr[], int n, int x) {
//         int idx = -1;
//         int low = 0;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] > x)
//                 high = mid - 1;
//             else if (arr[mid] == x) {
//                 idx = mid;
//                 high = mid - 1;
//             } else
//                 low = mid + 1;
//         }   return idx;
//     }
// 	int count(int arr[], int n, int x) {
// 	  int first = l_idx(arr, n, x);
//         int last = h_idx(arr, n, x);
        
//         if (last == -1)
//             return 0;
        
//         return last - first + 1;
// 	}
// };

class Solution{
public:	
	/* if x is present in arr[] then returns the count
		of occurrences of x, otherwise returns 0. */
	int count(int arr[], int n, int x) {
	    // code here
	     int *low = lower_bound(arr, arr + n, x);
	    if (*low != x)
	        return 0;
	    int *high = upper_bound(low, arr + n, x);
	    return high - low;
	}
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.count(arr, n, x);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends