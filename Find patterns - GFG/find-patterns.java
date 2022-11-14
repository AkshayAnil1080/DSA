//{ Driver Code Starts
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
            String S = read.readLine();
            String W = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(S,W));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int numberOfSubsequences(String S, String W){
        // code here
        
        int n= S.length(); int m= W.length(); int ans=0;
        boolean vis[] = new boolean[n];
        
        for(int i=0; i<n; i++) // to search only the first ch
        {
            if(S.charAt(i) == W.charAt(0) && !vis[i])
            {
                    vis[i] =true;
                    int k =1; // as soon as we got 0th index , have to search for next one.
                
                for(int j=i+1 ;j<n && k<m ;j++)
                {
                    if(S.charAt(j) == W.charAt(k) && !vis[j])
                    {
                        vis[j] =true; k++;
                    }
                }
                if(k==m) ans++;
                else break;
            }
        }
        return ans;
    }
}