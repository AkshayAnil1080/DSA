class Solution {
    public int majorityElement(int[] nums) {
        /// moores voting algo
        
        int res=0; // assuming cand at 0th
        int c=1;
        for(int i=1;i<nums.length;i++) //=> itr from i=1;
         {
            if(nums[res]==nums[i])
            {
                c++;
            }
            else
                c--;
            if(c==0)
            {
                res=i;
                c=1;
            }
        }
        // we got the candidate from second set, check req for this one only
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nums[res])
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            return  nums[res];
        }
        return 0;
    }
}