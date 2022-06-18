class Solution {
    public void nextPermutation(int[] nums) {

            int n = nums.length;
    //  finding the right most peak
    
        int rm_peak = -1;
        for( int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
                rm_peak=i;
        }
        
        if(rm_peak==-1) // arr in desc -> q says just sort and return
        {
            int l=0; int h=n-1;
            while(l<=h)
            {
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]= temp;
                
                l++; h--;
            }
            return;
        }
        
        
        // traverse right to rm_peak and find a num in range( arr[rm_prak]-1) - to arr[rm_peak] )
        int index=rm_peak;
        int i=0;
        for(  i=rm_peak ;i<n;i++)
        {
            if(nums[i]>nums[rm_peak-1]  && nums[i]<nums[rm_peak])
            {
                index=i;
            }
        }
        
       int temp=nums[index];
        nums[index]=nums[rm_peak-1];
        nums[rm_peak-1]= temp;
        
        Arrays.sort(nums, rm_peak, n);
        
    
    }
}