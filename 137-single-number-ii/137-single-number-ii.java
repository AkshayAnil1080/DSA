class Solution {
    public int singleNumber(int[] nums) {
        
        // idea: calclute the sum of set bit at each pos of(32 bit number) and add them , if %3==1 then that is our bit required for the unique ele.
        int res=0;
        for( int i=0; i<32;i++)
        {
            int ans=0;
            for( int j =0; j<nums.length; j++)
            {
                if( (nums[j] & (1<<i)) !=0)
                    ans++;
                  
            }
            if(ans%3==1)
            res+= (1<<i);
        }
        return res;
    }
}

// TC : O(n)