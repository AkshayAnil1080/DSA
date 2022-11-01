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
            
            int[] a = IntArray.input(br, 3);
            int n = a[0],m=a[1],k=a[2];
            
            int[][] e = IntMatrix.input(br, a[2], 2);
            
            Solution obj = new Solution();
            int res = obj.largestArea(n,m,k,e);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


       

class Solution {
    public static int largestArea(int n,int m,int k,int[][] enemy) {
        // code here
        
        if(k==0)
        return n*m;
        
        ArrayList<Integer> r = new ArrayList<Integer>();
         ArrayList<Integer> c = new ArrayList<Integer>();
         
         r.add(0); c.add(0);
         
         for(int i =0; i<k; i++)
         {
             r.add(enemy[i][0]);  c.add(enemy[i][1]);
         }
         
         r.add(n+1);
         c.add(m+1);
         
         Collections.sort(r); Collections.sort(c);
         
         int max_r=0;
         for(int i=1; i<r.size(); i++ )
         {
             max_r = Math.max(max_r, r.get(i) - r.get(i-1) -1); // 1 becaise dont have to consider the enemy row
             
         }
         int max_c=0;
         for(int i=1; i<c.size(); i++ )
         {
             max_c = Math.max(max_c, c.get(i) - c.get(i-1) -1); // 1 becaise dont have to consider the enemy column
             
         }
         
         return max_r*max_c;
        
    }
}
 
