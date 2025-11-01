
Best Video Solution with Live Coding: https://youtu.be/stXA_F7UaQU
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // S1 Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            adj.get(prereq).add(course); // prereq → course
        }

        // S2 Calculate indegree
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int nei : adj.get(i)) indegree[nei]++;
        }

        // S3 Queue for nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        // S4 BFS (Kahn’s Algorithm)
        int[] order = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            order[idx++] = node;

            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) q.add(nei);
            }
        }

        // S5: If cycle → return empty array
        if (idx == numCourses) return order;
        return new int[0];
    }
}


