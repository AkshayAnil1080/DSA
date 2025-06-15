Problem Link:
https://www.geeksforgeeks.org/problems/smallest-divisor/1
video solution link -  https://youtu.be/veQL9eFoBA8
m1
class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        //get nmax
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int x : arr){
            max=Math.max(x,max);
        }
        //iterater for poss ans
        for(int ans=1; ans<=max; ans++){
            int curr_sum_quo=0;
            for(int x: arr){
                curr_sum_quo += (x+ ans-1)/ans;
            }
            if(curr_sum_quo<=k){
               return ans;
            }
        }
        return 0;
    }
}

m2
class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        //get nmax
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int x : arr){
            max=Math.max(x,max);
        }
      int ans=0;
        int l=1, h=max;
        while(l<=h){
            int m = (l+h)/2;
            int curr_sum_quo=0;
            for(int x: arr){
                curr_sum_quo += (x+ m-1)/m;
            }
            if(curr_sum_quo>k)
                l=m+1;
                
            else{
                ans=m; h=m-1;
            }
            
        }
        return ans;
    }
}
