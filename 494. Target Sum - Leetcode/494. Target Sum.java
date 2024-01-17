// class Solution {
  
//     public int findTargetSumWays(int[] nums, int target) {
//        return calculate(nums, 0,0, target);
//     }
//     //logic - consider the ele ( + rec call  and - rec call)
//     //bc - if no more ele left ( have to use all integers- q says) - check if sum==targer cnt++;
//     int calculate(int nums[], int i, int sum, int target)
//     {
//         if(i==nums.length){
//             if(sum==target)
//            return 1;
//            else
//            return 0;
//         }
//         else{
//        return  calculate(nums, i+1, sum + nums[i], target) +
//         calculate(nums, i+1, sum - nums[i], target);
//         }
//     }
// }
// Time complexity: O(2^n) Size of recursion tree will be 2^n
// Space complexity: O(n). The depth of the recursion tree will go up to n

//memo - how many states changin, i(goes upto index n-1) and sum(goes upto (-(total sum ele) to +(total sum of ele)))  => 2d array
// problem - but arrary indices start from 0, it does not have -ve index
// solution - make size 2*sum+1 -> [0-sum] stores[--(total sum ele) - 0]  and [sum+1 - 2*sum] index stores[1 to (total sum of ele)]
// class Solution {
//    int total;
//     public int findTargetSumWays(int[] nums, int target) {

//         total = Arrays.stream(nums).sum();
//        int dp[][] = new int [nums.length][2*total+1];
//        //fill values with no such poss ans
//        for(int r[] : dp)
//        Arrays.fill(r, Integer.MIN_VALUE);

//        return calculate(nums, 0,0, target,dp);
      
//     }
//     //logic - consider the ele ( + rec call  and - rec call)
//     //bc - if no more ele left ( have to use all integers- q says) - check if sum==targer cnt++;
//     int calculate(int nums[], int i, int sum, int target, int dp[][])
//     {
//         if(i==nums.length){
//             if(sum==target)
//             return 1;
//             else return 0;
//         }
//         else if(dp[i][sum+total]!=Integer.MIN_VALUE){
//             return dp[i][sum+total];
//         }
            
        
//         else{
//         return dp[i][sum+total] = calculate(nums, i+1, sum + nums[i], target,dp) +
//         calculate(nums, i+1, sum - nums[i], target,dp);
//         }
//     }
// }
// Time complexity: O(t⋅n). memo array size will be filled just once

// Space complexity: O(t⋅n) - recursion depth can go upto number of ele(t*n)

//number of subset which has sum = (total+target)/2;

class Solution {
  
    public int findTargetSumWays(int[] nums, int target) {
        int total =  Arrays.stream(nums).sum();
        int sum = total + target; // to handle -ve target sum  eg [100] , target -200

       // Check if it's impossible to achieve the target sum
        if (sum % 2 != 0 || total < Math.abs(target)) {
            return 0;
        }
        sum /= 2;
        // int sum = (total+target)/2;
        int n = nums.length;
        int dp[][] = new int [n+1][sum+1];
        for(int i=0; i<=n; i++)
         dp[i][0]=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=sum; j++){// to handle cases {0,0,0,1} - which has zeros
                if(j < nums[i-1])
                dp[i][j] = dp[i-1][j];
                else
                dp[i][j] = dp[i-1][j] +  dp[i-1][j-nums[i-1]];
            }
        }
    
    return dp[n][sum];
    }
}
