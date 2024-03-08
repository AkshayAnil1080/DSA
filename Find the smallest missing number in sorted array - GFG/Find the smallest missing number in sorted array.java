class SmallestMissing {
    int findFirstMissing(int array[], int start, int end) {
        if (start > end)
            return end + 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the current element is not equal to its index, it means there is a missing element on the left side.
            if (array[mid] != mid && (mid == 0 || array[mid - 1] == mid - 1))
                return mid;

            // If the current element is equal to its index, the missing element is on the right side.
            if (array[mid] == mid)
                start = mid + 1;
            else
                end = mid - 1;
        }
        // No missing element found in the given range, so return the next number.
        return end + 1;
    }

    // Driver program to test the above function
    public static void main(String[] args) {
        SmallestMissing small = new SmallestMissing();
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        int n = arr.length;
        System.out.println("First Missing element is : " + small.findFirstMissing(arr, 0, n - 1));
    }
}

dry run  0,1,2,6,9
  m  = 2 , search in right
  l =3 , h=4 = > m=3  , went into first if , return mid i.e 3
