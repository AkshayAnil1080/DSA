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
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
// TC:O(a*b + 2b)<10^8
// Sc:O(b)
class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int count=1;   
        String rep =A; // O(b)
        
        //s2
        while(rep.length() < B.length())  // A = 'c'  and b= 10ch
        {
            rep+=A;  // O(n) = O(B * a)
            count++;
        }
        if(rep.contains(B))  // O(b)
        {
            return count;
        }
        //2nd poss
        rep+=A;
        if(rep.contains(B)) return count+1; //o(b)
        
        //
        return -1;
    }
};