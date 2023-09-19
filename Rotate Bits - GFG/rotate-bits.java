//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    ArrayList<Integer> rotate(int n, int d)
    {
         int left = 0, right = 0;
        int[] arr = new int[16];
        d = d % 16;
        
        for (int i = 0; i < 16; i++) {
            arr[i] = (n & 1) == 1 ? 1 : 0;
            n = n / 2;
        }
        
        int j = 0;
        int x = (16 - d) % 16;//left
        int y = d;//right
        
        while (j < 16) {
            if (arr[x] == 1) {
                left += 1 << j;
            }
            
            if (arr[y] == 1) {
                right += 1 << j;
            }
            
            x = (x + 1) % 16;
            y = (y + 1) % 16;
            j++;
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(left);
        res.add(right);
        
        return res;
    }
}
