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
            
            
            int[] P = IntArray.input(br, N);
            
            Solution obj = new Solution();
            long res = obj.bestNode(N, A, P);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long bestNode(int N, int[] A, int[] P) {
        // code here
        //s1
        Set<Integer> non_leaf = new HashSet<>();
        for(int i=0; i<N; i++)
            non_leaf.add(P[i]);
            
            //s2
        ArrayList<Integer> leaf_node = new ArrayList<>();
        for(int i = 1; i <= P.length; i++){
            if(!non_leaf.contains(i))
                leaf_node.add(i);
        }
        
        //s3
          //traverse from leaf to root and store max at each and every time visited new node
        //adv : 1. we know in which dir to move since parent is already def
        // as in moving from root have to track both sides.
          int ans = Integer.MIN_VALUE;
        for(int leaf : leaf_node )
        {
            int curr_node = leaf;
            int sum=0;
            while(curr_node!=-1) //while curr_node  reaches  root ie == -1
            {
                sum = -sum;
                sum+= A[curr_node-1];
                ans = Math.max(ans, sum);
                curr_node = P[curr_node-1];
            }
        }
        return ans;
                
        
    }
}
        
