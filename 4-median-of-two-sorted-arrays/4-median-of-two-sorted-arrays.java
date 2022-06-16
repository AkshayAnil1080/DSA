class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
         if(nums1.length == 0 || nums2.length == 0){
            int[] arr= nums1.length != 0 ? nums1 : nums2;
            if(arr.length % 2 != 0) return arr[arr.length/2];
            return ((double)arr[arr.length/2] + (double)arr[arr.length/2-1])/2;
         }
            // deciding which arr has less ele to perform in low tc //// i got several re bcoz of this
         if(nums1.length > nums2.length) 
        {
            int temp[] = nums1;
            nums1=nums2;
            nums2=temp;
        }
             
        int n1=nums1.length; int n2=nums2.length; // making sure the nums1 contains less ele.
        int begin = 0;
        int end =n1;
        
        while(begin <=end)
        {
            int i1=(begin+end)/2;
            int i2 =(n1+n2+1)/2 -i1;
            
            int max1 = (i1==0)? Integer.MIN_VALUE : nums1[i1-1];
            int max2 = (i2==0)? Integer.MIN_VALUE : nums2[i2-1];
            
            int min1 = (i1==n1)? Integer.MAX_VALUE : nums1[i1];
            int min2 = (i2==n2)? Integer.MAX_VALUE : nums2[i2];
            
            
            if(max1<=min2 && max2<=min1){
                if((n1+n2)%2!=0)
                {
                    return (double)Math.max(max1,max2);
                }
                else
                    return  ((double)(Math.max(max1,max2) + (double)Math.min(min1,min2)) /2);
            }
            
            //BS
            if(max1>min2)
                end = i1-1;
            else
                begin =i1+1;
        }
        return 0;
    }
}