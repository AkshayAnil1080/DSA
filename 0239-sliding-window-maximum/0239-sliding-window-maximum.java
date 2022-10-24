class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
      int al[] = new int[arr.length-k+1];
        int n = arr.length;
        int ind=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0; i<n; i++)
        {
            //remove num out of range k
            if(!dq.isEmpty() && dq.peek()== i-k)
            {
                dq.poll();
            }
            // maintaining decreagin range -> remove samller numbre in k range 
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
            {
                dq.pollLast();
            }
            dq.offer(i);
            
            if(i>=k-1)
            {
                al[ind++] = arr[dq.peek()];
            }
            
            
        }
        return al;
    }
}