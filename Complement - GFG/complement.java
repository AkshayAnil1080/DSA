//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String str = br.readLine().trim();

            Vector<Integer> ans = new Solve().findRange(str, n);
            if (ans.size() == 1) {
                System.out.println(ans.get(0));
            } else {
                System.out.println(ans.get(0) + " " + ans.get(1));
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) {
        // code here
        //s1 to check on one in str
         Vector<Integer> ans = new Vector<>();
        int isAllOne =1;
        for(int i =0; i<n; i++)
        {
            if(str.charAt(i)=='0')
            {
                isAllOne=0;
                break;
            }
        }
        if(isAllOne ==1)
        {
            ans.add(-1);
            return ans;
        }
        
        //s2 eg 1001 => -1 1 1 -1 => we find the max sub array with the indices of the kadanes
        int max_so_far =Integer.MIN_VALUE; int start =0; int end=0;
        int s=0; int sum=0;
        for(int i=0; i<n; i++)
        {
            
            // 
            
            sum +=  str.charAt(i) == '1' ? -1 : 1 ;
            
            if(max_so_far < sum)
            {
                max_so_far= sum;
                start = s;
                end =i;
            }
            
            if(sum<0)
            {
                sum=0;
                s=i+1;
            }
        }
        
        ans.add(start+1);
        ans.add(end+1);
        return ans;
    }
}