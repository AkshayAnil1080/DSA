https://www.geeksforgeeks.org/problems/find-the-largest-rectangle-of-1s-with-swapping-of-columns-allowed0243/1

youtube video explanation by me - https://youtu.be/Acg_Nz9YEls



n*(n+m) , m
class Solution {
    public int maxArea(int[][] mat) {
        // code here
        int n =mat.length, m = mat[0].length;
        
        int ht [] = new int[m];
        int ans=0;
        
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==1)
                ht[j]++;
                else
                ht[j]=0;
            }
            //sort in descending 
            // counting sort
            // sort by freq
            int cnt[] = new int[n+1];
            for(int j=0; j<m; j++)
                cnt[ht[j]]++;
                
            // sort
            int width=0;
            for(int h=n; h>=0; h--){
                while(cnt[h]>0){
                    width++;
                    ans = Math.max(ans, h*width);
                    cnt[h]--;
                }
            }
           
        }
        
        return ans;
    }
}
