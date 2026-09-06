Sum of Pairwise ANDs
  Explanation of all approaches by me on Utube - https://youtu.be/oGLUvLWGpm8
try before watching the vide  hhttps://www.geeksforgeeks.org/problems/sum-of-products5049/1



optimsed - bit masking
  // n,1

// User function Template for Java

class Solution {
    public long pairAndSum(int[] arr) {

       long ans=0;
       int n = arr.length;
           for(int i=0; i<32; i++){
               long k=0; //setCount
               for(int j=0; j<n; j++){
                   //check ith bit set or not

                   if ((arr[j] & (1<<i)) !=0) k++;
               }
               // weightage of ith bit * all poss pairs
               ans += (1<<i)* ((k)*(k-1))/2;
           }
           return ans;
        
    }
}


brute force
  n^2,1
  
  class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        long ans=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
          for(int j=i+1; j<n ; j++){
              ans +=  (arr[i]&arr[j]);
          }
      }
      return ans;
    }
}


