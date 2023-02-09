//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='b' ||ch=='l' ||ch=='o' ||ch=='n' )
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.put('l',map.get('l')/2);  map.put('o',map.get('o')/2);
        int ans= Integer.MAX_VALUE;
        
        for(char x: map.keySet())
        ans= Math.min(map.get(x), ans);
    
        return ans;
    }
}