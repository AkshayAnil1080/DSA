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
    public int[] twoOddNum(int a[], int N)
    {
        // code here
         int all = 0 ;
        for ( int i = 0; i< a.length ; i++)
        {
            all = all^a[i];
        }
        
        int m = all & -all ; 
        
        int all1 = 0;
        int all2 = 0;
        
        for ( int i = 0; i< a.length ; i++)
        {
            if((m & a[i]) == 0 )
            {
                all1 = all1 ^ a[i];
            }
            
            else  // 
            all2 = all2 ^ a[i];
        }
        
       int result[] = new int[2];
       if(all1<all2)
      { result[0] = all2;
        result[1] = all1;
      }
      else
      { result[0] = all1;
        result[1] = all2;
      }
       
        
        return result;
    }
}