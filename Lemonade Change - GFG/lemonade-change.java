//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int five=0; int ten=0;
        for(int i=0; i<N; i++)
        {
            int x = bills[i];
            if(x==5)
            five++;
            else if(x==10)
            {
                five--; ten++;
            }
            else
            {
                if(x==20) //will not use anytime for returning as change
                {
                    if(ten>0)
                    {
                        ten--; five--;
                    }
                    else
                    {
                        five-=3;
                    }
                }
            }
            if(five<0)
            return false;
        }
        return true;
    }
}

