
class Solution {
    public void sortColors(int[] nums) {
        
        /// dutch national flag algo , variant oh hoares partition
        // TC:O(n)
        int low=0;
        int high=nums.length-1;
        int mid=0;
        
        while(mid<=high)
        {
            //3 cases
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
          else  if(nums[mid]==1)
                mid++;
            
            else  //(nums[mid]==2)
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                
                high--;
                 // mid++;
            }
        }
    }
}


// class Solution {
//     public void sortColors(int[] nums) {
//         TC: nlogn
//         Arrays.sort(nums[i]);
//     }
// }
