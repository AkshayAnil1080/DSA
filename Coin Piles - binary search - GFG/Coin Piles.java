
Problem Link:
https://www.geeksforgeeks.org/problems/coin-piles5152/1
Code with Akshay - best video solution - https://youtu.be/izq80-PVEr8

class Solution {
    public int minimumCoins(int[] arr, int k) {
        
         Arrays.sort(arr);
        int n = arr.length;
        long[] prefixSum = new long[n];

        prefixSum[0]=arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int minCoins = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int target = arr[i] + k;
            

            long leftRemove  = (i > 0) ? prefixSum[i - 1] : 0;
            
            // Find the first index where value > target
            int idx = upperBound(arr, target,i,n);

            // Coins to remove from right side
            long coinsToRemove = leftRemove;
            if(idx < n){
             coinsToRemove += prefixSum[n-1] - prefixSum[idx-1] - target*(n-idx);
            }

            minCoins = (int) Math.min(minCoins, coinsToRemove);
        }

        return minCoins;
    }
    int upperBound(int[] arr, int target
        },int low, int high) {
    
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        return high;
    }
}

