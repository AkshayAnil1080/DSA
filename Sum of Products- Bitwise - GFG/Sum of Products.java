
class Solution {
    static long pairAndSum(int n, long arr[]) {
        // code here
        long ans=0;
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

class Solution {
    static long pairAndSum(int n, long arr[]) {
          long ans=0;
      for(int i=0; i<n; i++){
          for(int j=i+1; j<n ; j++){
              ans +=  (arr[i]&arr[j]);
          }
      }
      return ans;
    }
}
