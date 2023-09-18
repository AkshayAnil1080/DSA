//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++


// class Solution{
//     public:
//     // Function to check if given number n is a power of two.
//     bool isPowerofTwo(long long n){
        
//         if(n==0) return false;
//          while(n > 1)
//         {
//             if(n%2!=0)
//             return false;
            
//             n = n /2;   // n>>1;
//         }
//         return true;
        
//     }
// };

// class Solution{
//     public:
//     // Function to check if given number n is a power of two.
//     bool isPowerofTwo(long long n){
        
//          long count  = 0;
//         while(n > 0)
//         {
//             count +=  (n & 1);
//             n = n /2;   // n>>1;
//         }
        
//       if(count == 1)
//       return true;
//       else
//       return false;    
        
//     }
// };

class Solution{
    public:
    // Function to check if given number n is a power of two.
    bool isPowerofTwo(long long n){
        
     if(n>0 && (n&(n-1))==0)
        return true;
        
        return false;
        
    }
};




//{ Driver Code Starts.

// Driver code
int main()
{

    int t;
    cin>>t;//testcases

    for(int i=0;i<t;i++)
    {
        long long n; //input a number n
        cin>>n;

        Solution ob;
         if(ob.isPowerofTwo(n))//Now, if log2 produces an integer not decimal then we are sure raising 2 to this value
             cout<<"YES"<<endl;
         else
            cout<<"NO"<<endl;

    }

    return 0;
}

// } Driver Code Ends