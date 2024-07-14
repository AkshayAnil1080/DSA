
class Solution {
    void segregate0and1(int[] nums) {
         int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(mid<=high)
        {
            //2 cases
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            
            else  //(nums[mid]==1)
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                
                high--;
            }
        }
    }
}
