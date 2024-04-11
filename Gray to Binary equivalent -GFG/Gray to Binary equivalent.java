//video solution link - https://youtu.be/ARugnT9gK1c

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        int ans = 0;
        while(n>0){ 
            ans ^= n;
            n=n>>1;
        }
       return ans;
    }
    // n =4
// ans = 0^4  =4
// ans =4^2  =6
// ans = 6^1 =7
       
}


