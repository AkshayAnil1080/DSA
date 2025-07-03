class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
         sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        
        for (int i = 0; i < nums.size() - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int low = i + 1;
            int high = nums.size() - 1;
            int target = 0 - nums[i];

            while (low < high) {
                int curr_sum = nums[low] + nums[high];

                if (curr_sum == target) {
                    result.push_back({nums[i], nums[low], nums[high]});
                    
                    // Skip duplicates for second and third elements
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    
                    low++;
                    high--;
                }
                else if (curr_sum < target) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }
};