//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
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
class Solution
{
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        ArrayList<Integer> al= new ArrayList<>();
        Stack<Integer> st = new Stack<>();
       
        for(int i =0,j=1; j<N ;i++,j++)
        {
             boolean flag = false;
             
            if(arr[i]>arr[j])
            st.push(arr[i]);
            
            else
            {
                while(!st.isEmpty())
                {
                    if(arr[j] > st.peek())
                    {
                        st.pop();
                        flag = true;
                    }
                    else break;
                }
            }
            
            if(flag)
            {
                al.add(arr[i]);
            }
        }
        al.add(arr[N-1]);
        
        int ans[] = new int[al.size()];
        for(int i =0; i<al.size(); i++)
        {
            ans[i] = al.get(i);
        }
        return ans;
    }
}