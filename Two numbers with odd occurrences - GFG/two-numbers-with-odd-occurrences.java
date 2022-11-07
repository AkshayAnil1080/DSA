//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int arr[], int n)
    {
        // code here
        int all=0;
        for(int i =0; i<n; i++)
        all = all^arr[i];
        
        
        //s2  rightmost set bit 
        int m = all & -all;
        
        // s3
        int g1=0; int g2=0;
        for(int i =0; i<arr.length; i++)
        {
            if((m&arr[i])==0)
            {
                g1 ^= arr[i];
            }
            else
            g2 ^= arr[i];
        }
        int ans[] = new int[2];
        if(g1>g2)
        {
            ans[0]=g1; ans[1] = g2;
        }
        else
         {ans[0]=g2; ans[1] = g1;}
         
         return ans;
    }
}