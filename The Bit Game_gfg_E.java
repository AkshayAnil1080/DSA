https://practice.geeksforgeeks.org/problems/the-bit-game2313/1

class Solution {
    public static int swapBitGame(long N) {
        // code here
    // count set bits - ret 1 if cnt is odd else ret 2
    int cnt=0;
    while(N!=0)
    {
        if((N&1)!=0) // bit is 1
        {
            cnt++;
            
        }
        N=N/2;
    }
    return cnt%2!=0 ? 1:2;
    }
    
}
// TC: logn SC: O(1)
