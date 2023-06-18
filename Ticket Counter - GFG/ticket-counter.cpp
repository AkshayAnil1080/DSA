//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// class Solution {
//   public:
//     int distributeTicket(int N, int K) {
//         // code here
//         deque<int> ad;
//     for (int i = 1; i <= N; i++) {
//         ad.push_back(i);
//     }
//     int flag = 0;
//     int curr = 0;
//     while (!ad.empty()) {
//         int time = 0;
//         if (flag == 0) {
//             while (!ad.empty() && time < K) {
//                 curr = ad.front();
//                 ad.pop_front();
//                 time++;
//             }
//         } else {
//             while (!ad.empty() && time < K) {
//                 curr = ad.back();
//                 ad.pop_back();
//                 time++;
//             }
//         }
//         flag =!flag;
//     }
//     return curr;
//     }
// };


class Solution {
  public:
    int distributeTicket(int N, int K) {
        // code here
    int st=1; int end=N;
        while(st<end)
        {
            int time=K;
            while(st<end && time-- >0) st++;
            time=K;
            while(st<end && time-- >0) end--;
            
        }
        return st;
        
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int N;
        scanf("%d",&N);
        
        
        int K;
        scanf("%d",&K);
        
        Solution obj;
        int res = obj.distributeTicket(N, K);
        
        cout<<res<<endl;
        
    }
}

// } Driver Code Ends