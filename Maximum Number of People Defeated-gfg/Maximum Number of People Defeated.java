https://youtu.be/EKmdr5883aA

class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int l =1, h=1000;
        int ans=0;
        while(l<=h){
            int m =  l+(h-l)/2;
            
            if(helper(m) <=p){
                ans = m; 
                l = m+1;
            }
            else
            h=m-1;
        }
        return ans;
    }
    int helper(int n){
        return n*(n+1)*(2*n+1)/6;
    }
};
