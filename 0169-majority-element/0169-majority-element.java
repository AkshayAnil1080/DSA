class Solution {
    public int majorityElement(int[] a) {
        /// moores voting algo
        int n = a.length;
    int candidate = a[0];
    int count = 1;
    for (int i = 1; i < n; i++)
    {
        if (a[i] == candidate) {
            count++;
        }
        else {
            count--;
        }
        if (count < 0) {
            candidate = a[i];
            count = 1;
        }
    }
    return candidate;

    }
}