
class Solution {
    static int singleElement(int[] nums , int N) {
        // code here
        int res=0;
        for( int i=0; i<32;i++)
        {
            int ans=0;
            for( int j =0; j<nums.length; j++){
                if( (nums[j] & (1<<i)) !=0)
                    ans++;   
            }
            if(ans%3==1)
            res+= (1<<i);
        }
        return res;
    }
}

//cpp
class Solution {
  public:
    int singleElement(int nums[] ,int N) {
       int res = 0;
        for (int i = 0; i < 32; i++) {
            int ans = 0;
            for (int j = 0; j < N; j++) {
                if ((nums[j] & (1 << i)) != 0)
                    ans++;
            }
            if (ans % 3 == 1)
                res += (1 << i);
        }
        return res;
    }
};
