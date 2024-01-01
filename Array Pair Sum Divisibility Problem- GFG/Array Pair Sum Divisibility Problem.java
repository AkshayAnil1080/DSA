
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        // set.add(nums[0]);
        for(int i=0; i<n ;i++){
            int need  = (k - nums[i]%k);
            if(set.contains(need)){
                set.remove(need);
                continue;
            }
            
            set.add(nums[i]%k ==0 ? k : nums[i]%k);
            
        }
        return set.isEmpty();
    }
    
}
