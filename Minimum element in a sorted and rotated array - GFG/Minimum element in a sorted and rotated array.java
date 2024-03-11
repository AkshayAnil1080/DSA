Minimum element in a sorted and rotated array

class Solution
{
    int findMin(int nums[], int n)
    {
        int start = 0;
        int end = nums.length - 1;

        // If the array is not rotated, return the first element.
        if (nums[start] <= nums[end]) {
            return nums[start];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is greater than the element at end, minimum element lies in the right half.
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            // If mid is smaller than or equal to the element at end, minimum element lies in the left half or is the mid element.
            else {
                end = mid;
            }
        }
        // At the end of the loop, start will point to the minimum element.
        return nums[start];
    }
}
Example 1

Input:
N = 5
arr[] = {4 ,5 ,1 ,2 ,3}
Output: 1
Explanation: 1 is the minimum element in the array.
