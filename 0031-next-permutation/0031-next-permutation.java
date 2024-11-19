class Solution {
    public void nextPermutation(int[] nums) {

            int n = nums.length;
    //  finding the right most peak
    
        int rm_peak = -1;
        for( int i=n-1;i>=1;i--){
            if(nums[i]>nums[i-1]){
                rm_peak=i;
                break;
            }
        }
        
        if(rm_peak==-1){ // arr in desc -> q says just sort and return
            int l=0; int h=n-1;
            while(l<=h){
                int temp=nums[l];  nums[l]=nums[h];   nums[h]= temp;   
                l++; h--;
            }
            return;
        }
          // traverse right to rm_peak and find a number in the range (nums[rm_peak-1], nums[rm_peak]) , if found swap with nums    [rm_peak-1], else swap(rm_peak , rm_peak-1)
        //sort from rm_peak till last - to get the closest number
        int index=rm_peak;
        for(  int i=rm_peak ;i<n;i++){
            if(nums[i]>nums[rm_peak-1]  && nums[i]<nums[rm_peak]){
                index=i;
            }
        }
        
       int temp=nums[index];
        nums[index]=nums[rm_peak-1]  ;
        nums[rm_peak-1]  = temp;
        
        Arrays.sort(nums, rm_peak, n);
    
    }
}