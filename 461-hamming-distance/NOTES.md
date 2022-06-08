1. i used space - spanning both  x and y in array of 256 cells each
   running a loop to validate the count.
class Solution {
    public int hammingDistance(int x, int y) {
        int a[] = new int [256];
        int b[] = new int[256];
        
        int ind=255;
        while(x>0)
        {
            if((x&1)==1)
                a[ind]=1;
            ind--;
            x=x/2; // or x>>=2;
        }
         ind=255;
        while(y>0)
        {
            if((y&1)==1)
                b[ind]=1;
            ind--;
            y=y/2; // or y>>=2;
        }
        
        int ans=0;
        for( int i =0;i<256;i++)
        {
            if(a[i]!=b[i])
                ans++;
        }
        return ans;
    }
}
// O(max(logx,logy))
2. ran the loop once for max(x,y) and maintaint the count where bits were diff  - 100 per faster
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
