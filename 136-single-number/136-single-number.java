class Solution {
    public int singleNumber(int[] nums) {
        int ans =nums[0];
        for( int i=1;i<nums.length;i++)
        {
            ans ^=nums[i];
        }
        return ans;
    }
}
// Idea: a^a=0
//     TC:O(n)
//     SC:O(1)