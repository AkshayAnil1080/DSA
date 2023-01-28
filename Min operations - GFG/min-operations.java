//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int a;
            a = Integer.parseInt(br.readLine());
            
            
            int b;
            b = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.solve(a, b);
            
            out.println(res);
            
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int a, int b) {
        // code here
        
        if(a==b) return 0;
        if((a&b)==Math.min(a,b))  // eg 12 , 2  -> i picked x as 2 and ele as a -> a=a&x=12&2=2
        return 1;
        
       if((a&b)>=0 && (a&b)<Math.min(a,b))
       return 2;
       
       return 0;
    }
}
        
