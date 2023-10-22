//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int M = Integer.parseInt(inputLine[0]);
		    int N = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(M, N));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        long ans = 1;
        long mod = 1000000007L; // Use 'L' to indicate a long literal
        for (long i = n; i <= (n + m - 2); i++) {
            ans = (ans * i) % mod;
            long invert = modInv(i - n + 1, mod);
            ans = (ans * invert) % mod;
        }
        return ans;
    }
    
    long pow(long x, int y, long mod) {
        long res = 1;
        while (y > 0) {
            if (y % 2 != 0)
                res = (res * x) % mod;

            y = y / 2;
            x = (x * x) % mod;
        }
        return res;
    }

   long modInv(long n, long mod) { 
        return pow(n, (int) (mod - 2), mod); 
    }

    
}