//{ Driver Code Starts
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
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int k) {
        // code here
        //s1
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            //check lowest be  weighted pos
            while(!st.isEmpty() && k>0 && st.peek()>ch)
            {
                st.pop(); k--;
            }
             
            st.push(ch);
        }
        //s2.  k still remains
        while(!st.isEmpty() && k>0)
        {
            st.pop(); k--;
        }
        
        // s3
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        
        //handling leading zeros
        int n = sb.length();
        for(int i =n-1; i>=0; i--)
        {
            if(sb.charAt(i)!='0') // sb ="001" => 100
            break;
            
            if(sb.charAt(i)=='0')  // sb =="00"
            sb.deleteCharAt(i);
        }
        return sb.length()==0 ? "0" : sb.reverse().toString();
    }
}