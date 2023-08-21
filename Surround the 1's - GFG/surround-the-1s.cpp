//{ Driver Code Starts

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
public:
    int Count(std::vector<std::vector<int>>& mat) {
        int dx[] = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        int n = mat.size(), m = mat[0].size();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    int cnt = 0;
                    for (int x = 0; x < 9; x++) {
                        int n_x = i + dx[x];
                        int n_y = j + dy[x];
                        if (n_x >= 0 && n_x < n && n_y >= 0 && n_y < m) {
                            if (mat[n_x][n_y] == 0)
                                cnt++;
                        }
                    }

                    if (cnt > 0 && cnt % 2 == 0)
                        ans++;
                }
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>> matrix(n, vector<int>(m,0));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				cin >> matrix[i][j];
			}
		}
		Solution ob;
		int ans = ob.Count(matrix);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends