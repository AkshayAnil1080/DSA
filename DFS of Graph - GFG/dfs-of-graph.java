//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
           ArrayList<Integer> al = new ArrayList<>();
        boolean vis[]  = new boolean[V] ; // mark visited
        
        dfs(0, vis, al , adj);
        return al;
        
    }
    
    public void dfs(int curr , boolean[] vis  , ArrayList<Integer> al , ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr] = true;
        al.add(curr);
        for( int i = 0 ; i<adj.get(curr).size() ; i++) // run loop till all the neighbours of curr node
          if(!vis[adj.get(curr).get(i)]) // if neighbour is not visited-> recursive call the function
                dfs(adj.get(curr).get(i) , vis, al , adj);
                
    }
        
     
       

}
