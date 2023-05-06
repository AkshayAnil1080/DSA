//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String s) {
        // code here
        
        StringBuilder ans = new StringBuilder() ;
        ans.append(s.charAt(0));
        for(int i=1; i < s.length(); i++)
        {
            //curr ch if higher, break,we need smallest. 
            if(s.charAt(i-1) > s.charAt(i) || (i>1 && s.charAt(i)==s.charAt(i-1))) 
            ans.append(s.charAt(i));
            
            else break;
        }
        String curr = ans.toString();
        
        return curr+ ans.reverse().toString();
        
    }
}


