class Solution{
    public:
    // arr : given array
    // l : starting index of the array i.e 0
    // r : ending index of the array i.e size-1
    // k : find kth smallest element and return using this function
    int kthSmallest(int arr[], int l, int r, int k) {
        // Find the partition index
        int ans = partition(arr, l, r);

        // If partition index is the k-1 element, return its value
        if (ans == k - 1)
            return arr[ans];

        // If partition index is less than k-1, search in the right subarray
        else if (ans < k - 1)
            return kthSmallest(arr, ans + 1, r, k);

        // If partition index is greater than k-1, search in the left subarray
        else
            return kthSmallest(arr, l, ans - 1, k);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low; // i is the pivot location

        for (int j = low; j < high; ++j) {  // Corrected loop condition to `j < high`
            if (arr[j] < pivot) {
                std::swap(arr[j], arr[i]);
                ++i;
            }
        }
        std::swap(arr[high], arr[i]);

        return i;
    }
};
