//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java


//User function Template for Java
// Logic
// 1.
//  If a node has already been visited and its state is marked as "1", it means a cycle has been found. 
//  The sum of the nodes in the cycle is computed and returned.

//2
// If a node has already been visited and its state is marked as "2", 
// it means the node has been processed and does not form part of any cycle.

class Solution {
  static List<List<Integer>> v = new ArrayList<>();
  static int[] vis, par;
  static List<Integer> tmp = new ArrayList<>();

//The function returns the largest sum of nodes in a cycle or -1 if no cycle is found.
   long dfs(int node, int p) {
    vis[node] = 1;
    par[node] = p;
    tmp.add(node);
    for (int i : v.get(node)) {
      if (vis[i] == 0) {
        long z = dfs(i, node);
        if (z != -1) {
          return z;
        }
      } else if (vis[i] == 1) {
        long sum = i;
        while (node != i) {
          sum += node;
          node = par[node];
        }
        if (node == i)
          return sum;
        return -1;
      }
    }
    return -1;
  }

  public long largesSumCycle(int N, int[] Edge) {
    long ans = -1;
    vis = new int[N];
    v = new ArrayList<>();
    par = new int[N];

    for (int i = 0; i < N; i++) {
      v.add(new ArrayList<>());
    }

    for (int i = 0; i < N; i++) {
      if (Edge[i] != -1) {
        v.get(i).add(Edge[i]);
      }
    }

    for (int i = 0; i < N; i++) {
      if (vis[i] == 0) {
        ans = Math.max(ans, dfs(i,-1));
     
        for (int j : tmp) {
          vis[j] = 2;
        }
        tmp.clear();
      }
    }

    return ans;
  }
}