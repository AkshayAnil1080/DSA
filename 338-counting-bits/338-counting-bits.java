class Solution {
    public int[] countBits(int num) {
        
//         jsut reatin the last bit set or not, remaining ie n/2 can be found from same table theta(n) solution
        int ans[] = new int[num+1];
        ans[0]=0;
        for( int i =1; i<=num;i++)
        {
            ans[i]= (i&1) + ans[i/2];
        }
        return ans;
    }

    
}
// TC: O(nlogn)