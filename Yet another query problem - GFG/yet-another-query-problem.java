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


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];

        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
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
            
            
            int num;
            num = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[][] Q = IntMatrix.input(br, num, 3);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.solveQueries(N, num, A, Q);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
       ArrayList<Integer> arr=new ArrayList<>();
        int ans[][]=new int[N][N+1];
        ///row - represents ele indx , col =.> freq of ele from by ith row from 0-n
        //for each ele, count freq and store in ans[i][cnt]++;
          for(int i=0;i<N;i++){
            int count=0;
            for(int j=i;j<N;j++)
            {
                if(A[i]==A[j]) count++;
               
            }
            ans[i][count]++;
        }
        //prefix sum. 
        // ans[3][2] =x => indx range [0,3] - in which no of ele having freq 2 is x
         for(int i=1;i<N;i++)
        {
            for(int j=0;j<N+1;j++)
            {
                ans[i][j]+= ans[i-1][j];
            }
        }
        
        //itr fro queries
        for(int i=0;i<num;i++)
        {
            int L=Q[i][0];
            int R=Q[i][1];
            int K=Q[i][2];
            if(L==0)  arr.add(ans[R][K]);
            else arr.add(ans[R][K] - ans[L-1][K]);
        }
        return arr;
    }
}
        
