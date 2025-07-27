Video Link - https://youtu.be/yJsIm7lIki8

class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n = mat.length;
        int maxSum=Integer.MIN_VALUE;
        // get max sum from indivual row and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j]; 
                colSum += mat[j][i];
            }
            maxSum = Math.max(maxSum, Math.max(rowSum, colSum));
        }
        //make each row equal to maxSum and all total sum of rows  equal n*maxSum
        int ans=0;
        for(int i=0; i<n; i++){
            int rowSum = 0;
            for(int j=0; j<n;j++){
                rowSum+= mat[i][j];
            }
            ans+= maxSum-rowSum;
        }
        return ans;

    }
}
