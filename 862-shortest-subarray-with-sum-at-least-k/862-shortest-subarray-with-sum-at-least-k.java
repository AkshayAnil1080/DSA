// TC: O(2n) - each node is visited at most twice 
//SC: O(n) for pair
class Pair
{
    Long x; int y;
    Pair(Long x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int shortestSubarray(int[] nums, int k) {
           
       ArrayDeque<Pair> dq = new ArrayDeque<>();
        long ans = Integer.MAX_VALUE;
        int n = nums.length;     
        long sum=0;
        for( int i =0; i<n; i++)
        {
            sum += nums[i];
        
            if(sum>=k) ans=Math.min(ans,i+1); //1. obv
            
            
            //reduce the window  size from left and keep on decereasing unti cummu_Sum <12 and return the window length; line 33
            Pair curr = new Pair((long)Integer.MIN_VALUE, Integer.MIN_VALUE);
            while(!dq.isEmpty() && sum-dq.getFirst().x >=k)
            {
                curr=  dq.getFirst();
                dq.pollFirst();
            }
            
            if(curr.x!=Integer.MIN_VALUE)
            {
                ans = Math.min(i-curr.y, ans);
            }
                
            // we have to maintain moto increasing order, so if sum obtained  > last ele in dequeu, keep popping out pop last until we get sum < Pair.x
              while(!dq.isEmpty() && sum<=dq.getLast().x)
            {
                dq.pollLast();
            }
            dq.addLast(new Pair(sum,i));
            
            
        }
        return ans==Integer.MAX_VALUE? -1:(int)ans;
    }
}

//Sim, to 209
// 209. Minimum Size Subarray Sum>=k
//1. keep goinf right and summing
//2. as asson as sum >=target => store the window size, subtract the left most ele, store the size again, 
//and move left one ptr ahead and keep doing it
// when s2 while loop over => again move forward for next ele.