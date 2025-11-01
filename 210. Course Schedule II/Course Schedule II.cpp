
Best Video Solution with Live Coding: https://youtu.be/stXA_F7UaQU
class Solution {
Time Complexity: O(n + m)
Auxiliary Space: O(n + m)
public:
    vector<int> findOrder(int n, vector<vector<int>>& prerequisites) {
        // Step 1: Build adjacency list
        vector<vector<int>> adj(n);
        for (auto& pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            adj[prereq].push_back(course); // prereq → course
        }

        // Step 2: Calculate indegree of each node
        vector<int> indegree(n, 0);
        for (int i = 0; i < n; i++) {
            for (int nei : adj[i]) {
                indegree[nei]++;
            }
        }

        // Step 3: Add nodes with indegree 0 to queue
        queue<int> q;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.push(i);
        }

        // Step 4: BFS / Topological Sort
        vector<int> order;
        while (!q.empty()) {
            int node = q.front();
            q.pop();
            order.push_back(node);

            for (int nei : adj[node]) {
                indegree[nei]--;
                if (indegree[nei] == 0) q.push(nei);
            }
        }

        // Step 5: Check if we could complete all courses
        if ((int)order.size() == n) return order;
        return {}; // cycle exists → impossible
    }
};
