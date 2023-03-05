//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
        // code here
        
        
         int set[]=new int[32];

        
          for (int i = 31; i >= 0; i--) 
          {
            if ( (n &(1<<(31-i)))!=0) {
                
                set[i] = 1;
            }
              
          }
          int ans = 0;
        for (int i = 0; i<=29 ; i++) // traversing from left to right - most sig to least sig
        {
            if (set[i] == 1)
            {
                ans += (1 << (31-i));
                if (set[i + 1] == 1) 
                {
                    set[i + 2] = 0;
                }
            }
        }
        if(set[30] == 1) ans += 2;
        if(set[31]==1) ans +=1;
        
        return ans;
    }
}
        
