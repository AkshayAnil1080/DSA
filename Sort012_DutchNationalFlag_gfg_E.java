// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1



class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here 
        int low=0; int mid=0; int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            }
            else if(arr[mid]==1)
            mid++;
            
            else
            {
                int temp = arr[high];
                arr[high] = arr[mid];;
                arr[mid] = temp;
                high--;
            }
            
        }
    }
}
// TC: O(n)
//   SC:O(1) - inplace(swap within)
