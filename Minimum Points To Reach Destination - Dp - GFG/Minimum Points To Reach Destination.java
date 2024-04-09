//

class Solution {
    public int minPoints(int points[][], int n, int m) {
        // Your code goes here
      return dfs(0,0,points,n,m);
       
    }
    int dfs(int i, int j, int arr[][], int n, int m){
        if(i==n-1 && j==m-1)
        return arr[i][j]>0 ? 1 : Math.abs(arr[i][j])+1;
        
         int ans = Integer.MAX_VALUE;
        
        if(j+1<m){
         int x = - arr[i][j] + dfs(i,j+1,arr,n,m);
         ans = Math.min(ans, x);
        }
        if(i+1<n){
        int y = - arr[i][j] + dfs(i+1, j, arr, n,m);
         ans = Math.min(ans, y);
        }
        
        
        return ans<=0 ? 1 : ans;
    }
    //find min
     // int dfs(int i, int j, int arr[][], int n, int m){
     //    if(i==n-1 && j==m-1)
     //    return arr[i][j];
        
     //     int ans = Integer.MAX_VALUE;
        
     //    if(j+1<m){
     //     int x =  arr[i][j] + dfs(i,j+1,arr,n,m);
     //     ans = Math.min(ans, x);
     //    }
     //    if(i+1<n){
     //    int y =  arr[i][j] + dfs(i+1, j, arr, n,m);
     //     ans = Math.min(ans, y);
     //    }
        
        
     //    return ans;
    }
}//memo
class Solution {
    public int minPoints(int points[][], int n, int m) {
        // Your code goes here
        int[][] memo = new int[n][m];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
          return dfs(0,0,points,n,m, memo);
    }
    int dfs(int i, int j, int arr[][], int n, int m, int[][] memo){
        if(i==n-1 && j==m-1)
        return arr[i][j] > 0 ? 1 : Math.abs(arr[i][j])+1;
        
          if (memo[i][j] != Integer.MIN_VALUE)
            return memo[i][j];

        int ans = Integer.MAX_VALUE;
        //2 calls
        //right , i , j+1
        if(j+1<m){
        int x = - arr[i][j] + dfs(i, j+1, arr, n,m, memo);
        ans = Math.min(ans,x);
        }
        
        //down i+1, j
        if(i+1 < n){
        int y =  - arr[i][j] + dfs(i+1, j, arr, n,m, memo);
         ans = Math.min(ans,y);
        }
         memo[i][j] = ans <= 0 ? 1 : ans;
      return memo[i][j];
    }
}
