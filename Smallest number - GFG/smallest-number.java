//{ Driver Code Starts
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
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.smallestNumber(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
// gfg potd day 146
class Solution{
    static String smallestNumber(int S, int D){
        // code here
         if(S>=D*9) return "-1";
        
        S=S-1;
        char ans[] =new char[D];
        for(int i=D-1; i>0; i--)
        {
            if(S>9)
            {
                ans[i]  = (char)(9+'0');
                S-=9;
            }
            else
            {
                ans[i] = (char)(S+'0');
                S=0;
            }
        }
        ans[0]=(char)(S+1+'0'); return String.valueOf(ans);
    }
}