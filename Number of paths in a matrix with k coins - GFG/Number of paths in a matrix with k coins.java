// 2^(m+n)
class Solution {
    long ans;
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        ans=0;
        
        dfs(0,0,arr,k);
        return ans;
    }
    void dfs(int i, int j, int arr[][], int k)
    {
        int m = arr.length,  n = arr[0].length;
        if(k<0) return;
        if(i>=0 && i<m && j>=0 && j<n){
        
        if(i==m-1 && j==n-1 && k==arr[i][j])
        ans++;
        
     
        dfs(i+1, j,  arr, k-arr[i][j]);
        dfs(i,j+1, arr,  k-arr[i][j]);
        }
    }
}

// https://www.geeksforgeeks.org/problems/number-of-paths-in-a-matrix-with-k-coins2728/1
