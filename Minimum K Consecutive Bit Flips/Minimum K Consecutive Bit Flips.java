Minimum K Consecutive Bit Flips
  https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/
 Best  Video Solution link - https://youtu.be/3dixmsUKgHE


  m1 , n*k, 1
  class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int n = arr.length;
        int res = 0;

        for (int i = 0; i < n - k + 1; i++) {
            if (arr[i] == 0) {

                // if arr[i] = 0, flip arr[i...i+k-1]
                for (int j = i; j < (i + k); j++)
                    arr[j] = 1 ^ arr[j];

                res += 1;
            }
        }

        // If arr[i] is still 0, then it is impossible
        // to convert all elements to 1
        for (int i = n - k + 1; i < n; i++) {
            if (arr[i] == 0)
                return -1;
        }

        return res;
    }
}


//m2 n,k
class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
    Queue<Integer> q = new LinkedList<>();
    int res = 0;
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        // Remove flips that are out of current window 
        while (!q.isEmpty() && i > q.peek() + k - 1) {
            q.poll();
        }
        
        // If bit is 0 after considering flips done so far, flip at i
        if ((arr[i] + q.size()) % 2 == 0) {
            if (i + k > n) return -1; // Can't flip past array length
            res++;
            q.add(i); // Add this flip start index to queue
        }
    }
    return res;
    }
}
