//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++


class Solution{
public:
    int knightInGeekland(int start_x,int start_y,vector<vector<int>> &arr){
        // Code here
     int r = arr.size();
        int c =arr[0].size();

        int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
        int dy[] = {1, 2, 2, 1, -1, -2, -2, -1};

       vector<vector<bool>> vis(r,vector<bool>(c));
        vector<int> al;
        queue<pair<int,int>> q;
        q.push({start_x, start_y});
        vis[start_x][start_y] = true;

        while(!q.empty()) {
            int size = q.size();
            int curr_lev_pts = 0;

            for(int i = 0; i < size; i++) {
                pair<int,int> curr = q.front();
                q.pop();
                int x = curr.first;
                int y = curr.second;
                curr_lev_pts += arr[x][y];

                //vis all its 8 moves;
                for(int j = 0 ;j < 8; j++) {
                    int n_x = x + dx[j]; 
                    int n_y = y + dy[j];
                    if(is_Safe(n_x, n_y, r, c) && !vis[n_x][n_y]) {
                        vis[n_x][n_y] = true;
                        q.push({n_x, n_y});
                    }
                }
            }

            al.push_back(curr_lev_pts);
        }

     

        int max = INT_MIN;
        int ans = -1;

        for(int i = al.size() - 1; i >= 0; i--) {
            if(al[i] + i < al.size()) {
                al[i] += al[i + al[i]];
            }
        }

        for(int i = 0; i < al.size(); i++) {
            if(al[i] > max) {
                max = al[i];
                ans = i;
            }
        }

        return ans;
    }

    bool is_Safe(int i, int j, int r, int c) {
        if(i < 0 || i >= r || j < 0 || j >= c) {
            return false;
        }
        return true;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n,m,start_x,start_y;
        cin>>n>>m>>start_x>>start_y;
        vector<vector<int>> arr(n,vector<int>(m));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                cin>>arr[i][j];
            }
        }
        Solution ob;
        cout<<ob.knightInGeekland(start_x,start_y,arr)<<endl;
    }
}
// } Driver Code Ends