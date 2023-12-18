class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
         int num = m^n;
      //now we have to find right most set bit
        //m1
    //   int cnt  = 0;
    //     while(num > 0)
    //     {
    //         cnt++;
    //         if((num&1)==1)
    //         return cnt;
            
    //         num = num /2;   // n>>1;
    //     }
    //     return  -1;
        
        //m2
         int res = num&-num;
        int ans = (int)(Math.log(res)/Math.log(2));
        
        return ans+1 >0 ? ans+1: -1;
    }
}

