class Solution {
    public int hammingDistance(int x, int y) {
      
        int till_loop = x>y? x:y;
        int ans=0;
        while(till_loop>0)
        {
            if((y&1) != (x&1))
                ans++;
          
            y=y/2; // or y>>=2;
            x=x/2;
            till_loop/=2;
        }
        
        
        return ans;
    }
}
// O(max(logx,logy))