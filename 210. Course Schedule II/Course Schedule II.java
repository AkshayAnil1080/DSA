
Best Video Solution with Live Coding: https://youtu.be/stXA_F7UaQU
Time Complexity: O(n + m)
Auxiliary Space: O(n + m)s2
class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            adj.get(prereq).add(course); // prereq → course
        }

        // Step 2: Calculate indegree of each node
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int nei : adj.get(i)) indegree[nei]++;
        }

        // Step 3: Add nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        // Step 4: BFS / Topological Sort
        ArrayList<Integer> order = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            order.add(node);

            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) q.add(nei);
            }
        }

        // Step 5: Check if we could complete all courses
        if (order.size() == n) return order;
        return new ArrayList<>(); // cycle exists → impossible
    }
}
