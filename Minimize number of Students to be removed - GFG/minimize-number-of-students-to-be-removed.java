//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] H = new int[N];
            
            for(int i=0; i<N; i++)
                H[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            out.println(ob.removeStudents(H,N));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public int removeStudents(int[] H, int N) {
        
        int[] dp = new int[H.length];
        int len = 0;
        for (int num : H) {
                int idx = Arrays.binarySearch(dp, 0, len, num);
            if (idx < 0) {
                idx = -(idx + 1); // BS if ele not present retun -(desired pos + 1)
            }
            dp[idx] = num;
            if (idx == len) { // if ele inserted is at last  0> increasem the size of lis
                len++;
            }
        }
        
        return N-len;
    }
};