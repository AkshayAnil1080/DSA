//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
          int n = S.length();
         char s[]=S.toCharArray();
          StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for(int i=n-1; i>=0; i--)
        {
             if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/')
            {
                while (!st.isEmpty ())
                {
                    res.append(st.pop());
                }
                res.append(s[i]);
            }
            else
                st.push(s[i]);
        }
    while (!st.isEmpty ())
        {
            res.append(st.pop());
        }
        
        return res.toString();
    }
}