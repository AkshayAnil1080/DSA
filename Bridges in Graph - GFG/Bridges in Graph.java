// Practice Link: https://www.geeksforgeeks.org/problems/critical-connections/1
class Solution
{
   ArrayList<ArrayList<Integer>> al;
   int time;
    public ArrayList<ArrayList<Integer>> criticalConnections(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        al = new ArrayList<>();
       	boolean visited[] = new boolean[V]; 
		int disc[] = new int[V]; 
		int low[] = new int[V]; 
		int parent[] = new int[V]; 
         time = 0; // Initialize time
 
		for (int i = 0; i < V; i++) 
		{ 
			parent[i] = 0; 
			visited[i] = false; 
		} 


		for (int i = 0; i < V; i++) 
			if (visited[i] == false) 
				bridgeUtil(i, visited, disc, low, parent, adj); 
				
				
// 		Collections.sort(al, (a, b) -> a.get(0).compareTo(b.get(0)));
        Collections.sort(al, (a, b) -> {
            int compareResult = a.get(0).compareTo(b.get(0));
            return compareResult != 0 ? compareResult : a.get(1).compareTo(b.get(1));
        });
		return al;
        
    }
    	void bridgeUtil(int u, boolean visited[], int disc[], int low[], int parent[], ArrayList<ArrayList<Integer>> adj) 
	{ 

		visited[u] = true; 

		disc[u] = low[u] = ++time; 
 
		 Iterator<Integer> i = adj.get(u).iterator();
		while (i.hasNext()) 
		{ 
			int v = i.next(); 

			if (!visited[v]) 
			{ 
				parent[v] = u; 
				bridgeUtil(v, visited, disc, low, parent, adj); 

	
				low[u] = Math.min(low[u], low[v]); 

				 
				if (low[v] > disc[u]) {
			    if (u < v)  // Ensure the smaller vertex is added first
                    al.add(new ArrayList<>(Arrays.asList(u, v)));
                else
                    al.add(new ArrayList<>(Arrays.asList(v, u)));
                }
			} 

		
			else if (v != parent[u]) 
				low[u] = Math.min(low[u], disc[v]); 
		} 
	} 
