// https://practice.geeksforgeeks.org/problems/number-of-ways-to-arrive-at-destination/1
// 16 Sept 2022
class Solution {

    static int countPaths(int n, List<List<Integer>> roads) {
        // Your code here
        int mod = 1000000007;
        List<List<int[]>> g = new ArrayList<>();
        
        for( int i =0; i<=n; i++)
        g.add(new ArrayList<>());
        
        for(List<Integer> ent : roads) // enteries of rows
        {
            g.get(ent.get(0)).add(new int[]{ent.get(1), ent.get(2)});
             g.get(ent.get(1)).add(new int[]{ent.get(0), ent.get(2)});
        }
        // adding edges since undireceted graph.
        
        long ans[] =new long[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        
        int path[] = new int[n];
        
        // for finalized state
        PriorityQueue<long[]> pq  =new PriorityQueue<>((x,y)->{return (int)x[0]- (int)y[0];});
        pq.add(new long[]{0,0});
        ans[0]=0;
        path[0]=1;
        
        while(!pq.isEmpty())
        {
            long[] t = pq.poll();
            
            for(int[]  nbr : g.get((int)t[1]))
            {
                long v =nbr[0]; // vertex
                long e = nbr[1]; //edge
                
                if(ans[(int)v]  > ans[(int)t[1]] +e)
                {
                    ans[(int)v] =  ans[(int)t[1]] +e;  // normal dijkstras
                    
                    pq.add(new long[]{ans[(int)v], v});  // put in pq, as finalized state.
                    path[(int)v] = path[(int)t[1]] % 1000000007;
                }
                else if( ans[(int)v] == t[0]+e)
                {
                    path[(int)v] += path[(int)t[1]];  // need to update the path if distance not updated.
                      path[(int)v]  %= 1000000007;
                }
            }
        }
        return path[n-1];
    }
    
}
