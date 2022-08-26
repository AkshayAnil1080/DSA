class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long pre[] = new long[n+1];
        for( int i=0 ; i<n; i++)
        {
            pre[i+1] = pre[i]+nums[i];
        }
        
        int ans = Integer.MAX_VALUE;
        LinkedList<Integer> q = new LinkedList<>();
        
        // we need the cumm_sum at every i, so made pre array just for convenice and aadding directly the index in LL(just removing last, then again - and removing first) O(1)
        for( int i =0; i<=n; i++)
        {
            //maintng monotonous increasingos sum values and popping the last until we get ele < sum
            
                while(!q.isEmpty() && pre[i] <= pre[q.peekLast()])
                {
                    q.removeLast();
                }
                // //reduce the window  size from left and keep on decereasing unti cummu_Sum <targ and return the window length;
                while(!q.isEmpty() && pre[i] - pre[q.peekFirst()]>=k)
                {
                    ans = Math.min(ans, i-q.removeFirst());
                }
                
                q.add(i);
            
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
        
    }
}