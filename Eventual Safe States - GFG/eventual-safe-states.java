//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

         List<List<Integer>> revadj = new ArrayList<>();
        for (int i = 0; i < V; ++i) {
            revadj.add(new ArrayList<>());
        }
        //reverse the graph
        for (int i = 0; i < V; ++i)
        {
            for (int nei : adj.get(i)) 
            {
                revadj.get(nei).add(i);
            }
        }//perform std topo sort
         List<Integer> ans =  new ArrayList<Integer>();
        int ind=0;
        //1,  //mark the indegree
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[V];
        for( int i=0; i<V;i++)
        {
            for(int x : revadj.get(i))
            indegree[x]++;
        }
        //2. 
        for( int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        
        //3
        while(!q.isEmpty())
        {
            int u =q.poll();
            ans.add(u); //store in ans
            
            for( int v:  revadj.get(u))
            if(--indegree[v]==0)
            q.add(v);
        }
        Collections.sort(ans);
        return ans;
    }
    
}
