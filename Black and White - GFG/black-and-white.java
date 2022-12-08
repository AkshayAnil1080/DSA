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
        // add your code here
        int dx[]= {2, 2, 1, 1, -1, -1, -2, -2 };
        int dy[]= {-1, -1, -2, 2, -2, 2, -1, 1};
        
        // 
        long mod = 1000000007;
        long total  = ((m*n)%mod * (m*n-1)%mod )%mod;
        long attack =0;
        
        //s3
        for(int i =0; i<n; i++)
        {
            for(int j =0; j<m; j++)
            {
                // traverese for 8 moves
                for(int k=0; k<8; k++)
                {
                    int x = i+dx[k];
                    int y = j+dy[k];
                    
                    //this is in bound -> attack
                    if(x>=0 && x<n && y>=0 && y<m)
                    attack ++;
                }
            }
        }
        return (total%mod - attack%mod)%mod;
    }
}