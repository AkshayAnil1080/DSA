//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends



class Solution {
  public:
    bool lemonadeChange(int N, vector<int> &bills) {
        // code here
        int five=0; int ten=0;
        for(int i=0; i<N; i++)
        {
            int x = bills[i];
            if(x==5)
            five++;
            else if(x==10)
            {
                five--; ten++;
            }
            else
            {
                if(x==20) //will not use anytime for returning as change
                {
                    if(ten>0)
                    {
                        ten--; five--;
                    }
                    else
                    {
                        five-=3;
                    }
                }
            }
            if(five<0)
            return false;
        }
        return true;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;

        vector<int> bills(N);
        for (int i = 0; i < N; i++) cin >> bills[i];

        Solution obj;
        int ans = obj.lemonadeChange(N, bills);
        if (ans)
            cout << "True" << endl;
        else
            cout << "False" << endl;
    }
    return 0;
}
// } Driver Code Ends