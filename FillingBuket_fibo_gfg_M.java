
// https://practice.geeksforgeeks.org/problems/filling-bucket0529/1
//User function Template for Java
// TC: O(n)  , SC:O(1)
class Solution {
    static int fillingBucket(int N) {
        // code here
        if(N==1) return 1;
        long a=1;
        long b=1;
        long c=0;
        
        long mod=100000000;
        for( int i=2;i<=N ;i++)
        {
            
            c = ((a%mod) +(b%mod))%mod;
            a=b%mod;
            b=c%mod;
        }
        return (int)(c%mod);
    }  
};

//  return fun(N);
//     }
//     static int  fun(int N)
//     {
//         if(N==0) return 1;
//         if(N<0) return 0;
        
//         return fun(N-1)+fun(N-2);
//     }
