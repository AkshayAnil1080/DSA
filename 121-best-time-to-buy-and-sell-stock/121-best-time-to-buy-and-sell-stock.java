class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int min_val = prices[0];
        for( int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                  ans = Math.max(ans, prices[i]-min_val);
            }
          
            min_val=Math.min(min_val , prices[i]);
        }
        return ans;
        
    }
}