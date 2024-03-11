class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
       
       int r1=0, c1=0; //top left in m1
       int r2=n-1, c2=n-1; // bottom right in m2
       int cnt=0;
       while(r1<n && r2>=0){
           int sum = mat1[r1][c1] + mat2[r2][c2];
           
           if(sum==x){
           cnt++;
           c1++; c2--;
           }
           if(sum<x){
               c1++; //make sum bigger
           }
           if(sum>x)
           c2--;
           
           if(c1==n){
               c1=0; r1++;
           }
           
           if(c2==-1){
               c2=n-1; r2--;
           }
           
       }
       return cnt;
    }
}
