// Question - https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int cnt_zero=0;
        long prod=1;
        for(int x : nums){
            if(x!=0)
            prod *=x;
            else 
            cnt_zero++;
        }
        // System.out.println(prod);
        long arr[] = new long[nums.length];
        if(cnt_zero>1){
            return arr;
        }
        else{
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=0){
                    if(cnt_zero==1)
                    arr[i]=0;
                    // else
                    // arr[i] = prod/nums[i];
                    else{
                        arr[i] = prod/nums[i]; 
                    }
                }
               
                else
                arr[i] = prod;
            }
        }
        return arr;
        
    }
}
