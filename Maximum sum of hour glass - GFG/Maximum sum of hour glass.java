// User function Template for Java

class Solution {
    int findMaxSum(int x, int y, int m[][]) {
        // code here
        if(x<=2 || y<=2 ) return -1;
        
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<x-2; i++){
            for(int j=0; j<y-2; j++){
                int sum = m[i][j] + m[i][j+1] + m[i][j+2]
                + m[i+1][j+1] + m[i+2][j] + m[i+2][j+1] + m[i+2][j+2];
                
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
};
