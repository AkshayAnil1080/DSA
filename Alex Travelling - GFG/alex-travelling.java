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
            int n = sc.nextInt();
            int k = sc.nextInt();

            int tmp = sc.nextInt();
            int[][] flights = new int[tmp][3];
            for (int i = 0; i < tmp; i++) {

                int u1 = sc.nextInt();
                int v1 = sc.nextInt();
                int w1 = sc.nextInt();
                flights[i][0] = u1;
                flights[i][1] = v1;
                flights[i][2] = w1;
            }

            Solution ob = new Solution();
            int ans = ob.minimumCost(flights, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

//s1
class Node{
    int v; int w;
    Node(int v, int w)
    {
        this.v =v; this.w = w;
    }
}
class Solution {

    int dis[];
    int minimumCost(int[][] flights, int n, int k) {
        // Your code here

        //s2 to make an adj list - pre processing
        List<List<Node>> adj = new ArrayList<>();
        
        for(int i =0; i<=n; i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int arr[] : flights)
        {
            adj.get(arr[0]).add(new Node(arr[1], arr[2]));
        }
        //
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        // calling dijkstra s3
        dijkstra(adj, k);
        //s4
        //return max of dis
        int ans=0;
        for(int i=1; i<dis.length; i++)
        {
            ans = Math.max(ans, dis[i]);
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
    //s3 
    void dijkstra( List<List<Node>> adj , int start)
    {
        // sorting in asc order of src-> target dist
        PriorityQueue<Node> pq = new PriorityQueue<>((x,y) -> { return x.w - y.w; }); 
        
        
        dis[start]=0;
        
        pq.add(new Node(start,0)); //1sr para is target and 2nd para is dist from src(2) to target
        
        while(!pq.isEmpty())
        {
            Node curr_node =pq.poll();
            for(Node nei : adj.get(curr_node.v))
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
    }
}
