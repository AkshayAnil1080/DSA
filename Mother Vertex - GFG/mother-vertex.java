//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


// V*(V+E) -TC
// O(V) - SC
// class Solution
// {
//     //Function to find a Mother Vertex in the Graph.
//     int ans;
//     public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
//     {
//       int ans = -1;
//         for (int i = 0; i < V; i++) {
//             boolean[] vis = new boolean[V];
//             vis[i] = true;

//             Queue<Integer> q = new LinkedList<>();
//             q.add(i);
//             int count = 1;
//             while (!q.isEmpty()) {
//                 int curr = q.poll();

//                 for (int nei : adj.get(curr)) {
//                     if (!vis[nei]) {
//                         count++;
//                         vis[nei] = true;
//                         q.add(nei);
//                     }
//                 }
//             }
//             if (count == V) {
//                 ans = i;
//                 break;
//             }
//         }
//         return ans;
//     }
// }

class Solution {

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];

        int ans = -1;
        for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            dfs(i, adj, visited);
             ans = i;
        }
        }
        
        //again need to check
        boolean[] visited2 = new boolean[V];
        dfs(ans, adj, visited2);
        for(boolean x : visited2)
        {
            if (!x) return -1;
        }

        return ans;
    }

   void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
       visited[node]=true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}