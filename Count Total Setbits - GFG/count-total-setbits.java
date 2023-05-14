//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long N;
            N = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.countBits(N);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static long countBits(long n) {
        // code here
      if(n==0)
        return 0;
        
        long x = larPowOf2(n);
        long y = x * (1 << (x - 1));
        long z = n - (1 << x);
        return y + z + 1 + countBits(z);
    }
    
    static long larPowOf2(long n) {
        long x = 0;
        while((1 << x) <= n)
            x++;
        
        return x - 1;
    }
    
}
        
