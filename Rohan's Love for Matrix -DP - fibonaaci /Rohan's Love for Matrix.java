class Solution {
    static int m = 1000000007;
    static int firstElement(int n) {
        // code here
     return (int)fib(n);
    }
    static long fib(long n)
    {
        long F[][] = new long[][]{{1,1},{1,0}};
         if (n == 0)
            return 0;
        power(F, n-1);
      
        return F[0][0];
    }
    
    static void multiply(long F[][], long M[][])
    {
        long x = ( (F[0][0]%m *M[0][0]%m)%m + (F[0][1]%m * M[1][0]%m)%m )%m;
        long y = ( (F[0][0]%m *M[0][1]%m)%m + (F[0][1]%m * M[1][1]%m)%m )%m;
        long z = ( (F[1][0]%m *M[0][0]%m)%m + (F[1][1]%m * M[1][0]%m)%m )%m;
        long w = ( (F[1][0]%m *M[0][1]%m)%m + (F[1][1]%m * M[1][1]%m)%m )%m;
         
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    
    static void power(long F[][], long n)
    {
    if( n == 0 || n == 1)
      return;
    long M[][] = new long[][]{{1,1},{1,0}};
      
    power(F, n/2);
    multiply(F, F);
      
    if (n%2 != 0)
       multiply(F, M);
    }
      
}
