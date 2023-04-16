//{ Driver Code Starts
import java.io.*;
import java.util.*;


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
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.solve(N, A, B);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long solve(int N, int[] A, int[] B) {
        // code here
         long sum = 0;
        //make two al for storing and separting odd and even ele
        ArrayList<Integer> x[]=new ArrayList[2], y[]=new ArrayList[2];
        for(int i=0;i<2;i++)
        {
            x[i]=new ArrayList<>();
            y[i]=new ArrayList<>();
        }
        //2
        for(int i = 0; i < N; i++) 
        {
           sum += A[i] - B[i];
           if(A[i]%2==0) 
            x[0].add(A[i]);
            else 
            x[1].add(A[i]);

            if(B[i]%2==0) 
            y[0].add(B[i]);
            else 
            y[1].add(B[i]);
            
        }
        // not poss to convert
        if(sum != 0 || x[0].size() != y[0].size())
        return -1;
        
        long ans = 0;
        
        // sort list one by one and take the difference.
        for(int i = 0; i < 2; i++) 
        {
           Collections.sort(x[i]);
           Collections.sort(y[i]);
        
           for(int j = 0; j < x[i].size(); j++) 
             ans += Math.abs(x[i].get(j) - y[i].get(j)) / 2;
        }
        return ans/2 ;
        
    }
}
        
