//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int n){
        // code here
        //seive
        boolean prime[] = new boolean[n+1];
        for(int i =2; i<=n; i++)
        {
            prime[i] = true;
        }
        for(int p=2; p*p<=n ;p++)
        {
            if(prime[p]== true)
            {
                //mark its multiple false;
                for(int i =p*p ;i<=n; i=i+p)
                {
                    prime[i] = false;
                }
                
            }
        }
        
        for(int i =2; i<=n/2 ;i++)
        {
            if(prime[i] && prime[n-i]) //O(1)
            {
                return "Yes";
            }
        }
        return "No";
    }
   
}