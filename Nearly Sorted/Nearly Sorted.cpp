Best solution with live coding and explanation - https://youtu.be/Hz7Nz37GkCo
nlogK, k
class Solution {
public:
    void nearlySorted(vector<int>& arr, int k) {
        int n = arr.size();
        priority_queue<int, vector<int>, greater<int>> pq;
        
        // Pushing first k elements in pq
        for (int i = 0; i < k; i++) 
            pq.push(arr[i]);
        
        int i;
        for (i = k; i < n; i++) {
            pq.push(arr[i]);
            arr[i - k] = pq.top();
            pq.pop();
        }
        
        while (!pq.empty()) {
            arr[i - k] = pq.top();
            pq.pop();
            i++;
        }
    }
};
