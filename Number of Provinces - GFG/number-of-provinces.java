//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    
    void dfs(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited)
    {
        //getting the nei of i
        for (int j = 0; j < adj.size(); j++)
        {
            if (i!=j && adj.get(i).get(j) == 1 && !visited[j])
            {
                visited[j] = true;
                dfs(adj, j , visited);
            }
        }
    }
    
    int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        int n = adj.size();// number of nodes
        boolean vis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (vis[i] == false)
            { 
                count++;
                dfs(adj, i, vis);
            }
        }
        return count;
    }
};