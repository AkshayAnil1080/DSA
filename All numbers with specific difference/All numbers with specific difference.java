prob : https://www.geeksforgeeks.org/problems/all-numbers-with-specific-difference3558/1
  Soltuion video : https://youtu.be/3gqBFtnWiao

  nlogn, 1

class Solution {
    public int getCount(int n, int d) {
        // code here
      int curr_ans=0;
      int l=1, h=n;
      while(l<=h){
          int m = (h-l)/2 + l;
          if(isConditionMet(m,d)){
              //track curr num and move in lower range
              curr_ans = m;
              h=m-1;
          }
          else 
          l=m+1;
      }
     
      return curr_ans==0 ?  0: n-curr_ans+1;
    }
    boolean isConditionMet(int x, int d){
        int temp =x;
        int curr_sum=0;
        while(x>0){
            curr_sum += x%10;
            x/=10;
        }
        return  temp - curr_sum >=d;
    }
};
