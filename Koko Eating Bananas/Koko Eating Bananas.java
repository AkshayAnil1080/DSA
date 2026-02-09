video solution - https://youtu.be/ARSqG8Lst3g

// brute
class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
         int high=arr[0];
         for(int x : arr){
             
             high = Math.max(high, x);
         }
       for(int i =1; i<=high; i++){
             if(helper(arr,i)<=k){
                 return i;
             }
         }
         return 0;
         
    }
    int helper(int arr[], int m){
        int cnt=0;
        for(int x : arr ){
            if(x%m==0)
            cnt += x/m;
            else cnt+= (x/m)+1;
        }
        return cnt;
    }
    
}
// better

class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
         int low=1, high=arr[0];
         for(int x : arr){
             low = Math.min(low, x);
             high = Math.max(high, x);
         }
        //  int ans=0;
         while(low<high){
             int mid= (low+high)/2;
             
             if(helper(arr, mid)<=k){
                 high=mid;
                //  ans=mid;
             }
             else low=mid+1;
         }
         return low; // low ==high
         
    }
    int helper(int arr[], int m){
        int cnt=0;
        for(int x : arr ){
            if(x%m==0)
            cnt += x/m;
            else cnt+= (x/m)+1;
        }
        return cnt;
    }
    
}
