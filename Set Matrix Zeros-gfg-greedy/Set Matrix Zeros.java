Video link - https://youtu.be/DFjQqm4P7BM
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        //mark the first row and column wiht 0
        int c0flag=mat[0][0]; // first ele
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;//ith row
                    
                    if(j==0)
                        c0flag = 0;
                    else
                    mat[0][j]=0; //ith col
                    
                }
            }
        }
        // travers in mat from 1,1
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j]=0;
                
                }
            }
        }
        //check for 1st row
        if(mat[0][0]==0){
            for(int i=0; i<m; i++)
                mat[0][i]=0;
        }
        //check for 1 col
        if(c0flag==0){
            for(int i=0; i<n; i++)
                mat[i][0]=0;
        }
    }
    
}
