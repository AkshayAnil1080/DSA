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
    public int[] twoOddNum(int arr[], int N)
    {
        // code here
        int ans[] = new int[2];
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0; i<N ;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        int k=0;
        for(int x :map.keySet())
        {
            if(map.get(x)%2!=0)
            ans[k++]= x;
            
        }
        return ans;

    }
}