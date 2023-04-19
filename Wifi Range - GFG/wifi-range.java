//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            String S = read.readLine().trim();
            Solution ob = new Solution();
            boolean ans = ob.wifiRange(N, S, X); 
            if(ans)
            System.out.println(1);
            else
            System.out.println(0);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
        boolean vis[] = new boolean[N];
        for(int i=0;i<N;i++)
        {
            if(S.charAt(i)=='1')
            {
               
             vis[i]=true; 
            
            for(int j=i+1;j<=i+X && j<N ;j++ )
            vis[j]=true;
            
            for(int j=i-1;j>=0 && j>=i-X ;j--)
            vis[j]=true;
            }
            
        }
        //  for(int i=0; i<N; i++)
        //  System.out.println(vis[i]);
        for(int i=0; i<N; i++)
        {
            if(vis[i]==false)
            return false;
        }
        return true;
    }
} 
 