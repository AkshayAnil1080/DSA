//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String addBinary(String A, String B) {
        // code here
        
       int  i = A.length() -1;
        int  j = B.length() -1;
         StringBuilder res = new StringBuilder();
         int carry=0;
         
         while(i>=0 || j>=0)
         {
             int sum = ((i>=0) ? A.charAt(i)-'0' : 0) + ((j>=0) ? B.charAt(j)-'0' : 0) + carry;
              carry=  sum/2;
              res.append(sum%2);
              
              i--; j--;
          }
          if(carry!=0)
          {
              res.append(carry);
          }
          
          
          // note
          int idx =0;
          for(idx = res.length()-1; idx>=0; idx--)
          {
              if(res.charAt(idx)!=  '0' ) 
              break;
          }
          res.delete(idx+1, res.length()); // del leading zeros;
          
          return res.reverse().toString();
          
    }
}