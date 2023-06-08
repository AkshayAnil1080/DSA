//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends


class Solution {
    public static String solve(int n, int k, int fact[], int nums[])
    {
        if (n == 0)
            return "";

        int c = k / fact[n - 1] + 1;

        String str = "";
        for (int i = 0; i < nums.length; i++)
        {
            c -= (nums[i] == 0?1:0);

            if (c == 0 && nums[i] == 0)
            {
                nums[i] = 1;
                str += String.valueOf(i + 1);
                break;
            }
        }

        return str + solve(n - 1, k % fact[n - 1], fact, nums);
    }
    public static String kthPermutation(int n,int k) {
        // code here
        int fact[]=new int[n+1];
        Arrays.fill(fact,1);
        for (int i = 1; i <= n; i++)
            fact[i] = i * fact[i - 1];
        int nums[]=new int[n];
        String s = solve(n, k - 1, fact, nums);

        return s;
    }
}
        


//{ Driver Code Starts.

class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            Solution obj = new Solution();
            String res = obj.kthPermutation(a[0],a[1]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends