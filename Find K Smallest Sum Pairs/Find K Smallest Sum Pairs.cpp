Best Video Solution with Live Coding: https://youtu.be/h_RfV9NYihc
LIKE | SHARE | SUBSCRIBE


klog, k

class Solution {
public:
    vector<vector<int>> kSmallestPair(vector<int>& arr1, vector<int>& arr2, int k) {
        vector<vector<int>> result;
        
        if(arr1.empty() || arr2.empty() || k == 0) return result;

        // Min Heap storing {sum, i, j}
        priority_queue<vector<int>, vector<vector<int>>, greater<vector<int>>> pq;

        // Push first elements from each row
        for(int i = 0; i < min((int)arr1.size(), k); i++) {
            pq.push({arr1[i] + arr2[0], i, 0});
        }

        while(!pq.empty() && k > 0) {
            auto top = pq.top();
            pq.pop();

            int i = top[1];
            int j = top[2];

            result.push_back({arr1[i], arr2[j]});
            k--;

            // Move right in arr2
            if(j + 1 < arr2.size()) {
                pq.push({arr1[i] + arr2[j + 1], i, j + 1});
            }
        }

        return result;
    }
};



Find K Smallest Sum Pairs
