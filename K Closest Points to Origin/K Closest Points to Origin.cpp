Best Video Solution with Live Coding: https://youtu.be/Gmr0PikB2d0

class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        // max heap storing pairs of (distance, point)
        priority_queue<pair<int, vector<int>>> maxHeap;

        for (const auto& point : points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            maxHeap.push({dist, point});
            // keep heap size to k
            if (maxHeap.size() > k)
                maxHeap.pop();
        }

        vector<vector<int>> ans;
        while (!maxHeap.empty()) {
            ans.push_back(maxHeap.top().second);
            maxHeap.pop();
        }
        // reverse because largest distance will be first
        reverse(ans.begin(), ans.end());
        return ans;
    }
};
