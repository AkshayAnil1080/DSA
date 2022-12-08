//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}
// } Driver Code Ends


class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long numOfWays(int n, int m)
    {
        long mod = 1000000007;
        long total =( (m*n)%mod *(m*n-1)%mod)%mod;
        
        if(n>=1 && m>=2)
        {
            total -=  4*(n-1)*(m-2);
        }
        if(m>=1 && n>=2)
        {
            total -=  4*(m-1)*(n-2);
            
        }
        
        return total;
    }
}