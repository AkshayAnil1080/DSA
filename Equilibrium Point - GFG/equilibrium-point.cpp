//{ Driver Code Starts
#include <iostream>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    // Function to find equilibrium point in the array.
    // a: input array
    // n: size of array
    int equilibriumPoint(long long arr[], int n) {
    
        if(n==1)
        return 1;
        
        long long sum = 0 ;
        for( int i = 0 ; i<n ;i++)
        {
            sum+=arr[i];
        }
        
        long long lsum=0;
        for( int i = 0; i<n ;i++)
     {
         if(lsum == sum-arr[i])
         return i+1;
         
         lsum +=arr[i];
         sum -= arr[i];
     }
     return -1;
    }

};

//{ Driver Code Starts.


int main() {

    long long t;
    
    //taking testcases
    cin >> t;

    while (t--) {
        long long n;
        
        //taking input n
        cin >> n;
        long long a[n];

        //adding elements to the array
        for (long long i = 0; i < n; i++) {
            cin >> a[i];
        }
        
        Solution ob;

        //calling equilibriumPoint() function
        cout << ob.equilibriumPoint(a, n) << endl;
    }
    return 0;
}

// } Driver Code Ends