//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends


class Solution{
public:
    int nextHappy(int N){
      int next = N + 1;
    int res = next;
    // check for every number
    while (true)
    {
        if (isHappy(next) == 1)
            return next;
        next++;
        res = next;
    }
    }
    
    int isHappy(int N) {
    if (N == 1 || N == 7)
        return 1;
    int sum = N, curr = N;

    // make the sum of square of digits equals a single digit num
    while (sum > 9) 
    {
        sum = 0; // reset sum for every iteration

        // this loop finds the sum of square of digits
        while (curr > 0) {
            int d = curr % 10; // last digit
            sum += d * d;
            curr /= 10;
        }

        if (sum == 1)
            return 1;
        // else make the new number as the current number and proceed ahead.
        curr = sum;
    }
    if (sum == 7)
        return 1;
    return 0;
}
};


//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin>>N;
        Solution ob;
        cout << ob.nextHappy(N) << endl;
    }
    return 0; 
}
// } Driver Code Ends