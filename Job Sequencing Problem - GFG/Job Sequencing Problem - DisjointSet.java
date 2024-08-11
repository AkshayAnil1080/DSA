
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int ans;
    int[] parent ; 
    int[] size ;
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
         parent = new int[n + 1];
          size = new int[n + 1];
          for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        //
         Arrays.sort(arr, (a, b) -> b.profit - a.profit);
    
        int profit = 0, jobsDone = 0;

        for (int i = 0; i < n; i++) {
            int availableSlot = find(arr[i].deadline);
            if (availableSlot > 0) {
                Union(availableSlot - 1, availableSlot); // fiiled the slot 
                profit += arr[i].profit;
                jobsDone++;
            }
        }

        return new int[]{jobsDone, profit};
        //
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
/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
