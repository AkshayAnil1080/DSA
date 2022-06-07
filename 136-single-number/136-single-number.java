class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> m = new HashMap<>();
        for( int i =0;i<nums.length; i++)
        {
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);                                                if((m.get(nums[i]))==2)
                    m.remove(nums[i]);
        }
    for( Map.Entry<Integer, Integer> e :  m.entrySet())
        return e.getKey(); 
       
        return 0;
    }
}