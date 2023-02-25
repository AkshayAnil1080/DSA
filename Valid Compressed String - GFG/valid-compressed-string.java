//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        
        int n=0; // numeric part
        int j=0; // index to be compared with oS.
        for(int i=0; i<T.length(); i++)
         {
            char ch = T.charAt(i);
            
            if(ch>='0' && ch<='9')
           {
              n =n*10 + ch -'0'; // handling the number  > 1 digit
              j--;
           }
           else // letter part
           {
               j=j+n;
               if(ch !=  S.charAt(j)) return 0;
               
               n=0;
           }
           j++;
        }
        //IF(J NOT equlas length of originla string)
        j=j+n;
        if(j!=S.length()) return 0;
        
        return 1;
    }
}