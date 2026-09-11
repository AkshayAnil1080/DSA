Video Explanation - https://youtu.be/gISSre5QG4U

class Solution {
    int factorial(int n) {
        // code here
        return helper(n);
    }
    int helper( int n){
        if(n==0)
        return 1;
        
        return n*helper(n-1);
    }
}


class Solution {
    int factorial(int n) {
        // code here
        int ans=1;
        for(int i=2; i<=n ;i++){
            ans*=i;
        }
        return ans;
    }
}
