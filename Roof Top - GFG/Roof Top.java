
https://www.geeksforgeeks.org/problems/roof-top-1587115621/1
Roof Top
Difficulty: EasyAccuracy: 40.48%Submissions: 57K+Points: 2
You are given the heights of consecutive buildings. You can move from the roof of a building to the roof of the next adjacent building. You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.

Examples:

Input: arr[] = [1, 2, 2, 3, 2]
Output: 1
Explanation: 1, 2, or 2, 3 are the only consecutive buildings with increasing heights thus maximum number of consecutive steps with an increase in gain in altitude would be 1 in both cases.

  class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int n = arr.length;
        int count =0;
        int ans =0;
        for( int i =1 ;i <n ;i++)
        {
            if(arr[i] >arr[i-1])
            {
                count++;
                ans = Math.max(ans, count);
            }
            else count = 0;
            
        }
        return ans;
    }
}
