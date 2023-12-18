class Solution {
    static int gameOfXor(int n , int[] A) {
        // code here
        if(n%2==0)
        return 0;
        int ans=0;
        for(int i=0 ;i<n ;i++){
            if(i%2==0)
            ans^=A[i];
        }
        return ans;
    }
};
