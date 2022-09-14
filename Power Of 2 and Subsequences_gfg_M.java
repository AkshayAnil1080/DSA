https://practice.geeksforgeeks.org/problems/power-of-2-and-subsequences0759/1

//1. count the integers which is power of 2, suppose x = with x integers subsequences formed will be
// 2^n. return it.
//2. to check power of 2-? n&n-1==0 hona chahiye - u know y
//User function Template for Java
class Solution{
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        int ans =0 ; // var to store count of integers which is power of 2 
        long mod=1000000007;
        for(long x : A)
        {
            if((x&(x-1))==0) 
            ans++;
        }
        return (long)(Math.pow(2,ans)%mod-1)%mod; // -1 because not considering empty set.
    }
}

TC: O(n)
SC:O(1)
