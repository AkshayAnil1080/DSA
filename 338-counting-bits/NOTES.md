1. nlogn -  n for itr 1 to n and logn for set_bit count
3. n(set_bit_count) - 
4. using the previous values


1.
class Solution {
    public int[] countBits(int num) {
        
       
        int ans[] = new int[num+1];
        for( int i =0; i<=num;i++)
        {
            ans[i]=count_set_bits(i);
        }
        return ans;
    }
    int count_set_bits(int n)
    {int c=0;
         while(n>0)
         {
             if((n&1)==1)
                 c++;
             n=n/2;
         }
     return c;
    }
    
}
// TC: O(nlogn)

2.
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
