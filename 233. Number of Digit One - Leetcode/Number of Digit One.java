// itr for all 1 - n and count all 1
// nlogn
class Solution {
    public int countDigitOne(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++)
        {
            int num=i;
            while(num>0){
                if(num%10==1)
                cnt++;
                
                num/=10;
            } 
        }
        return cnt;
    }
}
// logN
class Solution 
{
  public int countDigitOne(int n) 
  {
    int ans = 0;
    for (int i = 1; i <= n; i *= 10) 
    {
      int div = i * 10;
      int q = n/div; 
      int rem =  n%div;
        ans +=  q*i;
      if (rem >= i){
        ans += Math.min(rem - i + 1, i);
      }
    }
    return ans;
  }
}
