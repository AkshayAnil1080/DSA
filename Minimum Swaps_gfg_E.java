// https://practice.geeksforgeeks.org/problems/minimum-swaps-1649134975/1
// 17-Sept-2022
class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        // code here
        
        int slow_sh =0; // to maintain count of slow_sheeps nit able to reach barn.
        int swaps =0;
        for( int i=n-1; i>=0; i--)
        {
            int pos_in_time_t = c[i] + v[i]*t ; //curr_pos +distance in time t with speed v
            if(pos_in_time_t >= b) // sheep can reach barn
            {
                k--; //as we want k sheeps to reach
                // if not able to reach . count those ships, and sum those number here.else part                swaps +=slow_sh;
                swaps += slow_sh;
                if(k==0) return swaps;
            }
            else
            {
                slow_sh++;
            }
        }
        return -1;
    }
}
       
