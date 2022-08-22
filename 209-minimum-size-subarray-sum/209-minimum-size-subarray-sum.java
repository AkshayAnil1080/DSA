class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int ans =Integer.MAX_VALUE ;
        int sum=0;
        int left =0;
        for( int i =0; i<nums.length; i++)
        {
            
            sum+=nums[i];
            
            while(sum>=target)
            {
                ans = Math.min(ans, i+1-left);
                sum -= nums[left];  left ++;
            }
                
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
}
//1. keep goinf right and summing
//2. as asson as sum >=target => store the window size, subtract the left most ele, store the size again, and move left one ptr ahead and keep doing it
// when s2 while loop over => again move forward for next ele.