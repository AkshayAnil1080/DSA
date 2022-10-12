//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends

// kadanes - 
// and store both array in map to take reassigned vales in O(1)
 class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        Map<Character,Integer> map = new HashMap<>();  // O(1) since constrain is 52
        for(int i=0; i<n; i++)
        {
            map.put(x[i],b[i]);
        }
      int max = Integer.MIN_VALUE;
      int sum=0;
      
      StringBuilder ans = new StringBuilder();
      
      StringBuilder temp = new StringBuilder();
      
        for(int i =0; i<w.length(); i++)
        {
            Character ch = w.charAt(i);
            sum += map.containsKey(ch) ? map.get(ch) : ch;
            temp.append(ch);
            if(sum>max)
            {
                max=sum; // and update ans;
                ans = new StringBuilder(temp);
            }
            if(sum<0)
            {
                sum=0;
                temp = new StringBuilder();
                
            }
           
                
        }
        return ans.toString();
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends