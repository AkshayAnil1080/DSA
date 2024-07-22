class Solution {
public:
    static int findSum(int A[], int N) {
        // Initialize max and min with the first element
        int max = A[0];
        int min = A[0];
        
        // Iterate through the array to find max and min
        for (int i = 1; i < N; ++i) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        
        // Return the sum of max and min
        return max + min;
    }
};
