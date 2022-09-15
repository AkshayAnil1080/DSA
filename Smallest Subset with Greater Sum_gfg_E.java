//User function Template for Java
// https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1
//1. sort the array,find sum of ele, traverse from last to start and keep curr_sum and minus the ele from sum to make sum from [0-curr_ptr i am)-
// if at any point, curr_sum > sum  -> cond is met - return the count  
// TC: O(nlogn), SC:O(1)
class Solution { 
    int minSubset(int[] arr,int n) {
        if(n==1)
        return 1;
        Arrays.sort(arr);
        long sum=0;
        for(int  i=0; i<n; i++)
        {
            sum=sum+arr[i];
        }
        
        long curr_sum=0;
        for( int j=n-1; j>0; j--)
        {
            curr_sum+=arr[j]; 
            sum=sum-arr[j];
            
            if(curr_sum>sum)
            {
                return n-j;
            }
        }
        return 0;
    }
}
