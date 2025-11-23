Live video Solution = https://youtu.be/DfWM_Unp900
  time ;o(n^2)
  space; O(n)

class Solution {
    boolean vis[];
    public int removeStones(int[][] arr) {
        int n = arr.length;
         vis = new boolean[n];// to visit each stones present
        int ans=0;
        for(int i=0; i<n;i++){
            if(!vis[i]){
                dfs(i,arr);
                ans++;
            }
        }
        return n-ans;
    }
    void dfs(int st, int arr[][]){
        if(!vis[st]){
            vis[st]=true;
            for(int i=0; i<arr.length; i++){
                //row or col match , consider one comp
                if(arr[st][0] == arr[i][0] || arr[st][1]==arr[i][1])
                dfs(i, arr);
            }
        }
        return;
    }
}

