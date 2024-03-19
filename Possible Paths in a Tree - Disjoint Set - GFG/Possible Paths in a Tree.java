
class Solution { 
     int ans;
     int[] parent ; 
      int[] size ;
    ArrayList<Integer> maximumWeight(int n, int edges[][], int q, int queries[]) {
        // code here     
         ans = 0;

        parent = new int[n + 1];
        size = new int[n + 1];
        Arrays.fill(size, 1);
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
         ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> mp = new TreeMap<>(); // asc sorted

        // Sorting the edges based on their weights in ascending order to get our work done.
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        for (int i = 0; i < n - 1; i++){

        //  (k,v) - value is the number of path with in which mx wt  <= k
            mp.put(edges[i][2], Union(edges[i][0], edges[i][1]));
        }

        
       for (int query : queries) { //q logn
            int maxWeight = 0;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                if (entry.getKey() <= query) 
                    maxWeight = entry.getValue();
                else
                    break;
            }
            res.add(maxWeight);
        }
        return res;
    }
    
    int find(int x) {
        if(x==parent[x])
        return x;
        
        return parent[x] = find(parent[x]); // find path compression
    }

    int Union(int a, int b) {
    int rootA = find(a);
    int rootB = find(b);

    //union by rank - bigger rank always become parent to avoud chaining
        if (size[rootA] < size[rootB]) {
              ans += size[rootA] * size[rootB];  // only change
            parent[rootA] = rootB;
            size[rootB] += size[rootA];
            
        } else if (size[rootA] > size[rootB]) {
              ans += size[rootA] * size[rootB];
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        } else {
                ans += size[rootA] * size[rootB];
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        }
        
          return ans;
    }
}
