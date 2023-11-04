class Solution {
  public:
       vector<int> topK(vector<int>& nums, int k)
    {

        int N = nums.size();

        unordered_map<int, int> mp;
        for (int i = 0; i < N; i++)
            mp[nums[i]]++;

        priority_queue<pair<int, int> > pq;

        for (auto x : mp) {//N
            pq.push({ x.second, x.first });  //logN
        }
    //     while (!pq.empty()) {
    // cout << pq.top().first << " " << pq.top().second << endl;
    // pq.pop();
    // }
    // freq : ele
    // 3 2
    // 3 1
    // 1 3
      
        vector<int> ans;

        for (int i = 1; i <= k; i++) {
            ans.push_back(pq.top().second);
            pq.pop();
        }

        return ans;
    }
};
