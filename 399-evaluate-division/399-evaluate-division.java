
class Node{
        String key; double val;
        public Node (String k, double v){
            key=k; val =v;
        }
}
class Solution {
    //tc - (queries.len * tc(dfs) = O(querie.length * 2*entries.length) 
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
       Map<String, List<Node>>  graph = buildGraph(equations, values); //1. building graph
        
        
        double ans[] = new double[queries.size()]; /// making an ans array for each queries
        for( int i=0; i<queries.size();i++)    // getting answers of queries from graph we build 
        {
            String s = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            
            // since values are dynamic, need to make set to check vis node
            HashSet<String> set = new HashSet<>(); // for every iteration we need to make a new hashset - say a-c jana to a-b-c gae
            //next itr me  b-a jana to mark krna hoga ma sb ko unvis - yes.
            ans[i] = dfs(s,d, set, graph);
        }
        return ans;
        
    }
    // tc: max it will traverse all node to get ans O(v+e)= > O(2*entries.length)
    double dfs(String s, String d, HashSet<String> vis, Map<String, List<Node>> g)
    {
        if(!g.containsKey(s) || !g.containsKey(d)) return -1.0;  //1. either key is not present ret -1;
        
        if(s.equals(d)) return 1.0; //2. both key same - return 1
        
        vis.add(s);     //3. add into vis set
        
        // itr in neigh
        for(Node ng : g.get(s))  // 4, call dfs for its neighbors and there the ans is in multi , to to a-c = ans is a/b*a/c
        {
            if(!vis.contains(ng.key))
            {
                 double res = dfs(ng.key,d,vis, g);
                if(res!=-1){
                    return res * ng.val;
                }
            }
        }
        return -1.0;
    }
    
    // make a graph/
    
     // tc: max it will all node twice a-b then b-a to get ans O(2*(v+e))= > O(4*entries.length)
    public Map<String, List<Node>> buildGraph(List<List<String>> eq, double[] val)
    {
        Map<String, List<Node>> g = new HashMap<>();
        for( int i=0 ; i<val.length; i++)
        {
            //1.ger src and dest value
            String src = eq.get(i).get(0);
            String dest = eq.get(i).get(1);
            
            //2 attach a List to src and dest Node if not present
            g.putIfAbsent(src,new ArrayList<>());
            g.putIfAbsent(dest, new ArrayList<>());
            
            //3 now attach the neighbors
            g.get(src).add(new Node(dest,val[i])); 
            g.get(dest).add(new Node(src,1/val[i])); //making bothway connections since undir
        }
            return g;
    }
    
}