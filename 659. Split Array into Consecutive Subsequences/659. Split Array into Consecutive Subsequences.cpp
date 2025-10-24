Best Video Solution with Live Coding: https://youtu.be/iRiYRdyFty4
LIKE | SHARE | SUBSCRIBE

nlogn,k
class Solution {
  public:
    bool isPossible(vector<int>& nums, int k) {
        int n = nums.size();

        // Min-heap to track ongoing subsequences
        // Each element -> {lastNumberInSequence, lengthOfSequence}
        auto cmp = [](const pair<int,int>& a, const pair<int,int>& b) {
            if (a.first == b.first) return a.second > b.second;
            return a.first > b.first;
        };
        priority_queue<pair<int,int>, vector<pair<int,int>>, decltype(cmp)> pq(cmp);

        int i = 0;
        while (i < n) {
            if (pq.empty()) {
                pq.push({nums[i], 1});
                i++;
            } 
            else {
                auto current = pq.top();

                if (nums[i] == current.first) {
                    // Same number → start a new subsequence
                    pq.push({nums[i], 1});
                    i++;
                } 
                else if (nums[i] == current.first + 1) {
                    // Extend smallest subsequence
                    pq.pop();
                    pq.push({nums[i], current.second + 1});
                    i++;
                } 
                else {
                    // Gap found → validate top sequence
                    if (current.second < k) return false;
                    pq.pop();
                }
            }
        }

        // Final check for all remaining subsequences
        while (!pq.empty()) {
            if (pq.top().second < k) return false;
            pq.pop();
        }

        return true;
    }
};
