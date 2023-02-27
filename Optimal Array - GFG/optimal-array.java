//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n=Integer.parseInt(in.readLine());
            String s[]=in.readLine().trim().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long arr[]=ob.optimalArray(n,a);
            for(long i:arr){
                out.print(i+" ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


class Solution {
    public long[] optimalArray(int n,int a[])
    {
        long ans[] = new long[n];
       
        int idx =0;
        int  s1=0; int s2=0;
        for(int i=0; i<(n+1)/2 ;i++)
        {
            s1+=a[i];
            
            if(2*i < n)
            {
                s2+= a[2*i];
                int curr_ans = ((i+1)*a[i] - s1)  + (s2-s1) -i*a[i];
                ans[idx++] =curr_ans;
            }
            
            if(2*i+1<n)
            {
                s2+= a[2*i+1];
                int curr_ans = ((i+1)*a[i] - s1)  + (s2-s1) -(i+1)*a[i];
                ans[idx++] =curr_ans;
            }
        }
        return ans;
    }
}
        
