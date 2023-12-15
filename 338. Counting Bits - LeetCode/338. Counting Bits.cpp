//java 
// class Solution {
//     public int[] countBits(int num) {
        
       
//         int ans[] = new int[num+1];
//         for( int i =0; i<=num;i++)
//         {
//             ans[i]=count_set_bits(i);
//         }
//         return ans;
//     }
//     int count_set_bits(int n)
//     {int c=0;
//          while(n>0)
//          {
//              if((n&1)==1)
//                  c++;
//              n=n/2;
//          }
//      return c;
//     }
    
// }

class Solution {
    public int[] countBits(int num) {
        
    // just retain the last bit set or not, remaining ie n/2 can be found from same table 
        int ans[] = new int[num+1];
        ans[0]=0;
        for( int i =1; i<=num;i++)
        {
            ans[i]= (i&1) + ans[i/2];  //DP
        }
        return ans;
    }

    
}


//cpp
class Solution {
public:
    vector<int> countBits(int num) {
        vector<int> ans(num + 1, 0);
        ans[0]=0;
        for( int i =1; i<=num;i++)
        {
            ans[i]= (i&1) + ans[i/2];
        }
        return ans;
    }
};
