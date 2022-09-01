class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
        boolean[] vis= new boolean[nums.length];
        
        List<Integer> l =  new ArrayList<>();
        fun(res, nums, l, vis);
        
        return res;
    }
    void fun(List<List<Integer>> res, int nums[], List<Integer> curr, boolean[] vis){
        if(curr.size()==nums.length){
            res.add(new ArrayList(curr));
                return;
        }
        
        for( int i =0; i<nums.length; i++){
            if(vis[i]==true) continue;
            
            curr.add(nums[i]);
            vis[i] = true;
            
            fun(res, nums,curr , vis);
            curr.remove(curr.size()-1); // backtrack
            
            vis[i] = false;
        }
    }
}