//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

// TC: O(2n)
// Sc:o(n)
class Solution {
    public static String removePair(String s) {
        // code here
        
        Stack<Character> st =new Stack<>();
        st.push(s.charAt(0));
        
        for(int i =1; i<s.length(); i++)
        {
            Character ch = s.charAt(i);
             if(st.isEmpty() || st.peek() !=ch)
            st.push(ch);
            
            else if(st.peek()==ch)
            st.pop();
            
        }
        
        if(st.isEmpty())
        return "-1";
        
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}
        
