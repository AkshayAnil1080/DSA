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
        
        if(n<=3) return "No";
        
        if(n%2!=0)  // eg 17
        {
            for(int i=2; i*i<=(n-2); i++)
            {
                if((n-2)%i==0) //is not prime
                return "No";
            }
            return "Yes";
        
        }
        
        if(n%2==0) return "Yes";
        
        return "kuch v";
    }
    
   
}