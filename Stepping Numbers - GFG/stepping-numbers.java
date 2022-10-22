//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java
//TC:  O(n-m)*log(n-m) = > 10^7 * log10^7 > 10^8 - gives TLE

class Solution{
    int count=0;
    int steppingNumbers(int n, int m){
        // code here
        
        for(int i=0; i<=9; i++)
        {
            bfs(n,m,i);
        }
        return count;
    }
    
    void bfs(int n, int m, int start_pt)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(start_pt);
        
        while(!q.isEmpty())
        {
            // x is curr_stepNum - freshly pulled out from Queue
            int x = q.poll();
            // System.out.println(x+"ispolled");
            
            if(x >=n && x<=m)
            {
                count++;
                // System.out.println(x+" " + start_pt);
            }
            
            if(x ==0  || x>m )
            {
                continue;
            }
            
            int lastDig =  x%10;
            // process the neighbors from x;
            int a = x*10 + (lastDig-1);
            int b = x*10 + (lastDig+1);
            
            if(lastDig==0)
            q.add(b);  // for 10 we cannot add 99 but we can add 101
            
            else if(lastDig==9)
            q.add(a); // for 9 we cannot add 100 but we can add 98
            
            else
            {
                q.add(a); q.add(b);
            }
            
        }
    }
}
