//java
class Solution {
    public int hammingDistance(int x, int y) {
      
       int ans=0;
        while(x>0 || y>0)
        {
            if((y&1) != (x&1))
                ans++;
          
            y=y/2; // or y>>=1;
            x=x/2;
        }       
        return ans;
    }
}
// O(max(logx,logy))
//cpp
class Solution {
public:
    int hammingDistance(int x, int y) {
        int ans=0;
        while(x>0 || y>0)
        {
            if((y&1) != (x&1))
                ans++;
          
            y=y/2; // or y>>=2;
            x=x/2;
        }       
        return ans;
    }
};
