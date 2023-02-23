//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            int a = Integer.parseInt(S1[0]);
            int b = Integer.parseInt(S1[1]);
            
            ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
            
            for(int i=0; i<m; i++)
            {
                String S2[] = read.readLine().split(" ");
                int u = Integer.parseInt(S2[0]);
                int v = Integer.parseInt(S2[1]);
                int x = Integer.parseInt(S2[2]);
                int y = Integer.parseInt(S2[3]);
                
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(u);
                edge.add(v);
                edge.add(x);
                edge.add(y);
                
                edges.add(edge);
            }

            Solution ob = new Solution();
            System.out.println(ob.shortestPath(n,m,a,b,edges));
        }
    }
}
// } Driver Code Ends

class Node{
    int v; int w;
    Node(int v, int w)
    {
        this.v =v; this.w = w;
    }
}
//User function Template for Java

class Solution {
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        // code here
         List<List<Node>> adj = new ArrayList<>();
         ArrayList<ArrayList<Integer>> curved = new ArrayList<>();
         for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> arr : edges)
        {
             adj.get(arr.get(0)).add(new Node(arr.get(1), arr.get(2)));
             adj.get(arr.get(1)).add(new Node(arr.get(0), arr.get(2)));
             
             //temp
              ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr.get(0));  temp.add(arr.get(1));  temp.add(arr.get(3));//curved wt
            curved.add(temp);
        }
        
        
        int disa[] = dijkstra(adj, a, n);
        int disb[] = dijkstra(adj, b, n);
        
         int ans = disa[b]; // a -> b = da[b] w/o curved wt
        //s3  consider all poss curved wt at max 1 -> hence itr in each poss
         for(int i=0; i<m; i++)
        {
            int u = curved.get(i).get(0);
            int v = curved.get(i).get(1);
            int cw = curved.get(i).get(2);
    
            ans = Math.min(ans, cw + disa[u] + disb[v]);
            ans = Math.min(ans, cw + disa[v]  + disb[u]);
        }
          if(ans>=1000000001) return -1;
		 return ans;
	    
	   
    }
    
     static int[] dijkstra( List<List<Node>> adj , int start, int n)
    {
        // sorting in asc order of src-> target dist
        int dis[] = new int[n+1];
        Arrays.fill(dis, 1000000001);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> { return x.w - y.w; }); 
        
        
        dis[start]=0;
        
        pq.add(new Node(start,0)); //1sr para is target and 2nd para is dist from src(2) to target
        
        while(!pq.isEmpty())
        {
            Node curr_node =pq.poll();  // VlogV
            for(Node nei : adj.get(curr_node.v))  // ElogV
            {
                // u -> v if(d[v] > d[u] + w[u,v]) d[v] = d[u] + w[u,v])
                //d[v] = dis[nei.v] , d[u] = dis[curr_node.v]  , w[u,v] = nei.w
                if(dis[nei.v] > dis[curr_node.v] + nei.w)
                {
                    dis[nei.v] = dis[curr_node.v] + nei.w;
                    pq.add(new Node(nei.v , dis[nei.v])); // passing the targer and its updated wt from src(2) to target
                }   
            }
        }
        return dis;
    }

};