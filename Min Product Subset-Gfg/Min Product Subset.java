https://youtu.be/CrQkBI3ZQOY
 - video explanation here...
class Solution {
    int a[];
    HashMap<String, Integer> dp;
    public int minProd(int[] arr) {
        // code here
        dp= new HashMap<>();
        a = arr;
        return solve(0, 1, 0); // starting is not take
        
    }
    int solve(int i, int prod, int taken){
        if(i==a.length){
            if(taken==1)
             return prod;
             else
             return Integer.MAX_VALUE; // empty sub set not allowed.
        }
        String key = i+ "," + prod + "," + taken;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int ans = Math.min(solve(i+1, prod*a[i], 1), 
        solve(i+1,prod,taken));
        dp.put(key, ans);
        return ans;
    }
}


// 2^n , 2^n
