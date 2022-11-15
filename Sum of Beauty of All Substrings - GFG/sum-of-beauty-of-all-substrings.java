//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int ans=0;
        int n = s.length();
        for(int i =0; i<n; i++)
        {
            int freq[] = new int[26];
            for(int j=i; j<n; j++)
            {
                freq[s.charAt(j)-'a']++;
                
                int min = getMin(freq);
                int max = getMax(freq);
                
                int beauty = max-min;
                
                ans+=beauty;
            }
        }
        return ans;
    }
    static int getMax(int freq[])
    {
        int max =Integer.MIN_VALUE;
        for(int i =0; i<26; i++)
        {
            if(freq[i]!=0)
            max = Math.max(max,freq[i]);
        }
        return max;
    }
     static int getMin(int freq[])
    {
        int min =Integer.MAX_VALUE;
        for(int i =0; i<26; i++)
        {
            if(freq[i]!=0)
            min = Math.min(min,freq[i]);
        }
        return min;
    }
}
        
