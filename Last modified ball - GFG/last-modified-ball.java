//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 
    
class GFG {
    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt(), A[] = new int[N];
    
            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    
            Solution ob = new Solution();
            out.println(ob.solve(N, A));
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java
// TC:O(n)

class Solution {
    int solve(int n, int[] A) {
        // code here
        int ans=0;
        for(int i =n-1; i>=0; i--)
        {
            if(A[i]!=9)
            {
                ans=i+1;
                break;
            }
            
        }
        return ans;
            
    }
};