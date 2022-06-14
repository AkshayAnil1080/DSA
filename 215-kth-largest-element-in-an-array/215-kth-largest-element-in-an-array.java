
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // TC: nlogk
//         PriorityQueue<Integer> pq = new PriorityQueue<>();  // min heap
//         for( int i =0; i<k; i++)
//         {
//             pq.add(nums[i]);
//         }
//         for(int i=k; i<nums.length;i++)
//         {
//             if(pq.peek()<nums[i])
//             {
//                 pq.poll();
//                 pq.add(nums[i]);
//             }
//         }
//         return pq.peek();
//     }
// }

// using   max heap
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // TC: nlogk
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // max heap
        for( int i =0; i<k; i++)
        {
            pq.add(nums[i]);
        }
        for(int i=k; i<nums.length;i++)
        {
            if(pq.peek()<nums[i])
            {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}


// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // TC: nlogn
//         Arrays.sort(nums);
//         return nums[nums.length-k];
//     }
// }
