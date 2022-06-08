class Solution {
    public int[] countBits(int num) {
        
       
        int ans[] = new int[num+1];
        for( int i =0; i<=num;i++)
        {
            ans[i]=count_set_bits(i);
        }
        return ans;
    }
//     theta(setbitcount) // brain kerninngams algo
    int count_set_bits(int n)
    {int c=0;
         while(n>0)
         {
             n=n&(n-1);
                 c++;
         }
     return c;
    }
    
}
// TC: O(nlogn)