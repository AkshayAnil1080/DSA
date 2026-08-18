https://www.geeksforgeeks.org/problems/triplets-with-sum-with-given-range/1
video explanation with all approaches - 
https://youtu.be/czgu6Z4khkY


brute force N^3, 1
  class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        int ans=0;
        int n = arr.length;
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n ;k++){
                    
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum>=l && sum<=r)
                    ans++;
                }
            }
        }
        return ans;
    }
}

// optimised - sorting + two pointer
class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        return helper(arr, r) - helper(arr,l-1);
    }
    int helper(int arr[] , int x){
        int n= arr.length, ans=0;
        Arrays.sort(arr);
        for(int i=0; i<n-2;i++){
            int j=i+1, k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                
                if(sum<=x){
                    ans+=(k-j);
                    j++;
                }
                else 
                k--;
            }
        }
        return ans;
    }
}
