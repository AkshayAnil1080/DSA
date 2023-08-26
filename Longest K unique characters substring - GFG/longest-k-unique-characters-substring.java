//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character, Integer> m = new HashMap<>();
        int uniq_ch = 0, i = 0, j = 0, ans = 0, n = s.length();

        while (j < n) {
          
            //slide till uniq_ch <=k
            while (j < n) {
                char ch = s.charAt(j);
                if (!m.containsKey(ch) || m.get(ch) == 0) uniq_ch++;
                m.put(ch, m.getOrDefault(ch, 0) + 1);
             
                if (uniq_ch > k) break;
                j++;
            }

          //store the poss ans
            if (uniq_ch >= k) ans = Math.max(ans, j - i);
            
            //reached end of string
            if (j == n) break;
        

           //start removing from front to make uniq_ch==k
            while (i < n) {
                char ch = s.charAt(i);
                if (m.get(ch) == 1) uniq_ch--;
                m.put(ch, m.get(ch) - 1);

                if (uniq_ch == k) break;
                i++;
            }
            i++;
            j++;
        }
        if (ans == 0) return -1;
        return ans;
    }
}